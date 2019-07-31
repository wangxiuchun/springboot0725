package com.aaa.controller;

import com.aaa.entity.User;
import com.aaa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user, HttpSession session){
        User user1 = userService.login(user);
        session.setAttribute("user",user1);
        if (user1!=null){
            System.out.println("11111");
            return "true";
        }else{
            System.out.println("22222");
            return "false";
        }

    }

    @RequestMapping("/toBackIndex")
    public String toBackIndex(){
        return "houtai/backIndex";
    }

}
