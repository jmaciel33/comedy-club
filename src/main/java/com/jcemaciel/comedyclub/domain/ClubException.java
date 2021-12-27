package com.jcemaciel.comedyclub.domain;

public class ClubException extends RuntimeException {

    public ClubException(final int status, final String message) {
        super(message);
        this.status = status;
    }

    private final int status;

    public int toStatus() {
        return status;
    }
}
