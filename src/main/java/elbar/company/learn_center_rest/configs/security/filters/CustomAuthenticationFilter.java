package elbar.company.learn_center_rest.configs.security.filters;

import com.auth0.jwt.JWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenCreateDTO;
import elbar.company.learn_center_rest.dto.auth.token.AuthTokenGetDTO;
import elbar.company.learn_center_rest.dto.auth.user.AuthUserLoginDTO;
import elbar.company.learn_center_rest.entity.auth.session.SessionUser;
import elbar.company.learn_center_rest.enums.auth.AuthTokenTypeEnum;
import elbar.company.learn_center_rest.response.ApplicationError;
import elbar.company.learn_center_rest.response.Data;
import elbar.company.learn_center_rest.service.auth.token.AuthTokenService;
import elbar.company.learn_center_rest.utils.jwt.JWTUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private final AuthTokenService authTokenService;
    private final AuthenticationManager authenticationManager;

    public CustomAuthenticationFilter(AuthTokenService authTokenService, AuthenticationManager authenticationManager) {
        this.authTokenService = authTokenService;
        this.authenticationManager = authenticationManager;
        super.setFilterProcessesUrl("/api/v1/login");
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            AuthUserLoginDTO dto = new ObjectMapper().readValue(request.getReader(), AuthUserLoginDTO.class);
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword());
            return authenticationManager.authenticate(token);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentic) throws IOException, ServletException {
        SessionUser user = (SessionUser) authentic.getPrincipal();
        Date accessDate = JWTUtils.getExpiry();
        Date refreshDate = JWTUtils.getExpiryForRefreshToken();

        String accessToken = JWT.create().withSubject(user.getCode().toString()).withExpiresAt(accessDate).withIssuer(request.getRequestURL().toString()).withClaim("roles", user.getAuthorities().stream().toList()).sign(JWTUtils.getAlgorithm());
        String refreshToken = JWT.create().withSubject(user.getCode().toString()).withExpiresAt(refreshDate).withIssuer(request.getRequestURL().toString()).sign(JWTUtils.getAlgorithm());

        AuthTokenCreateDTO tokenCreateDTO1 = new AuthTokenCreateDTO(user.getCode(), accessToken, accessDate, AuthTokenTypeEnum.ACCESS_TOKEN.name());
        AuthTokenCreateDTO tokenCreateDTO2 = new AuthTokenCreateDTO(user.getCode(), refreshToken, refreshDate, AuthTokenTypeEnum.REFRESH_TOKEN.name());

        authTokenService.create(tokenCreateDTO1);
        authTokenService.create(tokenCreateDTO2);

        AuthTokenGetDTO tokenGetDTO1 = new AuthTokenGetDTO(AuthTokenTypeEnum.ACCESS_TOKEN.name(), accessToken);
        AuthTokenGetDTO tokenGetDTO2 = new AuthTokenGetDTO(AuthTokenTypeEnum.REFRESH_TOKEN.name(), refreshToken);
        List<AuthTokenGetDTO> tokenGetDTOList = new ArrayList<>();
        tokenGetDTOList.add(tokenGetDTO1);
        tokenGetDTOList.add(tokenGetDTO2);

        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        new ObjectMapper().writeValue(response.getOutputStream(), tokenGetDTOList);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        Data<ApplicationError> errorData = new Data<>(new ApplicationError(failed.getMessage(), request.getRequestURL().toString(), HttpStatus.INTERNAL_SERVER_ERROR));
        errorData.setSuccess(false);
        new ObjectMapper().writeValue(response.getOutputStream(), errorData);
    }
}
