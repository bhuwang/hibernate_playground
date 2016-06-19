/**
 * 
 */
package com.bhuwan.hibernatedemo.autoddl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author bhuwan
 *
 */
public class AutoDDlDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        /**
         * <pre>
         * in mysql.cfg.xml file change the value of the property hbm2ddl.auto
         * 
         * 1.create: drop tables if exists, create tables
         * 2.update: create table if not exists, update table
         * 3.validate: validates if the required fields are in the table or not.[no. of columns in entity <= columns in table]
         * 4.create-drop: drop tables if exists, create tables, and drop tables on SessionFactory[container] close.
         * </pre>
         */
        cfg.configure("config/mysql.cfg.xml");
        // build session factory triggers table entity generation
        SessionFactory sf = cfg.buildSessionFactory();
        sf.close();

    }

}
