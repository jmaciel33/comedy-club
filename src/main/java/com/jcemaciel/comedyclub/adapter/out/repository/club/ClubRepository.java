package com.jcemaciel.comedyclub.adapter.out.repository.club;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClubRepository extends JpaRepository<ClubEntity, UUID> {
}
