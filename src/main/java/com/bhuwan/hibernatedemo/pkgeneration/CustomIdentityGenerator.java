/**
 * 
 */
package com.bhuwan.hibernatedemo.pkgeneration;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

/**
 * @author bhuwan
 *
 */
public class CustomIdentityGenerator extends IdentityGenerator {

    static final String MOVIE = "MOV";

    @Override
    public Serializable generate(SharedSessionContractImplementor s, Object obj) {
        Connection connection = s.connection();
        String id = MOVIE;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select next_val from hibernate_sequence");
            if (rs.next()) {
                id = MOVIE + rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
}
