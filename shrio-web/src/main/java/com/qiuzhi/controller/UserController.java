package com.qiuzhi.controller;

import com.vo.ReturnObject;
import com.vo.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController class
 *
 * @author qiuzhi
 * @date 2018/11/15
 */

@Controller
public class UserController {
    private final static Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "subLogin", method = RequestMethod.POST,
    produces = "application/json;charset=utf-8")
    @ResponseBody
    public ReturnObject subLogin(User user){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        logger.info("用户：" + user.getUsername() + "尝试登录！");
        try{
//            token.setRememberMe(user.getRememberMe());
            subject.login(token);
        }catch (Exception e){
            if(e instanceof UnknownAccountException){

                return new ReturnObject("1","登录失败:用户名不存在");
            }else if(e instanceof IncorrectCredentialsException){
                return new ReturnObject("1","登录失败:密码错误");
            }
            return new ReturnObject("1",e.getMessage());
        }

//        if(subject.hasRole("admin")){
//            return "有admin权限";
//        }
        return new ReturnObject("0","操作成功");
    }

//    @RequiresRoles("admin")
    @RequestMapping(value = "/testRole", method = RequestMethod.GET)
    @ResponseBody
    public String testRole(){
       return "role success";
    }

    @RequiresPermissions("user:delete")
    @RequestMapping(value = "/testDelete")
    @ResponseBody
    public String testDelete(){
        return "delete success";
    }

    @RequestMapping(value = "/testRole1", method = RequestMethod.GET)
    @ResponseBody
    public String testRole1(){
        return "testRole1 success";
    }

    @RequestMapping(value = "/testPerms", method = RequestMethod.GET)
    @ResponseBody
    public String testPerms(){
        return "testPerms success";
    }

    @RequestMapping(value = "/testPerms1", method = RequestMethod.GET)
    @ResponseBody
    public String testPerms1(){
        return "testPerms1 success";
    }



}
