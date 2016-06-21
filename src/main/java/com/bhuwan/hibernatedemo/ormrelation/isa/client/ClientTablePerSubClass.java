/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.isa.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bhuwan.hibernatedemo.ormrelation.model.Admin;
import com.bhuwan.hibernatedemo.ormrelation.model.HEmployee;
import com.bhuwan.hibernatedemo.ormrelation.model.SEmployee;

/**
 * @author bhuwan
 *
 *         This is not working !!!
 */
public class ClientTablePerSubClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("config/mysql_tbl_per_subclass.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        try {
            // save employees
            SEmployee sw = new SEmployee(114, "Bhuwan Guatam", "bgpeace01@gmail.com", 5000, "Ecplise");
            session.save(sw);
            HEmployee hw = new HEmployee(115, "Ravi Kapali", "ravi@gmail.com", 5000, 10);
            session.save(hw);
            Admin adm = new Admin(116, "Mamita Shakya", "mamita@gmail.com", 5000, "Dillibazzar");
            session.save(adm);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sf.close();
        }

    }

}
