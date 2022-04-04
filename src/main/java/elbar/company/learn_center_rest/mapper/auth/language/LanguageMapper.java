package elbar.company.learn_center_rest.mapper.auth.language;

import elbar.company.learn_center_rest.dto.auth.language.LanguageCreateDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageDetailDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageGetDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.language.Language;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface LanguageMapper extends GenericMapper<LanguageCreateDTO, LanguageUpdateDTO, LanguageGetDTO, LanguageDetailDTO, Language> {
    @Override
    Language toCreateDTO(LanguageCreateDTO DTO);

    @Override
    LanguageCreateDTO fromCreateDTO(Language entity);

    @Override
    Language toUpdateDTO(LanguageUpdateDTO DTO);

    @Override
    LanguageUpdateDTO fromUpdateDTO(Language entity);

    @Override
    Language toGetDTO(LanguageGetDTO DTO);

    @Override
    LanguageGetDTO fromGetDTO(Language entity);

    @Override
    List<Language> toGetListDTO(List<LanguageGetDTO> DTO);

    @Override
    List<LanguageGetDTO> fromGetListDTO(List<Language> entity);

    @Override
    Language toDetailDTO(LanguageDetailDTO DTO);

    @Override
    LanguageDetailDTO fromDetailDTO(Language entity);
}
