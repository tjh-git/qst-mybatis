package com.tjh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * #Description <code>User</code>
 * <p>
 *
 * @author tjh
 * @version 1.0
 * @Date: 2021/8/9 18:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private int age;
    private int isdel;
}
