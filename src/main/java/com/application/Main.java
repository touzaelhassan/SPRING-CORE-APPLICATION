package com.application;

import com.application.services.interfaces.ProductServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductServiceInterface productServiceClass = (ProductServiceInterface) context.getBean("productServiceClass");

        System.out.println(productServiceClass.test());

    }

}