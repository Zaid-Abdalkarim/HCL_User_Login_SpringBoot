package com.aws.aws.Repo;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.aws.aws.model.UserModel;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepo extends CrudRepository<UserModel, Long> {
    Optional<UserModel> findByUsername(String username);
}
