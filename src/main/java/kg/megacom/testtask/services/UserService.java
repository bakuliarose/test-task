package kg.megacom.testtask.services;

import kg.megacom.testtask.models.entries.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public interface UserService {

    User save(User user);
    User getById(Long id);
    User update(User user);

    default User addUser(User user, MultipartFile file){
        return null;
    }

    User save(User status, Date timestamp);

    void delete();

    void delete(User user);
}