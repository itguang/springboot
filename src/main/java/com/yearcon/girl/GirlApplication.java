package com.yearcon.girl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //启动dpringboot程序,而后自动扫描子包
public class GirlApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GirlApplication.class, args);
//
//		ConfigurableApplicationContext context = SpringApplication.run(GirlApplication.class, args);
//		context.getBean(JdbcConfig.class).show();


		SpringApplication app = new SpringApplication(GirlApplication.class);

		//可以通过启动参数的方式配置生效的 profile: --spring.profiles.active=test
//		app.setAdditionalProfiles("test");//编程方式设置生效的 profile,默认的配置文件也能生效

		ConfigurableApplicationContext context = app.run(args);
		String msg = context.getEnvironment().getProperty("dev.msg");//得到配置文件中的属性
		System.out.println(msg);
		System.out.println(context.getEnvironment().getProperty("server.port"));


	}
}
