package kg.megacom.testtask.controllers;

import kg.megacom.testtask.enums.Status;
import kg.megacom.testtask.models.entries.User;
import kg.megacom.testtask.services.UserStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/userStatus")
public class UserStatusController {

    @Autowired
    private UserStatusService userStatusService;



    @PostMapping("/add")
    private User addUserStatus(@RequestBody Status status) {
        return userStatusService.save(status);
    }


    @PostMapping("/update")
     private User addStatusUpdates(@RequestBody Status status){
        return userStatusService.save(status);
        }






}
