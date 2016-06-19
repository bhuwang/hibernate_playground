/**
 * 
 */
package com.bhuwan.hibernatedemo.crud.save;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bhuwan.hibernatedemo.model.Student;

/**
 * @author bhuwan
 *
 */
public class SaveDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure("config/mysql.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        // to persist data to db you must use transaction.
        Transaction t = session.beginTransaction();
        Student stu = new Student();
        stu.setId(44);
        stu.setName("Bhuwan Guatam");
        stu.setEmail("bgpeace01@gmail.com");
        long pk = (long) session.save(stu);
        System.out.println("primary key is: " + pk);
        t.commit();
        session.close();
        sf.close();
    }

}
