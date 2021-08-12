package com.tjh.service;

import com.tjh.entity.User;

import java.util.List;

/**
 * #Description <code>UserService</code>
 * <p>
 *
 * @author tjh
 * @version 1.0
 * @Date: 2021/8/12 10:40
 */
public interface UserService {
    List<User> getUserLike(String str);

    List<User> getUserList() throws Exception;

    void insertUser(User user) throws Exception;

    void delUserById(int id) throws Exception;

    void updateUser(User user) throws Exception;


}
