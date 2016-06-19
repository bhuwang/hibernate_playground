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
public class SaveOrUpdateDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("config/mysql.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        // if you don't want to begin tx then you have to set autocommit=true in your hibernate config file.
        Transaction t = session.beginTransaction();
        Student stu = new Student();
        stu.setId(22);
        stu.setName("Bhuwan Guatam1");
        stu.setEmail("bgpeace01@gmail.com");
        // first do the select and determines whether insert or update
        session.saveOrUpdate(stu);
        t.commit();
        session.close();
        sf.close();
    }

}
