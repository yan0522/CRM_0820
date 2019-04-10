package com.atguigu.crm.mapper;

import com.atguigu.crm.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * TODO
 *
 * @InterfaceName: UserMapper
 * @author: yan
 * @since: 2019/4/10 14:26
 */
public interface UserMapper {

    public User getUserByName(@Param(value="name") String name);
}
