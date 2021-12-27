package com.jcemaciel.comedyclub.domain;

public class ComedyClubException extends RuntimeException {

    public ComedyClubException(final int status, final String message) {
        super(message);
        this.status = status;
    }

    private final int status;

    public int toStatus() {
        return status;
    }
}
