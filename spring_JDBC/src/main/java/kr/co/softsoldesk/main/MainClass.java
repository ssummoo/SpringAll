package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.db.JdbcDAO;

public class MainClass {

   public static void main(String[] args) {

     System.out.println("==================================JAVA==================================");
     AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
     
     JdbcDAO dao=ctx.getBean(JdbcDAO.class);
     JdbcBean bean1=new JdbcBean();
     
     //insert
     /*
     
     bean1.setInt_data(1);
     bean1.setStr_data("JAVA");
     dao.insert_data(bean1);
     
     bean1.setInt_data(2);
     bean1.setStr_data("JSP");
     dao.insert_data(bean1);
     
     bean1.setInt_data(3);
     bean1.setStr_data("HTML/CSS");
     dao.insert_data(bean1);

     bean1.setInt_data(4);
     bean1.setStr_data("Spring");
     dao.insert_data(bean1);
      * */
     System.out.println("저장완료");
     //select
     List<JdbcBean> list=dao.select_data();
   
     
     for(JdbcBean bean : list) {
    	 System.out.print("int_data : " +bean.getInt_data()+" \t");
    	 System.out.println("str_data : " +bean.getStr_data());
    	 System.out.println("=============================================");
     }
     //update
     /*
     JdbcBean bean3 = new JdbcBean();
     bean3.setInt_data(3);
     bean3.setStr_data("Python");
     dao.update_data(bean3);
      */
     //delete
     dao.delete_data(2);
    
     
     ctx.close();
   }
   
}