package com.application.configuration;

import com.application.controllers.UserController;
import com.application.repositories.classes.UserRepositoryClass;
import com.application.services.classes.UserServiceClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContainerConfiguration {

   @Bean
    public UserRepositoryClass userRepositoryBean(){ return new UserRepositoryClass(); }

    @Bean
    public UserServiceClass userServiceBean(){return new UserServiceClass(userRepositoryBean()); }

    @Bean
    public UserController userControllerBean(){ return new UserController(); }

}
