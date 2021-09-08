package com.example.rest312.service;


import com.example.rest312.model.User;

import java.util.List;

public interface UserService {

    List<User> allUsers();

    User get(int id);

    void add(User user);

    void delete(int id);

    void update(User user);

    User getUserByUsername(String username);

    User getUserById(int id);

}