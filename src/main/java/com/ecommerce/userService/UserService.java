package com.ecommerce.userService;

import com.ecommerce.userEntity.User;

import java.util.Optional;

public interface UserService {
    void createuser(User user);

    Optional<User> getuser(Long Id);
}
