/**
 * 
 */
package com.bhuwan.hibernatedemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author bhuwan
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("config/mysql.cfg.xml");
        SessionFactory buildSessionFactory = cfg.buildSessionFactory();
    }

}
