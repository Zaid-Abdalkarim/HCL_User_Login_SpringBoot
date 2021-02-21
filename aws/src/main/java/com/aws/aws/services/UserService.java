package com.aws.aws.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.aws.aws.Repo.UserRepo;
import com.aws.aws.model.UserModel;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepo userRepo;

    @PersistenceContext
    private EntityManager entityManager;

    public UserModel addUser(UserModel userModel) {
        return userRepo.save(userModel);
    }

}
