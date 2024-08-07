package com.educaweb.projeto.Service;

import com.educaweb.projeto.Entity.User;
import com.educaweb.projeto.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = this.userRepository.findById(id);
        return obj.get();
    }
}
