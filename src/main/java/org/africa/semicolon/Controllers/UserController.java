package org.africa.semicolon.Controllers;

import org.africa.semicolon.Data.Repositories.UserRepository;
import org.africa.semicolon.Services.UserService;
import org.africa.semicolon.dtos.RegisterUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
@Autowired
    UserService userService;

@PostMapping("/register")
    public Object register(@RequestBody RegisterUserRequest registerUserRequest){
       return userService.register(registerUserRequest);

    }
@GetMapping("/user/{userId}")
    public Object findUserById(@PathVariable String userId) {
        return userService.findUserById(userId);
    }


@DeleteMapping("/user/{userId}")
    public Object deleteUserByUserId(@PathVariable String userId) {
        return userService.deleteUserByUserId(userId) ;
    }

}
