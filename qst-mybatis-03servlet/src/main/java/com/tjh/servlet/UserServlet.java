package com.tjh.servlet;

import com.tjh.entity.User;
import com.tjh.service.UserService;
import com.tjh.service.UserServiceImpl;
import lombok.SneakyThrows;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * #Description <code>UserServlet</code>
 * <p>
 *
 * @author tjh
 * @version 1.0
 * @Date: 2021/8/12 10:47
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("do");
        UserService userService = new UserServiceImpl();

        if ("selectAll".equals(action)) {
            toSelectAll(userService);
        } else if ("selectLike".equals(action)) {
            String str = "E";
            toSelectLike(userService, str);
        } else if ("insert".equals(action)) {
            toInsert(userService, new User(14, "uname"));
        } else if ("delete".equals(action)) {
            int id = 1;
            toDelete(userService, id);
        } else if ("update".equals(action)) {
            User user = new User();
            toUpdate(userService, user);
        }

    }

    private void toSelectLike(UserService userService, String str) {
        userService.getUserLike(str);
    }

    private void toDelete(UserService userService, int id) throws Exception {
        userService.delUserById(id);
    }

    private void toInsert(UserService userService, User user) throws Exception {
        userService.insertUser(user);
    }

    private void toSelectAll(UserService userService) throws Exception {
        List<User> list = userService.getUserList();
    }

    private void toUpdate(UserService userService, User user) throws Exception {
        userService.updateUser(user);
    }

}
