package com.nidhi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.age=21;
        obj1.code();
        System.out.println(obj1.age);

        Alien obj2 = (Alien) context.getBean("alien1");
        obj2.code();
        System.out.println(obj2.age);

    }
}
