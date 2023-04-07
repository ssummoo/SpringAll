package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean4;

@Configuration
@ComponentScan(basePackages = "kr.co.softsoldesk.beans2")
@ComponentScan(basePackages = "kr.co.softsoldesk.beans3")
//@ComponentScan(basePackages = "kr.co.softsoldesk")
public class BeanConfigClass {

	//type
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	//Name
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	@Bean
	public TestBean2 java3() {
		return new TestBean2();
	}
	//Component된 클래스를 이름으로 식별
	@Bean
	public TestBean4 java100() {
		return new TestBean4();
	}
	@Bean
	public TestBean4 java200() {
		return new TestBean4();
	}
}
