package com.learning;

import com.learning.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(SpringBootAppApplication.class, args);
        GreetingController controller = (GreetingController) appContext.getBean("greetingController");
        System.out.println(controller.seyHello());
    }

}
