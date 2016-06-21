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

import com.bhuwan.hibernatedemo.ormrelation.hasa.otm.model.Actor;
import com.bhuwan.hibernatedemo.ormrelation.hasa.otm.model.Movie;

/**
 * @author bhuwan
 *
 */
public class ClientOneToMany {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        SessionFactory sf = configuration.configure("config/one_to_many.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Movie pk = new Movie();
        pk.setId(101);
        pk.setMovieName("PK");

        Movie lagan = new Movie();
        lagan.setId(102);
        lagan.setMovieName("Lagan");

        Set<Movie> movies = new HashSet<>();
        movies.add(pk);
        movies.add(lagan);

        // if you use cascade="all" in actor.hbm.xml then no need to save movies
        session.save(pk);
        session.save(lagan);

        Actor actor = new Actor();
        actor.setId(101);
        actor.setActorName("Amir Khan");
        actor.setMovies(movies);

        session.save(actor);
        tx.commit();
        sf.close();
    }

}
