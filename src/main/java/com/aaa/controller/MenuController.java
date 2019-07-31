package com.aaa.controller;

import com.aaa.entity.User;
import com.aaa.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class MenuController {
    @Resource
    private MenuService menuService;


    @RequestMapping("/menu")
    @ResponseBody
    public List<Map> query(HttpSession session){
        System.out.println("==========");
        int userid=((User)session.getAttribute("user")).getId();
        return menuService.query(userid);
    }

    @RequestMapping("/toRe")
    public String toRe(){
        return "back/aaa";
    }
}
