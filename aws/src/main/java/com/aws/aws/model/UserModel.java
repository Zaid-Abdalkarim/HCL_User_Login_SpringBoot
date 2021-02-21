package com.aws.aws.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;

    public UserModel(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(id, userModel.id) && Objects.equals(username, userModel.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }

    // @Override
    // public String toString() {
    // final StringBuilder sb = new StringBuilder("University{");
    // sb.append("id=").append(student_id);
    // sb.append(", name= '").append(name).append('\'');
    // sb.append(", university= '").append(university.getName()).append('\'');
    // sb.append(", degree= '").append(degree).append('\'');
    // sb.append('}');
    // return sb.toString();
    // }
}