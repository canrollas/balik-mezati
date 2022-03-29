package com.example.latest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LatestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LatestApplication.class, args);
    }

    @GetMapping("/")
    public String selamla(){
        return "Merhaba burası applikasyonun landing page bilgileridir";
    }

    @GetMapping("/userbilgisiBastır")
    public String userBastir(){
        CooperativeMember member = new CooperativeMember("Can","Rollas","jaspofasjo");
        return member.toString();
    }

}
