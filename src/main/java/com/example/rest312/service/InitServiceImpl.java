package com.example.rest312.service;

import com.example.rest312.model.Role;
import com.example.rest312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitServiceImpl implements InitService {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public InitServiceImpl(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Override
    public void initServiceImpl() {
        User user = new User();

        if (roleService.allRoles().size() == 0) {            // roles initialization
            Role adminRole = new Role("ROLE_ADMIN");
            Role userRole = new Role("ROLE_USER");
            roleService.add(adminRole);
            roleService.add(userRole);

        }

        if (userService.allUsers().size() == 0) {            // admin initialization
            user.setUsername("admin");
            user.setPassword("admin");
            user.setAge(1);
            Set<Role> roles = new HashSet<>();
            roles.add(roleService.getRoleByName("ROLE_ADMIN"));
            user.setRoles(roles);
            userService.add(user);
        }
    }
}