package test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class IniRealmTest {




//    @Test
//    public void testIniRealm(){
//        IniRealm iniRealm = new IniRealm("classpath:user.ini");
//
//        // 环境搭建
//        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
//        defaultSecurityManager.setRealm(iniRealm);
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
//        subject.checkRoles("fuckyou");
//
//        subject.checkPermission("user:delete");
//
//
//    }
}
