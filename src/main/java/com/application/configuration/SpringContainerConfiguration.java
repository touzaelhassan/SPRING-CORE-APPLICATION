package com.application.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.application.repositories.classes", "com.application.services.classes","com.application.controllers"})
public class SpringContainerConfiguration { }
