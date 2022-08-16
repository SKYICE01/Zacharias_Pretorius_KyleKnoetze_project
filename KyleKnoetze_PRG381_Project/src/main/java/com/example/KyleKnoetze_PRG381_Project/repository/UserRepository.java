package com.example.KyleKnoetze_PRG381_Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.KyleKnoetze_PRG381_Project.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

