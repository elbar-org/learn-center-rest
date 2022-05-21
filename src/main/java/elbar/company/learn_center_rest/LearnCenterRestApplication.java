package elbar.company.learn_center_rest;

import elbar.company.learn_center_rest.properties.OpenApiProperties;
import elbar.company.learn_center_rest.properties.ServiceProperties;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@OpenAPIDefinition
@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties({OpenApiProperties.class, ServiceProperties.class})
@EntityScan(basePackages = "elbar.company.learn_center_rest.entity")
@EnableJpaRepositories(basePackages = "elbar.company.learn_center_rest.repository")
public class LearnCenterRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnCenterRestApplication.class, args);
    }

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource rs = new ResourceBundleMessageSource();
        rs.setBasenames("i18n/messages");
        rs.setDefaultEncoding("UTF-8");
        rs.setUseCodeAsDefaultMessage(true);
        return rs;
    }
}
