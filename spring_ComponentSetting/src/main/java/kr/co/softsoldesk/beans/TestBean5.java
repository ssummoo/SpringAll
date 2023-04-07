package kr.co.softsoldesk.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {
	
	public TestBean5() {
		System.out.println("TestBean5의 생성자");
	}
	@PostConstruct
	public void init() {
		System.out.println("TestBean5의 init메소드 호출");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("TestBean5의 destroy메소드 호출");
	}
}

