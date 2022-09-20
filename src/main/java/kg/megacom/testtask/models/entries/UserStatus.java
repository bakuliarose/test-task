package kg.megacom.testtask.models.entries;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "user_status")
public class UserStatus {

    @Id
    @GeneratedValue
    Long id;
    String userId;
    Date timestamp;
    Long StatusId;

    @JoinColumn(name = "user_id")
    User user;

}
