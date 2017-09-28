package com.yearcon.girl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlApplicationTests {

	//这个空方法是默认的,但足以证明应用程序的上下文加载没有问题
	//如果GirlApplication里面定义的配置是好的,就能通过测试,反之,就会测试失败
	@Test
	public void contextLoads() {
	}

}
