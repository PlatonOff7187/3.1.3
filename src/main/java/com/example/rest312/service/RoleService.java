package com.example.rest312.service;

import com.example.rest312.model.Role;
import com.example.rest312.model.User;

import java.util.List;

public interface RoleService {

    Role getRoleByName(String name);

    void add(Role role);

    List<Role> allRoles();

    void setupRoles(User user);
}