package com.deTravel.service.impl;

import com.deTravel.mapper.UserMapper;
import com.deTravel.pojo.User;
import com.deTravel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WWP
 * @description: TODO
 * @date 2019/10/3  15:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int selectUser(User user) {
        return userMapper.selectUser(user);
    }

    @Override
    public int addUserInfo(User user) {
        return userMapper.addUserInfo(user);
    }

    @Override
    public int selectUserToReset(User user) {
        return userMapper.selectUserToReset(user);
    }

    @Override
    public void updatePasswardByCode(User user) {
        userMapper.updatePasswardByCode(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }

    @Override
    public int updateUserByForm(User user) {
        return userMapper.updateUserByForm(user);
    }


}
