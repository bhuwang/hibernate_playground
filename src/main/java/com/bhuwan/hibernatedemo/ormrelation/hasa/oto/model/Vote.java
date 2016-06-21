/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.hasa.oto.model;

import java.time.LocalDateTime;

/**
 * @author bhuwan
 *
 */
public class Vote {

    private int votingId;
    private String partyName;
    private LocalDateTime castedDate;
    private Voter voter;

    /**
     * @return the votingId
     */
    public int getVotingId() {
        return votingId;
    }

    /**
     * @param votingId
     *            the votingId to set
     */
    public void setVotingId(int votingId) {
        this.votingId = votingId;
    }

    /**
     * @return the partyName
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * @param partyName
     *            the partyName to set
     */
    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    /**
     * @return the castedDate
     */
    public LocalDateTime getCastedDate() {
        return castedDate;
    }

    /**
     * @param castedDate
     *            the castedDate to set
     */
    public void setCastedDate(LocalDateTime castedDate) {
        this.castedDate = castedDate;
    }

    /**
     * @return the voter
     */
    public Voter getVoter() {
        return voter;
    }

    /**
     * @param voter
     *            the voter to set
     */
    public void setVoter(Voter voter) {
        this.voter = voter;
    }

}
