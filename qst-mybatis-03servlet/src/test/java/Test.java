import com.tjh.entity.User;
import com.tjh.service.UserService;
import com.tjh.service.UserServiceImpl;
import com.tjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * #Description <code>Teset</code>
 * <p>
 *
 * @author tjh
 * @version 1.0
 * @Date: 2021/8/12 10:39
 */
public class Test {
    private UserService userService = new UserServiceImpl();

    @org.junit.Test
    public void getUserList() throws Exception {
        List<User> list = userService.getUserList();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void getUserLike(){
        List<User> list = userService.getUserLike("E");
        for (User user : list) {
            System.out.println(user);
        }
    }

}
