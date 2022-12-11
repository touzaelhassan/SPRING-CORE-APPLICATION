package com.application.services.classes;

import com.application.repositories.interfaces.UserRepositoryInterface;
import com.application.services.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userServiceBean")
public class UserServiceClass implements UserServiceInterface {

    private UserRepositoryInterface userRepositoryBean;

    @Autowired
    public UserServiceClass( @Qualifier("userRepositoryBean") UserRepositoryInterface userRepositoryBean) { this.userRepositoryBean = userRepositoryBean; }

    @Override
    public String getUser() { return userRepositoryBean.getUser() ; }

}
