package com.qiuzhi.realm;

import com.qiuzhi.dao.UserDao;
import com.vo.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.*;

public class CustomRealm extends AuthorizingRealm {
    private final static Log logger = LogFactory.getLog(CustomRealm.class);
    @Resource
    private UserDao userDao;
    

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 获取认证信息

        //获取用户名
        String userName = (String)authenticationToken.getPrincipal();

        String password = getUserPassword(userName);

        if(password == null){
            return null;
        }

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userName,password,"customRealm");

        return simpleAuthenticationInfo;
    }






    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 模拟授权过程

        String userName = (String)principalCollection.getPrimaryPrincipal();

        Set<String> roleSet = getRolesByUserName(userName);

        Set<String> permissionSet = getPermissionbyUserName(userName);

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        // 设置权限
        simpleAuthorizationInfo.setStringPermissions(permissionSet);

        // 设置角色
        simpleAuthorizationInfo.setRoles(roleSet);

       return simpleAuthorizationInfo;
    }


    /** 模拟从缓存获取密码 之后改成redis中获取密码 TODO
     * @author qiuzhi
     * @param userName
     * @return
     */
    private String getUserPassword(String userName){
        User user = userDao.getUserPassword(userName);
        if(user != null){
            logger.info("password:" + user.getPassword());
            return user.getPassword();
        }
        return null;
    }


    /** 模拟从缓存获取角色 之后改成redis中获取 TODO
     * @author qiuzhi
     * @param userName
     * @return
     */
    private Set<String> getRolesByUserName(String userName){
        logger.info("从数据库中获取授权数据");
        List<String> list = userDao.getRolesByUserName(userName);
        Set<String > set = new HashSet<>(list);
        logger.info("roles:" + set);
        return set;
    }


    /** 模拟从缓存获取角色权限 之后改成redis中获取 TODO
     * @author qiuzhi
     * @param userName
     * @return
     */
    private Set<String> getPermissionbyUserName(String userName){
        List<String> list = userDao.getPermissionbyUserName(userName);
        Set<String > set = new HashSet<String>(list);
        logger.info("PermissionList:" + set);
        return set;
    }
}
