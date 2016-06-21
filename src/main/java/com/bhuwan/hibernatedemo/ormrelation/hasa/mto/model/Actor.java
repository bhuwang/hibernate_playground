/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.hasa.mto.model;

/**
 * @author bhuwan
 *
 */
public class Actor {

    private int id;
    private String actorName;

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
     * @return the actorName
     */
    public String getActorName() {
        return actorName;
    }

    /**
     * @param actorName
     *            the actorName to set
     */
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

}
