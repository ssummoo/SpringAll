package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans2.LgTV;
import kr.co.softsoldesk.beans2.TV;
import kr.co.softsoldesk.beans2.TestBean;


public class MainClass2 {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans2.xml");
	
		TestBean t1=ctx.getBean("t1", TestBean.class);
		
		System.out.println("t1.data1 : "+t1.getData1());
		System.out.println("t2.data2 : "+t1.getData2());
		System.out.println("t3.data3 : "+t1.isData3());
		System.out.println("t4.data4 : "+t1.getData4());
		System.out.println("t5.data5 : "+t1.getData5());
		System.out.println("t6.data6 : "+t1.getData6());
		System.out.println();
		System.out.println("=========================================");
		
		/*
		TV tv=(TV)ctx.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		 * */
		
		
		LgTV tv=(LgTV)ctx.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		/*
		활용
		LgTV tv1=(LgTV)ctx.getBean("tv1",LgTV.class);
		tv1.getPrice();
		tv1.getSpeaker();
		tv1.powerOff();
		 * */
		
		ctx.close();
		
	}

}
