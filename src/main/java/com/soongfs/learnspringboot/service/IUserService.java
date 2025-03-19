package com.soongfs.learnspringboot.service;

import com.soongfs.learnspringboot.pojo.User;
import com.soongfs.learnspringboot.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 插入用户
     *
     * @param user 参数
     * @return
     */
    User add(UserDto user);

    /**
     * 查询用户
     * @param useId 用户id
     * @return
     */
    User getUser(Integer useId);

    /**
     * 修改用户
     * @param user 修改用户对象
     * @return
     */
    User edit(UserDto user);

    /**
     * 删除
     *
     * @param userId
     */
    void delete(Integer userId);
}
