package com.nidhi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
//        s1.setRollNo(103);
//        s1.setsName("Harsh");
//        s1.setsAge(23);



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.nidhi.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //session.merge(s1);
        s1 = session.find(Student.class,106);
        session.remove(s1);
        tx.commit();
        session.close();
        sf.close();
        System.out.println(s1);

    }
}