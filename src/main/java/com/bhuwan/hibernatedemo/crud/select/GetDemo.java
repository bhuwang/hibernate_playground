/**
 * 
 */
package com.bhuwan.hibernatedemo.crud.select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhuwan.hibernatedemo.model.Student;

/**
 * @author bhuwan
 *
 */
public class GetDemo {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("config/mysql.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        /*
         * In case of get, select query immediately fire on the get statement itself.
         */
        Student student = session.get(Student.class, 22L);
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        session.close();
        sf.close();

    }
}
