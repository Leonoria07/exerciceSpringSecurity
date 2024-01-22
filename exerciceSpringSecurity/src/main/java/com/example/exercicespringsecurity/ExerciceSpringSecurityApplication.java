package com.example.exercicespringsecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ExerciceSpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciceSpringSecurityApplication.class, args);
        UserService.createAdminUser("filsDuBoss","weshDu91");
    }

}
