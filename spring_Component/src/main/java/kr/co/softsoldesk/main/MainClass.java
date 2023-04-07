package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean3;
import kr.co.softsoldesk.beans2.TestBean4;
import kr.co.softsoldesk.beans3.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("==============================XML==============================");
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		//type으로 가져오기
		System.out.println("type===================================");
		TestBean1 xml1 = ctx1.getBean(TestBean1.class);
		System.out.println("xml1 : "+xml1);
		
		//Name으로 가져오기
		System.out.println("name===================================");
		TestBean2 xml2 = ctx1.getBean("xml2", TestBean2.class);
		System.out.println("xml2 : "+xml2);
		TestBean2 xml3 = ctx1.getBean("xml3", TestBean2.class);
		System.out.println("xml3 : "+xml3);
		
		//Component
		System.out.println("component===================================");
		TestBean3 xml4 = ctx1.getBean(TestBean3.class);
		System.out.println("xml4 : " + xml4);
		TestBean4 xml5 = ctx1.getBean("beans4" ,TestBean4.class);
		System.out.println("xml5 : " + xml5);
		
		//Component 이름으로 식별
		System.out.println("component 이름으로 식별===================================");
		TestBean4 xml100 = ctx1.getBean("xml100", TestBean4.class);
		System.out.println("xml100 : "+xml100);
		TestBean4 xml200 = ctx1.getBean("xml200", TestBean4.class);
		System.out.println("xml200 : "+xml200);
		
		System.out.println("beans3.TestBean5");
		TestBean5 xmla =ctx1.getBean(TestBean5.class);
		System.out.println("xmla : "+xmla);
		
		ctx1.close();
		System.out.println("==============================JAVA==============================");
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//type으로 가져오기
		System.out.println("type===================================");
		TestBean1 java1 = ctx2.getBean(TestBean1.class);
		System.out.println("java1 : "+java1);
	
		//Name으로 가져오기 
		System.out.println("name===================================");
		TestBean2 java2 = ctx2.getBean("java2",TestBean2.class);
		System.out.println("java2 : "+java2);
		TestBean2 java3 = ctx2.getBean("java3",TestBean2.class);
		System.out.println("java3 : "+java3);
	
		//Component
		TestBean3 java4=ctx2.getBean(TestBean3.class);
		System.out.println("java4 : "+java4);
		TestBean4 java5=ctx2.getBean("beans4",TestBean4.class);
		System.out.println("java5 : "+java5);
		
		//Component 이름으로 식별
		System.out.println("component 이름으로 식별===================================");
		TestBean4 java100 = ctx2.getBean("java100",TestBean4.class);
		System.out.println("java100 : "+java100);
		TestBean4 java200 = ctx2.getBean("java200",TestBean4.class);
		System.out.println("java200 : "+java200);
		
		//beans3.TestBean5
		TestBean5 javaa=ctx2.getBean(TestBean5.class);
		System.out.println("javaa : "+javaa);
		ctx2.close();
	}
}