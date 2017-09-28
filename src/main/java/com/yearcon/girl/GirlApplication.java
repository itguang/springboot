package com.yearcon.girl;

import com.yearcon.girl.config.JdbcConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //启动dpringboot程序,而后自动扫描子包
public class GirlApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(GirlApplication.class, args);
		context.getBean(JdbcConfig.class).show();



	}
}
