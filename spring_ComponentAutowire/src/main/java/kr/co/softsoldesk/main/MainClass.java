package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

   public static void main(String[] args) {

      System.out.println("===================JAVA===================");
      AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
      
      TestBean1 t1 = ctx.getBean(TestBean1.class);
      System.out.println("t1.data1 : "+t1.getData1());
      System.out.println("t1.data2 : "+t1.getData2());
      System.out.println("t1.data3 : "+t1.getData3());
      System.out.println("t1.data4 : "+t1.getData4());
      System.out.println("t1.data5 : "+t1.getData5());
      System.out.println("---------------------------------");
      
      TestBean2 t2 = ctx.getBean(TestBean2.class);
      System.out.println("t2.data1 : "+t2.getData1());
      System.out.println("t2.data2 : "+t2.getData2());
      System.out.println("t2.data3 : "+t2.getData3());
      System.out.println("t2.data4 : "+t2.getData4());
      System.out.println("---------------------------------");
      
      TestBean3 t3 = ctx.getBean("testBean3" ,TestBean3.class);
      System.out.println("t3.data1 : "+t3.getData1());
      System.out.println("t3.data2 : "+t3.getData2());
      System.out.println("t3.data3 : "+t3.getData3());
      System.out.println("t3.data4 : "+t3.getData4());
      
      TestBean3 t4 = ctx.getBean("java3", TestBean3.class);
      System.out.println("t4.data1 : "+t4.getData1());
      System.out.println("t4.data2 : "+t4.getData2());
      System.out.println("t4.data3 : "+t4.getData3());
      System.out.println("t4.data4 : "+t4.getData4());
      
      
      ctx.close();
      
   }
   
}