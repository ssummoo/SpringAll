package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx1=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		System.out.println("=============================TestBean1=============================");
		TestBean1 t1=ctx1.getBean(TestBean1.class);
		System.out.println("t1 : "+ t1);
		TestBean1 t2=ctx1.getBean(TestBean1.class);
		System.out.println("t2 : "+ t2);
		//t1, t2 싱글톤

		System.out.println("=============================TestBean2=============================");
		TestBean2 t3=ctx1.getBean("t3",TestBean2.class);
		System.out.println("t3 : "+ t3);
		TestBean2 t4=ctx1.getBean("t3",TestBean2.class);
		System.out.println("t4 : "+ t4);
		//t3, t4 싱글톤
		TestBean2 t5=ctx1.getBean("t5",TestBean2.class);
		System.out.println("t5 : "+ t5);
		TestBean2 t6=ctx1.getBean("t6",TestBean2.class);
		System.out.println("t6 : "+ t6);
		
		System.out.println("=============================TestBean3=============================");
		TestBean3 t7=ctx1.getBean(TestBean3.class);
		System.out.println("t7 : "+ t7);
		TestBean3 t8=ctx1.getBean(TestBean3.class);
		System.out.println("t8 : "+ t8);
		//lazy 이므로 싱글톤
		
		System.out.println("=============================TestBean4=============================");
		TestBean4 t9=ctx1.getBean(TestBean4.class);
		System.out.println("t9 : "+ t9);
		TestBean4 t10=ctx1.getBean(TestBean4.class);
		System.out.println("t10 : "+ t10);
		//prototype 싱글톤 해결
		
		System.out.println("=============================TestBean5=============================");
		TestBean5 t11 = ctx1.getBean(TestBean5.class);
		System.out.printf("t11 : %s\n", t11);
		//@PostConstruct @PreDestroy
		
		
		
		
		
		
		
		
		ctx1.close();
		
	}
}