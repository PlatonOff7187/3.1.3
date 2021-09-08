package com.example.rest312.dao;

import com.example.rest312.model.Role;

import java.util.List;

public interface RoleDao {
    Role getRoleByName(String name);

    void add(Role role);

    List<Role> allRoles();
}
