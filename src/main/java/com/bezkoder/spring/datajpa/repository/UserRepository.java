package com.bezkoder.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
