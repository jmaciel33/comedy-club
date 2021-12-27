package com.jcemaciel.comedyclub.adapter.out.repository.event;

import java.util.Date;
import java.util.UUID;

public class EventEntity {

    private UUID id;
    private UUID clubId;
    private String name;
    private Date eventDate;
    private Date createdAt;

    public EventEntity(UUID id, UUID clubId, String name, Date eventDate, Date createdAt) {
        this.id = id;
        this.clubId = clubId;
        this.name = name;
        this.eventDate = eventDate;
        this.createdAt = createdAt;
    }

    public EventEntity(Builder builder) {
        this.id = builder.id;
        this.clubId = builder.clubId;
        this.name = builder.name;
        this.eventDate = builder.eventDate;
        this.createdAt = builder.createdAt;
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

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public static class Builder {

        private UUID id;
        private UUID clubId;
        private String name;
        private Date eventDate;
        private Date createdAt;

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withClubId(UUID clubId) {
            this.clubId = clubId;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withEventDate(Date eventDate) {
            this.eventDate = eventDate;
            return this;
        }

        public Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public EventEntity build() {
            return new EventEntity(this);
        }

    }

}
