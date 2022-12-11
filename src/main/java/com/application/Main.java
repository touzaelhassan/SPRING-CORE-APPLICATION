package com.application;

import com.application.services.interfaces.UserServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(com.application.configuration.SpringContainerConfiguration.class);

        UserServiceInterface userServiceBean = context.getBean("userServiceBean", UserServiceInterface.class);

        System.out.println(userServiceBean.getUser());
    }

}