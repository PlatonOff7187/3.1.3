package com.example.rest312.dao;


import com.example.rest312.model.User;

import java.util.List;

public interface UserDao {

    List<User> allUsers();

    User get(int id);

    void add(User user);

    void delete(int id);

    void update(User user);

    User getUserByUsername(String username);
    User findUserByUsernameFetchRoles(String username);
    User findByIdFetchRoles(int id);

}