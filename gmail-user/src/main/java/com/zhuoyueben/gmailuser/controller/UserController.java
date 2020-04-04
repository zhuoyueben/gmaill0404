package com.zhuoyueben.gmailuser.controller;

import com.zhuoyueben.gmailuser.dao.UserDao;
import com.zhuoyueben.gmailuser.entity.Hr;
import com.zhuoyueben.gmailuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description
 * @Author TeaBen
 * @Date 2020-04-04 12:26
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/list")
    @ResponseBody
    public List<Hr> list(){
        return userService.getUser();

    }
}
