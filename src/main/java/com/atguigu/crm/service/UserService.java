package com.atguigu.crm.service;

import com.atguigu.crm.entity.User;
import com.atguigu.crm.mapper.UserMapper;
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

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    public User login (String name, String password){
        System.out.println("11111111111111111111111");
        User user = userMapper.getUserByName(name);
        System.out.println("22222222222222222222222222");
        if (user != null
                && user.getEnabled() == 1
                && user.getPassword().equals(password)
        ){
            System.out.println("333333333333333333333");
            return user;
        }
        return null;
    }

}
