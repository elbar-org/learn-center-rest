package elbar.company.learn_center_rest.controller.system.tag;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.system.tag.TagCriteria;
import elbar.company.learn_center_rest.dto.system.tag.TagCreateDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagDetailDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagGetDTO;
import elbar.company.learn_center_rest.dto.system.tag.TagUpdateDTO;

import java.util.UUID;

public interface TagController extends GenericCUDController<TagCreateDTO, TagUpdateDTO, UUID>, GenericGLDController<TagGetDTO, TagDetailDTO, TagCriteria, UUID> {
}
