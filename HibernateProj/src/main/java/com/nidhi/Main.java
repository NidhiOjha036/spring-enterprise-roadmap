package com.nidhi;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

        String brand = "Asus";

//        Query query = session.createQuery("from Laptop where brand like 'Asus' ");

        Query query = session.createQuery(
                "select brand, model from Laptop where brand like :brand",
                Object[].class
        );
        query.setParameter("brand", brand);
        List<Object[]> list = query.getResultList();


//        List<Laptop> laptops = query.getResultList();
        List<Object[]> laptops = query.getResultList();

        for (Object[] data : laptops) {
            System.out.println((String) data[0] + " : " + (String) data[1]);
        }
//        Laptop l1=session.get(Laptop.class, 3);


        System.out.println(laptops);

        session.close();

        sf.close();


    }
}