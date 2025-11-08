package com.nidhi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s2 = new Student();


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.nidhi.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        s2 = session.find(Student.class,109);
        session.close();
        sf.close();
        System.out.println(s2);

    }
}