package com.educaweb.projeto.Config;

import com.educaweb.projeto.Entity.User;
import com.educaweb.projeto.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Vitor Eduardo Lopes Francisco", "vitor@gmail.com", "45998375761", "123456");

        this.userRepository.saveAll(Arrays.asList(u1,u2,u3));
    }
}

//Essa classe Java, `TesteConfig`, é uma configuração específica para execução de testes (`@Profile("test")`) em uma aplicação Spring Boot.
// Ela implementa a interface `CommandLineRunner`, o que significa que o método `run` será automaticamente chamado quando a aplicação iniciar.
// Dentro do método `run`, são criados dois objetos `User` (`u1` e `u2`) com informações simuladas (nome, email, telefone e senha) e são salvos no banco de dados através do `UserRepository`.
//O propósito dessa classe é inicializar dados de teste no banco de dados durante a fase de inicialização da aplicação, o que é útil para testes de integração ou para garantir que a aplicação funcione corretamente com dados iniciais predefinidos.