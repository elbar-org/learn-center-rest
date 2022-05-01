package elbar.company.learn_center_rest.service.auth.payment;

import elbar.company.learn_center_rest.criteria.auth.payment.PaymentCriteria;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentCreateDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentDetailDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentGetDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentUpdateDTO;
import elbar.company.learn_center_rest.service.GenericCUDService;
import elbar.company.learn_center_rest.service.GenericGLDService;

import java.util.UUID;

public interface PaymentService extends GenericCUDService<PaymentCreateDTO, PaymentUpdateDTO, UUID>, GenericGLDService<PaymentGetDTO, PaymentDetailDTO, PaymentCriteria, UUID> {
}
