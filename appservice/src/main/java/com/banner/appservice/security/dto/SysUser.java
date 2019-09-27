package com.banner.appservice.security.dto;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;

import java.util.List;

@Data
@Ignore
public class SysUser {
    private Integer id;
    private String username;
    private String password;
    private List<SysRole> roles;
}
