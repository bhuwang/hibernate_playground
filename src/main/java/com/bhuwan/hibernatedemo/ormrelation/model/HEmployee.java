/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.model;

/**
 * @author bhuwan
 *
 */
public class HEmployee extends Employee

{
    private int wh;

    public HEmployee(int id, String name, String email, int salary, int wh) {
        super(id, name, email, salary);
        this.wh = wh;
    }

    public HEmployee() {
    }

    /**
     * @return the wh
     */
    public int getWh() {
        return wh;
    }

    /**
     * @param wh
     *            the wh to set
     */
    public void setWh(int wh) {
        this.wh = wh;
    }

}
