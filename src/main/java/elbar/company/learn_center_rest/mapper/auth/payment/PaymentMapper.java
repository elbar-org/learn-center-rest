package elbar.company.learn_center_rest.mapper.auth.payment;

import elbar.company.learn_center_rest.dto.auth.payment.PaymentCreateDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentDetailDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentGetDTO;
import elbar.company.learn_center_rest.dto.auth.payment.PaymentUpdateDTO;
import elbar.company.learn_center_rest.entity.auth.payment.AuthPayment;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PaymentMapper extends GenericMapper<PaymentCreateDTO, PaymentUpdateDTO, PaymentGetDTO, PaymentDetailDTO, AuthPayment> {
}
