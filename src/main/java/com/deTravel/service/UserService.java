package com.deTravel.service;

import com.deTravel.pojo.User;

/**
 * @author WWP
 * @description: TODO
 * @date 2019/10/3  15:43
 */
public interface UserService {
    int selectUser(User user);

    /**
     * 注册用户信息
     *
     * @param user
     * @return
     */
    int addUserInfo(User user);


    int selectUserToReset(User user);

    void updatePasswardByCode(User user);

    User getUserByEmail(String email);

    int updateUserByForm(User user);
}
