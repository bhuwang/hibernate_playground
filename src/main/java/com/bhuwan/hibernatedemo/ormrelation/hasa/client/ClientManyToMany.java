/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.hasa.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bhuwan.hibernatedemo.ormrelation.hasa.mtm.model.Course;
import com.bhuwan.hibernatedemo.ormrelation.hasa.mtm.model.Faculty;

/**
 * @author bhuwan
 *
 */
public class ClientManyToMany {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        SessionFactory sf = configuration.configure("config/many_to_many.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Course c1 = new Course();
        c1.setCname("Chemistry");
        c1.setFee(500);

        Course c2 = new Course();
        c2.setCname("Physics");
        c2.setFee(500);

        Course c3 = new Course();
        c3.setCname("Core Java");
        c3.setFee(500);

        Course c4 = new Course();
        c4.setCname("Advance Java");
        c4.setFee(500);

        Set<Course> programmingCourses = new HashSet<>();
        programmingCourses.add(c3);
        programmingCourses.add(c4);

        Set<Course> scienceCourses = new HashSet<>();
        scienceCourses.add(c1);
        scienceCourses.add(c2);

        Faculty f1 = new Faculty();
        f1.setFname("Bhuwan Gautam");
        f1.setYearExp(10);
        f1.setCourses(programmingCourses);

        Faculty f2 = new Faculty();
        f2.setFname("Sanjay Siwakoti");
        f2.setYearExp(7);
        f2.setCourses(scienceCourses);

        session.save(f1);
        session.save(f2);
        session.save(c1);
        session.save(c2);
        session.save(c3);
        session.save(c4);

        tx.commit();
        sf.close();
    }

}
