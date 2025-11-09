package com.nidhi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("XPS");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook Air");
        l3.setRam(8);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Navin");
        a1.setTech("Java");
        a1.setLaptop(Arrays.asList(l1,l2));

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Harsh");
        a2.setTech("Python");


        a1.setLaptop(Arrays.asList(l1,l2));
        a2.setLaptop(Arrays.asList(l3));



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.nidhi.Alien.class)
                .addAnnotatedClass(com.nidhi.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);

        tx.commit();

        Session session1 = sf.openSession();

        Alien a5 = session1.find(Alien.class,101);
        //System.out.println(a5);  //laptop data will be there(asking)

        session1.close();
        session.close();

        sf.close();


    }
}