package com.ecommerce.userService.impl;

import com.ecommerce.userEntity.User;
import com.ecommerce.userEntity.UserAuthentication;
import com.ecommerce.userRepository.userRepository;
import com.ecommerce.userService.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    public userRepository userRepository;

    public UserServiceImpl(userRepository userRepository ) {
        this.userRepository = userRepository;
    }

    @Override
    public void createuser(User user) {
        try{
            if(user!=null){
                userRepository.save(user);
            }
        }
        catch (Exception exception){
            System.out.println("-----NOT SAVED----");
        }

    }

    @Override
    public Optional<User> getuser(Long Id) {
        Optional<User> user = null;
        if (Id != null){
            user = userRepository.findById(Id);
        }
        return user;
    }

    @Override
    public User getuserbyusername(UserAuthentication userAuthentication) {
        String username = userAuthentication.getUsername();
        String password = userAuthentication.getPassword();
        User user = userRepository.findBy()
    }

}
