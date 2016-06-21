/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.hasa.otm.model;

import java.util.Set;

/**
 * @author bhuwan
 *
 */
public class Actor {

    private int id;
    private String actorName;
    private Set<Movie> movies;

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

    /**
     * @return the movies
     */
    public Set<Movie> getMovies() {
        return movies;
    }

    /**
     * @param movies
     *            the movies to set
     */
    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

}
