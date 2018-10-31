package com.qiuzhi.dao.impl;

import com.qiuzhi.dao.UserDao;
import com.vo.User;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserPassword(String username) {

        String sql  = "select username,password from users where username = ?";
        List<User> users = jdbcTemplate.query(sql, new String[]{username}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
               User user = new User();
               user.setUsername(resultSet.getString("username"));
               user.setPassword(resultSet.getString("password"));
               return user;
            }

        });

        if(CollectionUtils.isEmpty(users)){
            return null;
        }

        return users.get(0);
    }

    @Override
    public List<String> getRolesByUserName(String userName) {

        String sql = "select  role_name from user_roles where username = ?";

        return jdbcTemplate.query(sql, new String[]{userName}, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getString("role_name");
            }
        });
    }

    @Override
    public List<String> getPermissionbyUserName(String userName) {
        String sql = "select permission from user_roles ur, roles_permissions rp where ur.role_name = rp.role_name and ur.username = ? ";
        return jdbcTemplate.query(sql, new String[]{userName}, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getString("permission");
            }
        });
    }


}
