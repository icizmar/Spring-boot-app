package com.learning.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = {"default", "english"})
public class HelloWorldEnglishImpl implements HelloWorldService {

    public String sayGreeting() {
        return "Hello world";
    }
}
