package com.educaweb.projeto.Controller;

import com.educaweb.projeto.Entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"vitor","vitor@gmail.com","4598375761","12345");
        return ResponseEntity.ok().body(u);
    }
}
