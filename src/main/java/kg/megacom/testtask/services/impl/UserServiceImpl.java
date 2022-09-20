package kg.megacom.testtask.services.impl;

import kg.megacom.testtask.dao.UserRepo;
import kg.megacom.testtask.microservices.FileServiceFeign;
import kg.megacom.testtask.microservices.json.Response;
import kg.megacom.testtask.models.entries.User;
import kg.megacom.testtask.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo; //vnedrit6==integrate repository
    @Autowired
    private FileServiceFeign fileServiceFeign;

    @Override
    public User save(User user) {

        return userRepo.save(user);
    }

    @Override
    public User getById(Long id) {

        return userRepo.findById(id).orElse(null);
    }

    @Override
    public User update(User user) {
        if(userRepo.existsById(user.getId())) {
            return userRepo.save(user);
        }
        return null;
    }

    @Override
    public User addUser(User user, MultipartFile file) {
        Response response = fileServiceFeign.upload(file);
        user.setImageUri(response.getDownloadUri());

        return save(user);
    }

    @Override
    public User save(User status, Date timestamp) {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public void delete(User user) {

    }
}
