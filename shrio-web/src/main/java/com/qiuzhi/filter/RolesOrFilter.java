package com.qiuzhi.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/** 自定义filter
 *  编写认证相关filter继承AuthorizationFilter 编写
 * @author qiuzhi
 * @date 2018/11/2
 * @description
 */
public class RolesOrFilter extends AuthorizationFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        // 获取实体
        Subject subject = getSubject(servletRequest,servletResponse);
        // 角色列表
        String[] roles = (String[]) o;
        if(roles == null || roles.length == 0){
            return true;
        }
        for(String role : roles){
            if(subject.hasRole(role)){
                return true;
            }
        }
        return false;
    }
}
