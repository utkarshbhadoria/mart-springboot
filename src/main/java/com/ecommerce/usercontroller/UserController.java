package com.ecommerce.usercontroller;

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

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getuser(@PathVariable Long Id){
        Optional<User> user = userService.getuser(Id);
        return ResponseEntity.ok(user);

    }

    @PostMapping
    public ResponseEntity<User> createuser(@RequestBody User user){
        userService.createuser(user);

        return null;
    }

}
