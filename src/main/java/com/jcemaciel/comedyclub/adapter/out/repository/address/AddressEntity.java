package com.jcemaciel.comedyclub.adapter.out.repository.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    private UUID id;
    @Column(name = "club_id")
    private UUID clubId;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "createdAt")
    private Date createdAt;

    public AddressEntity() {
    }

    public AddressEntity(UUID id, UUID clubId, String name, String address, Date createdAt) {
        this.id = id;
        this.clubId = clubId;
        this.name = name;
        this.address = address;
        this.createdAt = createdAt;
    }

    public AddressEntity(Builder builder) {
        this.id = builder.id;
        this.clubId = builder.clubId;
        this.name = builder.name;
        this.address = builder.address;
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

        private UUID id;
        private UUID clubId;
        private String name;
        private String address;
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

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public AddressEntity build() {
            return new AddressEntity(this);
        }
    }
}
