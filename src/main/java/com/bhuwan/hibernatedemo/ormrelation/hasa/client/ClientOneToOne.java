/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.hasa.client;

import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bhuwan.hibernatedemo.ormrelation.hasa.oto.model.Vote;
import com.bhuwan.hibernatedemo.ormrelation.hasa.oto.model.Voter;

/**
 * @author bhuwan
 *
 */
public class ClientOneToOne {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        SessionFactory sf = configuration.configure("config/one_to_one.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Voter bhuwan = new Voter();
        bhuwan.setName("Bhuwan Guatam");
        bhuwan.setAge(30);

        Vote vote = new Vote();
        vote.setPartyName("XYZ Party");
        vote.setVoter(bhuwan);
        vote.setCastedDate(LocalDateTime.now());

        Voter suman = new Voter();
        suman.setName("Suman Gurung");
        suman.setAge(30);

        Vote vote2 = new Vote();
        vote2.setPartyName("ABC Party");
        vote2.setVoter(suman);
        vote2.setCastedDate(LocalDateTime.now());

        session.save(suman);
        session.save(vote2);
        session.save(bhuwan);
        session.save(vote);

        tx.commit();
        sf.close();
    }

}
