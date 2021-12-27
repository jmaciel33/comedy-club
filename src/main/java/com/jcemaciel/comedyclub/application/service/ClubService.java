package com.jcemaciel.comedyclub.application.service;

import com.jcemaciel.comedyclub.application.port.in.ClubUseCase;
import com.jcemaciel.comedyclub.application.port.out.ClubPort;
import com.jcemaciel.comedyclub.domain.Club;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ClubService implements ClubUseCase {

    private ClubPort clubPort;

    public ClubService(ClubPort clubPort) {
        this.clubPort = clubPort;
    }

    @Override
    public Club save(Club club) {
        club.setId(UUID.randomUUID());
        club.setCreatedAt(new Date());
        this.clubPort.save(club);
        return this.clubPort.save(club);
    }

    @Override
    public List<Club> getAllClubs() {
        return this.clubPort.getAllClubs();
    }

    @Override
    public Club getClubById(UUID id) {
        return this.clubPort.getClubById(id);
    }

    @Override
    public void delete(UUID id) {
        this.clubPort.delete(id);
    }
}
