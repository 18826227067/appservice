package com.banner.appservice.security.dao;

import com.banner.appservice.security.dto.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IRole {
    @Select("select * from role where id=(select roleId from role_user where userId=#{userId})")
    @Results(value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
    })
    SysRole selectRolesByUserId(int userId);

}
