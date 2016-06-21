/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.model;

/**
 * @author bhuwan
 *
 */
public class Admin extends Employee

{
    private String branchName;

    public Admin(int id, String name, String email, int salary, String branchName) {
        super(id, name, email, salary);
        this.branchName = branchName;
    }

    public Admin() {
    }

    /**
     * @return the branchName
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * @param branchName
     *            the branchName to set
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
