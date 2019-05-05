package com.atguigu.crm.mapper;

import com.atguigu.crm.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * TODO
 *
 * @InterfaceName: UserMapper
 * @author: yan
 * @since: 2019/4/11 8:46
 */
public interface UserMapper {
    User getUserByName(@Param(value="name") String name);
}
