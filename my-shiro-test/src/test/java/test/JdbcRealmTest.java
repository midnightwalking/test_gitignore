package test;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class JdbcRealmTest  {

//    DruidDataSource dataSource = new DruidDataSource();
//    {
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//    }
//
//
//    @Test
//    public void jdbcIniRealm(){
//        JdbcRealm jdbcRealm = new JdbcRealm();
//        jdbcRealm.setDataSource(dataSource);
//        jdbcRealm.setPermissionsLookupEnabled(true);
//
//        String sql = "select password from test_user where username = ?";
//        jdbcRealm.setAuthenticationQuery(sql);
//
//        // 环境搭建
//        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
//        defaultSecurityManager.setRealm(jdbcRealm);
//
//        //主体提交认证
//        SecurityUtils.setSecurityManager(defaultSecurityManager);
//        Subject subject = SecurityUtils.getSubject();
//
//        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("xiaozhi","654321");
//
//        subject.login(usernamePasswordToken);
//
//        // 打印是否认证
//        System.out.println("isAuthenticated:" + subject.isAuthenticated());
//
////        subject.checkRoles("admin","group");
////
////
////        subject.checkPermission("user:delete");
//
//    }
}
