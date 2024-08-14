package com.educaweb.projeto.Service;

import com.educaweb.projeto.Entity.User;
import com.educaweb.projeto.Repository.UserRepository;
import com.educaweb.projeto.Service.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        try {
            return this.userRepository.findAll();
        } catch (Exception e) {
            System.out.println("Erro ao buscar todos os usuarios: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    public User findById(Long id) {
        Optional<User> user = this.userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User save(User user) {
        try {
            return this.userRepository.save(user);
        } catch (Exception e) {
            System.out.println("Erro ao salvar o usuario: " + e.getMessage());
            return new User();
        }
    }

    public User update(User user, Long id) {
        try {
            user.setId(id);
            return this.userRepository.save(user);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o usuario: " + e.getMessage());
            return new User();
        }
    }

    public String delete(Long id) {
        try {
            this.userRepository.deleteById(id);
            return "Deletado";
        } catch (Exception e) {
            return "Erro ao deletar usuario";
        }
    }
}
