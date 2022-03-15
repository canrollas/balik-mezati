package com.example.springboootfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoootFilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoootFilesApplication.class, args);
    }
    @GetMapping(value = "/")
    public String bringSomeCoffe() {
        return "Hello, can i get some coffe?";
    }

    @GetMapping(value = "/ankara")
    public String sayHiToVisiters() {
        return "Hello, World!";
    }
}
