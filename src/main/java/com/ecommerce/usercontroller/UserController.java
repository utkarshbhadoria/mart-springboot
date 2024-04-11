package com.ecommerce.usercontroller;

import com.ecommerce.userEntity.UserAuthentication;
import com.ecommerce.userService.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.userEntity.User;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    // Injecting dependency using constructor+
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Optional<User>> getuser(@RequestBody UserAuthentication userAuthentication){
        Optional<User> user = userService.getuser();
        return ResponseEntity.ok(user);

    }

    @PostMapping
    public ResponseEntity<User> createuser(@RequestBody User user){
        userService.createuser(user);

        return null;
    }

}
