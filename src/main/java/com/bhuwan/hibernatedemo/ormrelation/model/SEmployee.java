/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.model;

/**
 * @author bhuwan
 *
 */
public class SEmployee extends Employee

{
    private String tool;

    public SEmployee(int id, String name, String email, int salary, String tool) {
        super(id, name, email, salary);
        this.tool = tool;
    }

    public SEmployee() {
    }

    /**
     * @return the tool
     */
    public String getTool() {
        return tool;
    }

    /**
     * @param tool
     *            the tool to set
     */
    public void setTool(String tool) {
        this.tool = tool;
    }
}
