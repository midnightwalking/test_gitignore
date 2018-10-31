package test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

public class AuthenticationTest {

//    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();
//
//    @Before
//    public void setAccount(){
//        simpleAccountRealm.addAccount("qiuzhi","123456","admin");
//    }
//
//    @Test
//    public void testAuthentication(){
//        // 环境搭建
//        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
//        defaultSecurityManager.setRealm(simpleAccountRealm);
//
//        //主体提交认证
//        SecurityUtils.setSecurityManager(defaultSecurityManager);
//        Subject subject = SecurityUtils.getSubject();
//
//        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("qiuzhi","123456");
//
//        subject.login(usernamePasswordToken);
//
//        // 打印是否认证
//        System.out.println("isAuthenticated:" + subject.isAuthenticated());
//
//        subject.checkRoles("admin1");
//    }
}
