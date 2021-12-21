package com.jcemaciel.comedyclub.domain;

import java.util.Date;
import java.util.UUID;

public class Club {

    private UUID id;
    private String name;
    private Date createdAt;

    public Club(UUID id, String name, Date createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public Club(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public static class Builder {

        private UUID id;
        private String name;
        private Date createdAt;

        public Builder() {
        }

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Club build() {
            return new Club(this);
        }
    }

}
