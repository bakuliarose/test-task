package kg.megacom.testtask.models.dtos.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

public class UserRequest {
    @Data
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public class TaskRequest {
        Long userId;
        Long statusId;

        @JsonFormat(pattern = "dd.MM.yyyy")
        List<Date> timestamp;

    }

}
