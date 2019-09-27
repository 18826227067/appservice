package com.banner.appservice.security.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * Config JWT.
 * Only one property 'shuaicj.security.jwt.secret' is mandatory.
 *
 * @author huangqinglin 2017/10/18
 */
@Data
@ToString
public class JwtAuthenticationConfig {

    @Value("${shuaicj.security.jwt.url:/account/login}")
    private String loginUrl;

    @Value("${shuaicj.security.jwt.header:Authorization}")
    private String header;

    @Value("${shuaicj.security.jwt.prefix:Bearer}")
    private String prefix;

    @Value("${shuaicj.security.jwt.expiration:#{24*60*60}}")
    private int expiration; // default 24 hours

    @Value("${shuaicj.security.jwt.secret}")
    private String secret;
}