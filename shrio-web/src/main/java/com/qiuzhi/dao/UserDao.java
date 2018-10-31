package com.qiuzhi.dao;

import com.vo.User;

import java.util.List;

public interface UserDao {

    User getUserPassword(String username);

    List<String> getRolesByUserName(String userName);

    List<String> getPermissionbyUserName(String userName);
}
