import com.tjh.mapper.UserMapper;
import com.tjh.pojo.User;
import com.tjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * #Description <code>Test</code>
 * <p>
 *
 * @author tjh
 * @version 1.0
 * @Date: 2021/8/11 11:08
 */
public class Test {
    static private SqlSession sqlSession = MybatisUtils.getSqlSession();
    static UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    @org.junit.Ignore
    public void getUserList(){
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void getUserById(){
        User user = mapper.getUserById(1);
        User userByUser = mapper.getUserByUser(user);
        System.out.println(userByUser);
    }
}
