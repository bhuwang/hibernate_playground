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
public class MergeDemo {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("config/mysql.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        // if you don't want to begin tx then you have to set autocommit=true in your hibernate config file.
        Transaction t = session.beginTransaction();
        // if you get the same object in session and try to update the same it is not possible by using update method. In such case you have
        // to use merge.
        session.get(Student.class, 22L);
        Student stu = new Student();
        stu.setId(22);
        stu.setName("Prisha Gautam");
        stu.setEmail("bgpeace01@gmail.com");
        // in this case if you use update it will not work.
        session.merge(stu);
        t.commit();
        session.close();
        sf.close();

    }
}
