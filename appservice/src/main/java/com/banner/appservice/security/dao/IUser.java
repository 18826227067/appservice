package com.banner.appservice.security.dao;

import com.banner.appservice.security.dto.SysUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

@Mapper
public interface IUser {

    @Select(
//            "select u.*,r.name from user u LEFT JOIN role_user as sru on u.id= sru.userId LEFT JOIN role r on sru.roleId=r.id where username=#{username}"
            "select * from user where username=#{username} "
    )
    @Results(value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            // 封装角色集合信息.
            @Result(property = "roles", column = "id",
                    many = @Many(select = "com.banner.appservice.security.dao.IRole.selectRolesByUserId", fetchType = FetchType.EAGER))
    })
    SysUser findByUserName(String username);


}
