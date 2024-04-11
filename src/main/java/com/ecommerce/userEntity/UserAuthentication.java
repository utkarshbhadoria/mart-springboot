package com.ecommerce.userEntity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserAuthentication {

    private String username;
    private String password;

}
