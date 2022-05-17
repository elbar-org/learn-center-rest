package elbar.company.learn_center_rest.controller.auth.language;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.auth.language.LanguageCriteria;
import elbar.company.learn_center_rest.dto.auth.language.LanguageCreateDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageDetailDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageGetDTO;
import elbar.company.learn_center_rest.dto.auth.language.LanguageUpdateDTO;

import java.util.UUID;

public interface LanguageController extends GenericCUDController<LanguageCreateDTO, LanguageUpdateDTO, UUID>, GenericGLDController<LanguageGetDTO, LanguageDetailDTO, LanguageCriteria, UUID> {
}
