package com.palle.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.palle.entity.User;
import com.palle.service.UserService;

@RestController
@RequestMapping("/users")
public class Usercontroller {

    @Autowired
    private UserService service;

    // Home check API
    @GetMapping("/")
    public String home() {
        return "Application is running!";
    }

    // POST - Add user
//    @PostMapping
//    public User addUser(@RequestBody User user) {
//        return service.insertUser(user);
//    }
    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.insertUser(user);
    }

    // GET - All users
    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // GET - User by ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return service.getUserById(id);
    }

    // DELETE - Remove user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteUser(id);
    }
}