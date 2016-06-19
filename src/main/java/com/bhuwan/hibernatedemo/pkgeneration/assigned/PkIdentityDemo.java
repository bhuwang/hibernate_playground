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
public class PkIdentityDemo {

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
        // in case of identity database will handle the id generation part.
        // in database level, there will be auto_increment attribute set.
        // Oracle doesn't have this auto_increment feature. MySql, DB2 etc have this feature.
        movie.setMovie("No Escape");
        movie.setShowtime("Matine Show");
        movie.setSeat(116);
        long pk = (long) session.save(movie);
        t.commit();
        session.close();
        sf.close();
        System.out.println("New Book Movie with id: " + pk + " successful.");
    }

}
