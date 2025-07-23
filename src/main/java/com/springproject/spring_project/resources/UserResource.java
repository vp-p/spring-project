package com.springproject.spring_project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.spring_project.User;

@RestController
@RequestMapping(value = "/users" )
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Júlia", "usuario Júlia", "julia@email.com", "1111111", "1234");
        return ResponseEntity.ok().body(u);
    }


}
    