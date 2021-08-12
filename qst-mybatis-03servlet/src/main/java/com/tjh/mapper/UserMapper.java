package com.tjh.mapper;

import com.tjh.entity.User;

import java.util.List;

/**
 * #Description <code>UserMapper</code>
 * <p>
 *
 * @author tjh
 * @version 1.0
 * @Date: 2021/8/12 10:30
 */

public interface UserMapper {
    List<User> getUserLike(String str);

    List<User> getUserList() throws Exception;

    void insertUser(User user) throws Exception;

    void delUserById(int id) throws Exception;

    void updateUser(User user) throws Exception;
}
