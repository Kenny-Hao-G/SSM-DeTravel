package com.deTravel.controller;

import com.deTravel.pojo.User;
import com.deTravel.service.UserService;
import com.deTravel.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user) {
        user.setuPassword(MD5Utils.getMd5(user.getuPassword()));
        int count = userService.selectUser(user);

        return count > 0 ? "success" : "fail";
    }

}
