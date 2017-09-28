package com.yearcon.girl.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConfig {

    @Value("${jdbc.url}")
    private String url;


    public void show(){
        System.out.println("获取自定义配置文件的属性为:"+url);
    }


}
