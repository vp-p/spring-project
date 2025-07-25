package com.springproject.spring_project.repopsitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.spring_project.entitites.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
