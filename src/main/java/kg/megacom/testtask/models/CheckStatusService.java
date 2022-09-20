package kg.megacom.testtask.models;

import kg.megacom.testtask.models.entries.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CheckStatusService {

    Date timestamp;
    List<User> user;

}
