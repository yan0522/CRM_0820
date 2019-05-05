package com.atguigu.crm.service;

import com.atguigu.crm.entity.Role;
import com.atguigu.crm.entity.User;
import com.atguigu.crm.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * TODO
 *
 * @ClassName: UserService
 * @author: yan
 * @since: 2019/4/10 16:15
 */
@Service
public class UserService {
    //public static Logger logger = Logger.getLogger(UserService.class);
    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    public User login(@Param("name") String name, @Param("password") String password) {
        User user = userMapper.getUserByName(name);
        if (user != null
                && user.getEnabled() == 1
                && user.getPassword().equals(password)
        ) {
            return user;
        }
        return null;
    }
}