/**
 * 
 */
package com.bhuwan.hibernatedemo.pkgeneration.assigned;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bhuwan.hibernatedemo.pkgeneration.model.BookMovie;

/**
 * @author bhuwan
 *
 */
public class PkSequenceDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure("config/mysql.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        // to persist data to db you must use transaction.
        Transaction t = session.beginTransaction();
        BookMovie movie = new BookMovie();
        // in case of sequence both the database and application are responsible to handle the id generation part.
        // in database level, "hibernate_sequence" table will be created.
        // by default the increment value is 1
        // you can create your own sequence and configure inside the bookMovie.hbm.xml file inside id generator.
        movie.setMovie("Pursuit of Happiness");
        movie.setShowtime("Night Show");
        movie.setSeat(999);
        long pk = (long) session.save(movie);
        t.commit();
        session.close();
        sf.close();
        System.out.println("New Book Movie with id: " + pk + " successful.");
    }

}
