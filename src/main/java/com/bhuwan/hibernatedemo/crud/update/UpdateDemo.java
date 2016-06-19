/**
 * 
 */
package com.bhuwan.hibernatedemo.crud.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bhuwan.hibernatedemo.model.Student;

/**
 * @author bhuwan
 *
 */
public class UpdateDemo {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("config/mysql.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        Student stu = new Student();
        stu.setId(22);
        stu.setName("Bhuwan Guatam");
        stu.setEmail("bgpeace01@gmail.com");
        // save or merge: you have to pass all the fields along with the udpated ones
        session.update(stu);
        t.commit();
        session.close();
        sf.close();

    }
}
