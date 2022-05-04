package elbar.company.learn_center_rest.service.system.tag;

import elbar.company.learn_center_rest.criteria.system.tag.TagCriteria;
import elbar.company.learn_center_rest.dto.system.tag.TagCreateDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagDetailDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagGetDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface TagService extends GenericCUDService<TagCreateDTO, TagUpdateDTO, UUID>, GenericGLDService<TagGetDTO, TagDetailDTO, TagCriteria, UUID> {
}
