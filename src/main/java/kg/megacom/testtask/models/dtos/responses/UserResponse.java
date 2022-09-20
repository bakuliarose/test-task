package kg.megacom.testtask.models.dtos.responses;

import kg.megacom.testtask.models.dtos.UserDto;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

 @Data
 @FieldDefaults(level = AccessLevel.PRIVATE)
 public class UserResponse {

     UserDto user;
 }
