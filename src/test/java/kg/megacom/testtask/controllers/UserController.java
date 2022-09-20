package kg.megacom.testtask.controllers;

import kg.megacom.testtask.models.entries.User;
import kg.megacom.testtask.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    private User addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("/add/file")
    private User addImageToUser(@RequestParam Long userId, @RequestPart MultipartFile file) {
        User user = userService.getById(userId);
        return userService.addUser(user, file);
    }

    @GetMapping("/get")
    public User getUsers(@RequestParam(required = false, defaultValue = "ONLINE") User status,
                         @RequestParam(required = false) Date date) {


        Date timestamp;
        addUser(Status status, Date timestamp);
        if (status = "online",  date = timestamp) {
            return userService.save(status, timestamp);
        else{
                return userService.addUser(status, timestamp);
            }
        }
    }
}
