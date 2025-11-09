package com.nidhi;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Main {
    public static void main(String[] args) {


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.nidhi.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        //   Select * from laptop where ram=32 ->SQL
        //   from Laptop where ram=32 -> HQL

        //Query query = session.createQuery("from Laptop");
        Query query = session.createQuery("from Laptop where ram=32",Laptop.class);

        List<Laptop> laptops = query.getResultList();

        System.out.println(laptops);

        session.close();

        sf.close();


    }
}