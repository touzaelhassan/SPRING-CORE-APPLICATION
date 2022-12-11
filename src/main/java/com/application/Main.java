package com.application;

import com.application.services.interfaces.UserServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserServiceInterface userServiceBean = context.getBean("userServiceBean", UserServiceInterface.class);

        System.out.println(userServiceBean.getUser());
    }

}