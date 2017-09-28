package com.yearcon.girl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 加载指定的配置文件
 *这样在bean中就可以使用配置文件中的属性
 *
 */



@Configuration
@PropertySource("classpath:config/jdbc.properties")
public class FileConfig {


}
