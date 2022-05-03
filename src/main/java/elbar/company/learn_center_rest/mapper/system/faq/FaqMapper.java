package elbar.company.learn_center_rest.mapper.system.faq;

import elbar.company.learn_center_rest.dto.system.faq.FaqCreateDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqDetailDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqGetDTO;
import elbar.company.learn_center_rest.dto.system.faq.FaqUpdateDTO;
import elbar.company.learn_center_rest.entity.system.faq.Faq;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface FaqMapper extends GenericMapper<FaqCreateDTO, FaqUpdateDTO, FaqGetDTO, FaqDetailDTO, Faq> {
}
