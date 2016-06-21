/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.model;

/**
 * @author bhuwan
 *
 */
public class Employee {

    private int id;
    private String name;
    private String email;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.id = id;
    }

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
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary
     *            the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
