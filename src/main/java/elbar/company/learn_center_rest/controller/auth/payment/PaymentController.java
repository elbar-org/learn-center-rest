package elbar.company.learn_center_rest.controller.auth.payment;

import elbar.company.learn_center_rest.controller.GenericCUDController;
import elbar.company.learn_center_rest.controller.GenericGLDController;
import elbar.company.learn_center_rest.criteria.auth.payment.PaymentCriteria;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentCreateDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentDetailDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentGetDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentUpdateDTO;

import java.util.UUID;

public interface PaymentController extends GenericCUDController<PaymentCreateDTO, PaymentUpdateDTO, UUID>, GenericGLDController<PaymentGetDTO, PaymentDetailDTO, PaymentCriteria, UUID> {
}
