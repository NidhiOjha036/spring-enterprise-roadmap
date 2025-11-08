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

        s1.setRollNo(106);
        s1.setsName("Avni");
        s1.setsAge(22);

        System.out.println(s1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.nidhi.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();

    }
}