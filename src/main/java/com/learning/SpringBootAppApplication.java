package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(SpringBootAppApplication.class, args);
        ConstructorBasedService constructorBasedService = (ConstructorBasedService) appContext.getBean("constructorBasedService");
        SetterBasedService setterBasedService = (SetterBasedService) appContext.getBean("setterBasedService");
        constructorBasedService.getMessage();
        setterBasedService.getMessage();
    }

}
