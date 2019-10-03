package com.deTravel.controller;

import com.deTravel.pojo.User;
import com.deTravel.service.UserService;
import com.deTravel.utils.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "用户操作")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    @ApiOperation(value = "用户注册操作")
    public String login(User user) {
        user.setuPassword(MD5Utils.getMd5(user.getuPassword()));
        int count = userService.selectUser(user);

        return count > 0 ? "success" : "fail";
    }

    /**
     * 用户注册操作
     *
     * @param user
     * @return
     */
    public String addUser(User user) {
        // 注册时调用该操作,实现注册时密码为 md5 加密密文
        user.setuPassword(MD5Utils.getMd5(user.getuPassword()));

        // 调用 Service 层, 完成对用户的注册操作
        int result = userService.addUserInfo(user);

        // 注册时如果输入的值大于0,则返回注册成功
        if (result > 0) {
            return "success";
        }
        return "fail";
    }
}
