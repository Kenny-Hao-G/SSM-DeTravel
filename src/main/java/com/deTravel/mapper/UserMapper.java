package com.deTravel.mapper;

import com.deTravel.pojo.User;

/**
 * @author WWP
 * @description: TODO
 * @date 2019/10/3  15:46
 */
public interface UserMapper {
    int selectUser(User user);

    /**
     * 用户注册
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
