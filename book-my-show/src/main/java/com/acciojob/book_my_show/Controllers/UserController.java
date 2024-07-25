package com.acciojob.book_my_show.Controllers;

import com.acciojob.book_my_show.Requests.AddUserRequest;
import com.acciojob.book_my_show.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("addUser")
    public String addUser(@RequestBody AddUserRequest userRequest){

        return userService.addUser(userRequest);
    }
}
