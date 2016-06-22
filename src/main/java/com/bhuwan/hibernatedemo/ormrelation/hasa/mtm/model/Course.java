/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.hasa.mtm.model;

import java.util.Set;

/**
 * @author bhuwan
 *
 */
public class Course {

    private int cid;
    private String cname;
    private int fee;
    private Set<Faculty> faculties;

    /**
     * @return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid
     *            the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname
     *            the cname to set
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return the fee
     */
    public int getFee() {
        return fee;
    }

    /**
     * @param fee
     *            the fee to set
     */
    public void setFee(int fee) {
        this.fee = fee;
    }

    /**
     * @return the faculties
     */
    public Set<Faculty> getFaculties() {
        return faculties;
    }

    /**
     * @param faculties
     *            the faculties to set
     */
    public void setFaculties(Set<Faculty> faculties) {
        this.faculties = faculties;
    }

}
