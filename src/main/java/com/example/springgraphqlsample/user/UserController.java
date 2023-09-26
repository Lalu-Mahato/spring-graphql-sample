package com.example.springgraphqlsample.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.springgraphqlsample.user.entity.User;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @QueryMapping("findAll")
    public List<User> findAll() {
        return userService.listUser();
    }

    @MutationMapping("createUser")
    public User createNewUser(
            @Argument String firstName,
            @Argument String lastName,
            @Argument String email,
            @Argument String password) {
        return userService.create(firstName, lastName, email, password);
    }

    @QueryMapping("userById")
    public User findById(@Argument Integer userId) {
        return userService.findById(userId);
    }
}
