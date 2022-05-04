package elbar.company.learn_center_rest.mapper.system.transaction_status;

import elbar.company.learn_center_rest.dto.system.transaction.TransactionCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusDetailDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusGetDTO;
import elbar.company.learn_center_rest.dto.system.transaction_status.TransactionStatusUpdateDTO;
import elbar.company.learn_center_rest.entity.system.transaction_status.TransactionStatus;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface TransactionStatusMapper extends GenericMapper<TransactionStatusCreateDTO, TransactionStatusUpdateDTO, TransactionStatusGetDTO, TransactionStatusDetailDTO, TransactionStatus> {
}
