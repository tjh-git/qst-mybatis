package com.tjh.entity;

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
 * @Date: 2021/8/12 10:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int uid;
    private String uname;
}
