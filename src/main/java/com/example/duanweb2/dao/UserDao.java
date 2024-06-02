package com.example.duanweb2.dao;


import com.example.duanweb2.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    void save(User user);
    
}
