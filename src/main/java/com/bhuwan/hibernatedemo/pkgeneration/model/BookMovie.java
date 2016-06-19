/**
 * 
 */
package com.bhuwan.hibernatedemo.pkgeneration.model;

/**
 * @author bhuwan
 *
 */
public class BookMovie {

    private Long id;
    private String movie;
    private String showtime;
    private int seat;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the movie
     */
    public String getMovie() {
        return movie;
    }

    /**
     * @param movie
     *            the movie to set
     */
    public void setMovie(String movie) {
        this.movie = movie;
    }

    /**
     * @return the showtime
     */
    public String getShowtime() {
        return showtime;
    }

    /**
     * @param showtime
     *            the showtime to set
     */
    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    /**
     * @return the seat
     */
    public int getSeat() {
        return seat;
    }

    /**
     * @param seat
     *            the seat to set
     */
    public void setSeat(int seat) {
        this.seat = seat;
    }

}
