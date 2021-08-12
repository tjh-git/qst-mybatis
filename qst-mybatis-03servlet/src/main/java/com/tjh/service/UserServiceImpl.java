package com.tjh.service;

import com.tjh.entity.User;
import com.tjh.mapper.UserMapper;
import com.tjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * #Description <code>UserServiceImpl</code>
 * <p>
 *
 * @author tjh
 * @version 1.0
 * @Date: 2021/8/12 10:41
 */
public class UserServiceImpl implements UserService {
    private static SqlSession sqlSession = MybatisUtils.getSqlSession();
    private static UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    @Override
    public List<User> getUserLike(String str) {
        List<User> list = mapper.getUserLike(str);
        return list == null ? null : list;
    }

    @Override
    public List<User> getUserList() throws Exception {
        return mapper.getUserList();
    }

    @Override
    public void insertUser(User user) throws Exception {
        mapper.insertUser(user);
    }

    @Override
    public void delUserById(int id) throws Exception {
        mapper.delUserById(id);
    }

    @Override
    public void updateUser(User user) throws Exception {
        mapper.updateUser(user);
    }
}
