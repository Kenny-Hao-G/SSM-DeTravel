package com.deTravel.controller;

import com.deTravel.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WWP
 * @description: TODO
 * @date 2019/10/3  14:57
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        return "success";
    }

}
