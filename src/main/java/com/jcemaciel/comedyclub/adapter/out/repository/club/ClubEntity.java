package com.jcemaciel.comedyclub.adapter.out.repository.club;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "club")
public class ClubEntity {

    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "createdAt")
    private Date createdAt;

    public ClubEntity() {
    }

    public ClubEntity(UUID id, String name, Date createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public ClubEntity(Builder builder) {
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

        public ClubEntity build() {
            return new ClubEntity(this);
        }
    }

}
