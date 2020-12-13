package com.jwtlagi.jwtmore.repository;

import com.jwtlagi.jwtmore.model.User;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
/*
    Optional<User> findUserByName(String name);
    Boolean userExistByName(String name);
    Boolean userExistByEmail(String email);
    */


    Optional<User> findByName(String name);
    Boolean existsByName(String name);
    Boolean existsByEmail(String email);




}
