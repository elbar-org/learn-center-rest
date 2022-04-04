package elbar.company.learn_center_rest.mapper;

import elbar.company.learn_center_rest.dto.BaseDTO;
import elbar.company.learn_center_rest.dto.GenericDTO;
import elbar.company.learn_center_rest.entity.BaseEntity;
import org.mapstruct.Mapping;

import java.util.List;

public interface GenericMapper<CD extends BaseDTO, UD extends GenericDTO, GD extends GenericDTO, DD extends GenericDTO, E extends BaseEntity> extends BaseMapper {
    E toCreateDTO(CD DTO);

    CD fromCreateDTO(E entity);

    E toUpdateDTO(UD DTO);

    UD fromUpdateDTO(E entity);

    E toGetDTO(GD DTO);

    GD fromGetDTO(E entity);

    List<E> toGetListDTO(List<GD> DTO);

    List<GD> fromGetListDTO(List<E> entity);

    E toDetailDTO(DD DTO);

    DD fromDetailDTO(E entity);
}
