package com.example.shardingjdbc.mapper;

import com.example.shardingjdbc.entity.User;

import java.util.List;

/**
 * @Auther: Tinko
 * @Date: 2018/12/19 16:23
 * @Description:
 */
public interface UserMapper {

    void insert(User user);

    List<User> loadOrder(Long userId);
}
