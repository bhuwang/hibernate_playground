/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.hasa.mto.model;

/**
 * @author bhuwan
 *
 */
public class Movie {

    private int id;
    private String movieName;
    private Actor actor;

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
     * @return the movieName
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * @param movieName
     *            the movieName to set
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    /**
     * @return the actor
     */
    public Actor getActor() {
        return actor;
    }

    /**
     * @param actor
     *            the actor to set
     */
    public void setActor(Actor actor) {
        this.actor = actor;
    }

}
