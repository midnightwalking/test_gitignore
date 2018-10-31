package myrealm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomRealm extends AuthorizingRealm {

    Map<String,String> userMap = new HashMap<String, String>();

    {
        super.setName("customRealm");
        userMap.put("qiuzhi","123456");
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 获取认证信息

        //获取用户名
        String userName = (String)authenticationToken.getPrincipal();

        String password = getUserPassword(userName);

        if(password == null){
            return null;
        }

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo("qiuzhi",password,"customRealm");

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
        return userMap.get(userName);
    }


    /** 模拟从缓存获取角色 之后改成redis中获取 TODO
     * @author qiuzhi
     * @param userName
     * @return
     */
    private Set<String> getRolesByUserName(String userName){
        Set<String > set = new HashSet<String>();

        set.add("admin");
        set.add("group");

        return set;
    }


    /** 模拟从缓存获取角色权限 之后改成redis中获取 TODO
     * @author qiuzhi
     * @param userName
     * @return
     */
    private Set<String> getPermissionbyUserName(String userName){
        Set<String > set = new HashSet<String>();

        set.add("delete");
        set.add("update");
        set.add("insert");
        set.add("select");

        return set;
    }
}
