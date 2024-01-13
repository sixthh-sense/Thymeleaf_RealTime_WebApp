package net.javaguides.thymeleaftutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // this class becomes a spring mvc controller
public class HelloWorldController {
    // handler method to handle /helloworld request
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "hello-world";
    }
}
