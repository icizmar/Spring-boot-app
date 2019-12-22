package com.learning.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "spanish")
public class HelloWorldSpanishImpl implements HelloWorldService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo";
    }
}
