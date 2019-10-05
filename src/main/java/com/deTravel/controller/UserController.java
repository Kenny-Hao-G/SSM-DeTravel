package com.deTravel.controller;

import com.deTravel.pojo.User;
import com.deTravel.service.UserService;
import com.deTravel.utils.MD5Utils;
import com.deTravel.utils.MailUtils;
import com.deTravel.utils.UUIDUtils;


import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @author WWP
 * @description: TODO
 * @date 2019/10/3  14:57
 */
@Controller
@RequestMapping("/user")
@Api(value = "用户操作", tags = "用户操作")
public class UserController {

    @Autowired
    UserService userService;
    @Value("${IMG_PATH}")
    String IMG_PATH;
    @Value("${IMG_URL}")
    String IMG_URL;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "用户登录操作")
    public String login(User user, HttpSession session) {
        user.setuPassWord(MD5Utils.getMd5(user.getuPassWord()));
        int count = userService.selectUser(user);
        if (count > 0) {
            session.setAttribute("USER", user.getuNickName());
            return "success";
        }
        return "fail";
    }

    /**
     * 用户注册操作
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "singIn", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "用户注册操作")
    public String addUser(@ApiParam(value = "用户实体") User user) {
        // 注册时调用该操作,实现注册时密码为 md5 加密密文
        user.setuPassWord(MD5Utils.getMd5(user.getuPassWord()));

        // 调用 Service 层, 完成对用户的注册操作
        int result = userService.addUserInfo(user);

        // 注册时如果输入的值大于0,则返回注册成功
        if (result > 0) {
            return "success";
        }
        return "fail";
    }

    /**
     * 重设密码
     */
    @RequestMapping(value = "/reset", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "用户的重设密码")
    public String reset(User user) {
        int count = userService.selectUserToReset(user);
        if (count > 0) {
            String code = (int) (Math.random() * (9 + 1) * 100000) + "";

            MailUtils.sendMail(user.getuEmail(), "你的重置密码是:  " + code + "  收到后请尽快登录修改密码",
                    "欢迎使用DeTravel————APP,祝你愉快！！");

            user.setuPassWord(MD5Utils.getMd5(code));
            userService.updatePasswardByCode(user);
            return "success";
        }
        return "fail";

    }




}
