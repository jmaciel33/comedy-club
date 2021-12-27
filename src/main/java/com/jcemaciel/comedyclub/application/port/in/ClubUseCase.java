package com.jcemaciel.comedyclub.application.port.in;

import com.jcemaciel.comedyclub.domain.Club;

import java.util.List;
import java.util.UUID;

public interface ClubUseCase {

    /**
     * Save club.
     * @param club
     * @return
     */
    Club save(Club club);

    /**
     * Get all clubs.
     * @return
     */
    List<Club> getAllClubs();

    /**
     * Get Club by Id.
     * @param id
     * @return
     */
    Club getClubById(UUID id);

    /**
     * Delete Club by Id.
     * @param id
     */
    void delete(UUID id);
}
