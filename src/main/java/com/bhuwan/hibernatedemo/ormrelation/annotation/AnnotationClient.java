/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author bhuwan
 *
 */
public class AnnotationClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        SessionFactory sf = configuration.configure("config/annotation.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Student stu = new Student();
        stu.setName("Suman Gautam");
        stu.setEmail("suman@lftechnology.com");
        stu.setAddress("Kathmandu");

        session.save(stu);
        transaction.commit();
        sf.close();
    }

}
