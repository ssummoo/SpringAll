package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.TV;
import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
	
		// 기본
		TestBean t1=new TestBean();
		t1.printData();		
		System.out.println("===================================================");
		TestBean obj1=ctx.getBean("obj1", TestBean.class);
		obj1.printData();
		System.out.println("===================================================");
		
		// int
		TestBean t2=new TestBean(100);
		t2.printData();		
		System.out.println("===================================================");
		TestBean obj2=ctx.getBean("obj2", TestBean.class);
		obj2.printData();
		System.out.println("===================================================");
		
		// double
		TestBean t3=new TestBean(11.11);
		t3.printData();		
		System.out.println("===================================================");
		TestBean obj3=ctx.getBean("obj3", TestBean.class);
		obj3.printData();
		System.out.println("===================================================");
		
		// String
		TestBean t4=new TestBean("soldesk");
		t4.printData();		
		System.out.println("===================================================");
		TestBean obj4=ctx.getBean("obj4", TestBean.class);
		obj4.printData();
		System.out.println("===================================================");
		
		// 모든속성
		TestBean t5=new TestBean(200, 22.22, "software");
		t5.printData();		
		System.out.println("===================================================");
		TestBean obj5=ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		System.out.println("===================================================");
		
		// 순서변경 모든속성
		//자바에서 불가능
		//TestBean t6=new TestBean("SoftSoldesk",201, 22.22);
		//t6.printData();		
		System.out.println("===================================================");
		TestBean obj6=ctx.getBean("obj6", TestBean.class);
		obj6.printData();
		System.out.println("===================================================");
		
		//인덱스
		System.out.println("===================================================");
		TestBean obj7=ctx.getBean("obj7", TestBean.class);
		obj7.printData();
		System.out.println("===================================================");

		DataBean d1=new DataBean();
		DataBean d2=new DataBean();
		TestBean1 t200=new TestBean1(d1, d2);
		t200.printData();
		System.out.println("===================================================");
		TestBean1 obj8=ctx.getBean("obj8", TestBean1.class);
		obj8.printData();
		System.out.println("===================================================");

		TestBean1 obj9=ctx.getBean("obj9", TestBean1.class);
		obj9.printData();
		System.out.println("===================================================");
		
		TV tv=(TV)ctx.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		ctx.close();
		
	}

}
