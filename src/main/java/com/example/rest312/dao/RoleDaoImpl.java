package com.example.rest312.dao;

import com.example.rest312.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role getRoleByName(String name) {
        return entityManager
                .createQuery("select r from Role r where r.name = :name", Role.class)
                .setParameter("name", name)
                .getSingleResult();
    }


    @Override
    public void add(Role role) {
        entityManager.persist(role);
    }

    @Override
    public List<Role> allRoles() {
        return entityManager.createQuery("FROM Role", Role.class).getResultList();
    }
}