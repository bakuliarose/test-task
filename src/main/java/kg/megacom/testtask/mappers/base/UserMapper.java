package kg.megacom.testtask.mappers.base;

import kg.megacom.testtask.mappers.CrudMapper;
import kg.megacom.testtask.models.dtos.UserDto;
import kg.megacom.testtask.models.dtos.requests.UserRequest;
import kg.megacom.testtask.models.entries.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface UserMapper extends CrudMapper<User, UserDto> {

   UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    @Mapping(source = "userId", target = "user_id")
    @Mapping(source = "name", target = "title")
    User userRequestToUser(UserRequest userRequest);

}
