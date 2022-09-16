package kg.megacom.testtask.services;

import kg.megacom.testtask.models.User;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

    User save(User user);
    User getById(Long id);
    User update(User user);

    default User addUser(User user, MultipartFile file){
        return null;
    }
}