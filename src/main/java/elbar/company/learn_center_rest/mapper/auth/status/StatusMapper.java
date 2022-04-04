package elbar.company.learn_center_rest.mapper.auth.status;

import elbar.company.learn_center_rest.dto.auth.status.StatusCreateDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusDetailDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusGetDTO;
import elbar.company.learn_center_rest.dto.auth.status.StatusUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.status.Status;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface StatusMapper extends GenericMapper<StatusCreateDTO, StatusUpdateDTO, StatusGetDTO, StatusDetailDTO, Status> {

    @Override
    Status toCreateDTO(StatusCreateDTO DTO);

    @Override
    StatusCreateDTO fromCreateDTO(Status entity);

    @Override
    Status toUpdateDTO(StatusUpdateDTO DTO);

    @Override
    StatusUpdateDTO fromUpdateDTO(Status entity);

    @Override
    Status toGetDTO(StatusGetDTO DTO);

    @Override
    StatusGetDTO fromGetDTO(Status entity);

    @Override
    List<Status> toGetListDTO(List<StatusGetDTO> DTO);

    @Override
    List<StatusGetDTO> fromGetListDTO(List<Status> entity);

    @Override
    Status toDetailDTO(StatusDetailDTO DTO);

    @Override
    StatusDetailDTO fromDetailDTO(Status entity);
}
