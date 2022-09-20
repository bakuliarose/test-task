package kg.megacom.testtask.models.dtos;

import kg.megacom.testtask.models.entries.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserStatusDto {
    Long id;
    String userId;
    Date timestamp;
    Long StatusId;
    User user;
}
