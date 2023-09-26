package com.example.springgraphqlsample.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springgraphqlsample.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
