package elbar.company.learn_center_rest.mapper.system.transaction;

import elbar.company.learn_center_rest.dto.system.transaction.TransactionCreateDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionDetailDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionGetDTO;
import elbar.company.learn_center_rest.dto.system.transaction.TransactionUpdateDTO;
import elbar.company.learn_center_rest.entity.system.transaction.Transaction;
import elbar.company.learn_center_rest.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface TransactionMapper extends GenericMapper<TransactionCreateDTO, TransactionUpdateDTO, TransactionGetDTO, TransactionDetailDTO, Transaction> {
}
