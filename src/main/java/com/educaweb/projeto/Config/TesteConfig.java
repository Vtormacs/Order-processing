package com.educaweb.projeto.Config;

import com.educaweb.projeto.Entity.Category;
import com.educaweb.projeto.Entity.Enum.OrderStatus;
import com.educaweb.projeto.Entity.Order;
import com.educaweb.projeto.Entity.Product;
import com.educaweb.projeto.Entity.User;
import com.educaweb.projeto.Repository.CategoryRepository;
import com.educaweb.projeto.Repository.OrderRepository;
import com.educaweb.projeto.Repository.ProductRepository;
import com.educaweb.projeto.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Vitor Eduardo Lopes Francisco", "vitor@gmail.com", "45998375761", "123456");
        this.userRepository.saveAll(Arrays.asList(u1, u2, u3));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o4 = new Order(null, Instant.parse("2019-08-21T15:21:42Z"), OrderStatus.CANCELED, u3);
        this.orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        this.categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
        this.productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

    }
}

//Essa classe Java, `TesteConfig`, é uma configuração específica para execução de testes (`@Profile("test")`) em uma aplicação Spring Boot.
// Ela implementa a interface `CommandLineRunner`, o que significa que o método `run` será automaticamente chamado quando a aplicação iniciar.
// Dentro do método `run`, são criados dois objetos `User` (`u1` e `u2`) com informações simuladas (nome, email, telefone e senha) e são salvos no banco de dados através do `UserRepository`.
//O propósito dessa classe é inicializar dados de teste no banco de dados durante a fase de inicialização da aplicação, o que é útil para testes de integração ou para garantir que a aplicação funcione corretamente com dados iniciais predefinidos.