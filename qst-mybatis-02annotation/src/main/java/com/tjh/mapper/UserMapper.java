package com.tjh.mapper;

import com.tjh.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * #Description <code>UserMapper</code>
 * <p>
 *
 * @author tjh
 * @version 1.0
 * @Date: 2021/8/10 14:32
 */

public interface UserMapper {
    @Select("select * from webuser")
    List<User> getUserList();

    @Select("select * from webuser where id=#{id}")
    User getUserById(int id);

    @Select("select * from webuser where id=#{id}")
    User getUserByUser(User user);



}
