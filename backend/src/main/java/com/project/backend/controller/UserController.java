package com.project.backend.controller;

import com.project.backend.model.User;
import com.project.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    //Rest Api - create user -POST
    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        User user1 = userService.createUser(user);
        return user1;
    }

    //find users - GET
    @GetMapping("/users")
    public List<User> getUsers() {
        return  userService.getUsers();
    }

    //update user - PUT
    @PutMapping("/update/{id}")
    public User updateUserById(@RequestBody User user, @PathVariable("id") long id) {
        return userService.updateUser(user, id);
    }

    //delete user- DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }

    //find user by Id - GET
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }





}
