package com.example.jwt.repository;

import com.example.jwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

    @Query("select m from User m join fetch m.authorities a where m.username = :username")
    Optional<User> findByUsernameWithAuthority(String username);
}