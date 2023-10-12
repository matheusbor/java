package com.example.Primeiro_projeto_java_todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class user_controller {
    
    @PostMapping("/")
    public void create(@RequestBody user_template user_template){
        System.out.println(user_template.name);

    }
}
