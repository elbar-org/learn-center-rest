package elbar.company.learn_center_rest.service.auth.language;

import elbar.company.learn_center_rest.criteria.auth.language.LanguageCriteria;
import elbar.company.learn_center_rest.dto.auth.language.LanguageCreateDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageDetailDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageGetDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface LanguageService extends GenericCUDService<LanguageCreateDTO, LanguageUpdateDTO, UUID>, GenericGLDService<LanguageGetDTO, LanguageDetailDTO, LanguageCriteria, UUID> {
}
