/**
 * 
 */
package com.bhuwan.hibernatedemo.crud.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bhuwan.hibernatedemo.model.Student;

/**
 * @author bhuwan
 *
 */
public class DeleteDemo {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("config/mysql.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        /*
         * In case of get, select query immediately fire on the get statement itself.
         */
        Student student = new Student();
        student.setId(236L);
        session.delete(student);
        System.out.println("Student with id: " + student.getId() + " has been deleted successfully!!");
        t.commit();
        session.close();
        sf.close();

    }
}
