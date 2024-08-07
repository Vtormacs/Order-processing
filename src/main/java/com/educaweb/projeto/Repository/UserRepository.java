package com.educaweb.projeto.Repository;

import com.educaweb.projeto.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
