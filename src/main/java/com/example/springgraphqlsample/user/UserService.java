package com.example.springgraphqlsample.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springgraphqlsample.user.entity.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> listUser() {
        return userRepository.findAll();
    }

    public User create(String firstName, String lastName, String email, String password) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);

        return userRepository.save(user);
    }

    public User findById(Integer userId) {
        System.out.println(userId);
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
    }
}