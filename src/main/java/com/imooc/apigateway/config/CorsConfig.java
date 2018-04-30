package com.imooc.apigateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

/**
 * @program: api-gateway
 * @description: 跨域配置
 * @author: Francis
 * @create: 2018-04-27 14:48
 **/
@Configuration
public class CorsConfig {

    public CorsFilter corsFilter(){
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();

        config.setAllowCredentials(true);
        config.setAllowedOrigins(Arrays.asList("*"));//允许跨域的访问的地址 如http://www.a.com
        config.setAllowedHeaders(Arrays.asList("*"));//头信息
        config.setAllowedMethods(Arrays.asList("*"));//方法类型 GET POST
        config.setMaxAge(300l);

        source.registerCorsConfiguration("/**",config);
        return new CorsFilter(source);
    }
}
