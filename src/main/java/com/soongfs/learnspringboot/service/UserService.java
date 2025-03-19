package com.soongfs.learnspringboot.service;

import com.soongfs.learnspringboot.pojo.User;
import com.soongfs.learnspringboot.pojo.dto.UserDto;
import com.soongfs.learnspringboot.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    // spring的bean
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto user) {

        User userPojo = new User();

        BeanUtils.copyProperties(user, userPojo);

        return userRepository.save(userPojo);
        // 调用数据访问类
    }

    @Override
    public User getUser(Integer useId) {
        return userRepository.findById(useId).orElseThrow(() -> {
            throw new IllegalArgumentException("用户不存在，参数异常!");
        });
    }

    @Override
    public User edit(UserDto user) {
        User userPojo = new User();
        BeanUtils.copyProperties(user, userPojo);

        return userRepository.save(userPojo);
    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
    }
}
