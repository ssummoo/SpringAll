package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("=================XML==============");
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		TestBean1 xml1=ctx1.getBean("xml1",TestBean1.class);
	
		ctx1.close();
		System.out.println();
		System.out.println("==============JAVA=============");
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1=ctx2.getBean("java1", TestBean1.class); 
		ctx2.close();
	}
}