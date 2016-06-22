/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.hasa.mtm.model;

import java.util.Set;

/**
 * @author bhuwan
 *
 */
public class Faculty {

    private int fid;
    private String fname;
    private int yearExp;
    private Set<Course> courses;

    /**
     * @return the fid
     */
    public int getFid() {
        return fid;
    }

    /**
     * @param fid
     *            the fid to set
     */
    public void setFid(int fid) {
        this.fid = fid;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname
     *            the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the yearExp
     */
    public int getYearExp() {
        return yearExp;
    }

    /**
     * @param yearExp
     *            the yearExp to set
     */
    public void setYearExp(int yearExp) {
        this.yearExp = yearExp;
    }

    /**
     * @return the courses
     */
    public Set<Course> getCourses() {
        return courses;
    }

    /**
     * @param courses
     *            the courses to set
     */
    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

}
