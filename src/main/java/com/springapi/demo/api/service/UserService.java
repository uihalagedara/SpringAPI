package com.springapi.demo.api.service;

import com.springapi.demo.api.model.User;
import com.springapi.demo.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User addUser(User user){

        return userRepo.save(user);
    }

    public List<User> getUsers(){
        return userRepo.findAll();
    }

}
