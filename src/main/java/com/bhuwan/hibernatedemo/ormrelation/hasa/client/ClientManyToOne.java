/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.hasa.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bhuwan.hibernatedemo.ormrelation.hasa.mto.model.Actor;
import com.bhuwan.hibernatedemo.ormrelation.hasa.mto.model.Movie;

/**
 * @author bhuwan
 *
 */
public class ClientManyToOne {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        SessionFactory sf = configuration.configure("config/many_to_one.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Actor actor = new Actor();
        actor.setId(101);
        actor.setActorName("Amir Khan");

        Movie pk = new Movie();
        pk.setId(101);
        pk.setMovieName("PK");
        pk.setActor(actor);

        Movie lagan = new Movie();
        lagan.setId(102);
        lagan.setMovieName("Lagan");
        lagan.setActor(actor);

        // if you use cascade="all" in actor.hbm.xml then no need to save movies
        session.save(actor);
        session.save(pk);
        session.save(lagan);

        tx.commit();
        sf.close();
    }

}
