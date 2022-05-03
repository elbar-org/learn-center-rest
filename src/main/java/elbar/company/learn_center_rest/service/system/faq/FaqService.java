package elbar.company.learn_center_rest.service.system.faq;

import elbar.company.learn_center_rest.criteria.system.faq.FaqCriteria;
import elbar.company.learn_center_rest.dto.system.faq.FaqCreateDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqDetailDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqGetDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface FaqService extends GenericCUDService<FaqCreateDTO, FaqUpdateDTO, UUID>, GenericGLDService<FaqGetDTO, FaqDetailDTO, FaqCriteria, UUID> {
}
