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
public class PkHiLoDemo {

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
        // in case of HiLo both the database and application are responsible to handle the id generation part.
        // in database level, "hibernate_hilo" table will be created.
        // in each application deployment of the application the hilo value will be increment like 0,1,2,....
        /**
         * <pre>
         * deploy 1: hilo 0
         *      ID Range: 0 - 32,767
         * deploy 2: hilo 1
         *      ID Range: 32,768 - 65535
         * deploy 3: hilo 2
         *      ID Range: 65536 - 98303
         * deploy 3: hilo 3
         *      ID Range: 98304 - (98304+32,767).....     
         * and so on..
         * 
         * That is the range will increment by 16 bit [32,767] in each deployment.
         * 
         * In the latest release, Hilo is not supported anymore.
         * </pre>
         * 
         */
        movie.setMovie("Pursuit of Happiness");
        movie.setShowtime("Night Show");
        movie.setSeat(999);
        String pk = (String) session.save(movie);
        t.commit();
        session.close();
        sf.close();
        System.out.println("New Book Movie with id: " + pk + " successful.");
    }

}
