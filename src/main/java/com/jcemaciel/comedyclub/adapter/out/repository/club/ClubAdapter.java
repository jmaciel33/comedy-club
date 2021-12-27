package com.jcemaciel.comedyclub.adapter.out.repository.club;

import com.jcemaciel.comedyclub.application.port.out.ClubPort;
import com.jcemaciel.comedyclub.domain.Club;
import com.jcemaciel.comedyclub.domain.ClubException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class ClubAdapter implements ClubPort {

    private ClubRepository clubRepository;

    public ClubAdapter(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public Club save(Club club) {
        this.clubRepository.save(new ClubEntity.Builder()
                .withId(club.getId())
                .withName(club.getName())
                .withCreatedAt(club.getCreatedAt())
                .build());
        return club;
    }

    @Override
    public List<Club> getAllClubs() {
        final List<ClubEntity> clubEntities = this.clubRepository.findAll();
        final List<Club> clubs = clubEntities.stream()
                .map(clubEntity -> new Club.Builder()
                        .withId(clubEntity.getId())
                        .withName(clubEntity.getName())
                        .withCreatedAt(clubEntity.getCreatedAt())
                        .build())
                .collect(Collectors.toList());
        return clubs;
    }

    @Override
    public Club getClubById(UUID id) {
        final Optional<ClubEntity> optionalClubEntity = this.clubRepository.findById(id);
        if (optionalClubEntity.isPresent()) {
            return new Club.Builder()
                    .withId(optionalClubEntity.get().getId())
                    .withName(optionalClubEntity.get().getName())
                    .withCreatedAt(optionalClubEntity.get().getCreatedAt())
                    .build();
        } else {
            throw new ClubException(404, "Club not found");
        }
    }

    @Override
    public void delete(UUID id) {
        final Optional<ClubEntity> optionalClubEntity = this.clubRepository.findById(id);
        if (optionalClubEntity.isPresent()) {
            this.clubRepository.delete(optionalClubEntity.get());
        } else {
            throw new ClubException(404, "Club not found");
        }
    }
}
