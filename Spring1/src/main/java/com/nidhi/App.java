package com.nidhi;

import com.nidhi.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

         ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

          Alien obj1 = (Alien) context.getBean(Alien.class);
          obj1.code();
          System.out.println(obj1.age);


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj1 = (Alien) context.getBean("alien1");
//        obj1.code();
//        System.out.println(obj1.age);
//
//        Desktop obj = context.getBean("com2",Desktop.class);


    }
}
