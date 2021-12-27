package com.jcemaciel.comedyclub.domain;

import java.util.Date;
import java.util.UUID;

public class Comedian {

    private UUID id;
    private String name;
    private UUID clubId;
    private Date createdAt;

    public Comedian(UUID id, String name, UUID clubId, Date createdAt) {
        this.id = id;
        this.name = name;
        this.clubId = clubId;
        this.createdAt = createdAt;
    }

    public Comedian(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.clubId = builder.clubId;
        this.createdAt = builder.createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getClubId() {
        return clubId;
    }

    public void setClubId(UUID clubId) {
        this.clubId = clubId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public static class Builder {

        private UUID id;
        private String name;
        private UUID clubId;
        private Date createdAt;

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withClubId(UUID clubId) {
            this.clubId = clubId;
            return this;
        }

        public Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Comedian build() {
            return new Comedian(this);
        }

    }
}
