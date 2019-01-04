package com.infancy.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infancy.jpa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}