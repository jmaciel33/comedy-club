package com.jcemaciel.comedyclub.domain;

import java.util.Date;
import java.util.UUID;

public class Address {

    private UUID id;
    private UUID clubId;
    private String name;
    private String address;
    private Date createdAt;

    public Address(UUID id, UUID clubId, String name, String address, Date createdAt) {
        this.id = id;
        this.clubId = clubId;
        this.name = name;
        this.address = address;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getClubId() {
        return clubId;
    }

    public void setClubId(UUID clubId) {
        this.clubId = clubId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public static class Builder {

    }


}
