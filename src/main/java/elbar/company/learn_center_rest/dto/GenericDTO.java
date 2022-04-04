package elbar.company.learn_center_rest.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GenericDTO implements BaseDTO {
    private UUID code;
}
