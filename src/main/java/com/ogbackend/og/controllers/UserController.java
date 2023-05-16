package com.ogbackend.og.controllers;

import com.ogbackend.og.models.UserModel;
import com.ogbackend.og.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id){
        return this.userService.getUserById(id);
    }

    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request, @PathVariable Long id){
        return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public Boolean deleteById(@PathVariable Long id){
        return this.userService.deleteUser(id);
    }
}
