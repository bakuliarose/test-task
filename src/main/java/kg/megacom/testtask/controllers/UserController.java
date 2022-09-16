package kg.megacom.testtask.controllers;

import kg.megacom.testtask.enums.Status;
import kg.megacom.testtask.models.User;
import kg.megacom.testtask.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    private User addUser(@RequestBody User user){
        return userService.save(user);
    }

    @PostMapping("/add/file")
    private User addImageToUser(@RequestParam Long userId, @RequestPart MultipartFile file) {
        User user = userService.getById(userId);
        return userService.addUser(user, file);
    }

    @GetMapping("/get")
    public CheckStatusResponse getUsers(@RequestParam(required = false, defaultValue = "ONLINE") Status status,
                                         @RequestParam(required = false) Date date) {
        //date -> long
        //dobavit obekt UserTimestamp(Long id, User, Long timestamp)
        //if(status == "" && date == null){
    }
}
