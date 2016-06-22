/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.annotation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bhuwan
 *
 */
@Entity
@Table(name = "student_ann")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    /*
     * if you don't want to provide any validation and keep the variable name same for table column name then you don't need to define
     * anything for simple columns.
     */
    private String name;
    private String email;
    private String address;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
