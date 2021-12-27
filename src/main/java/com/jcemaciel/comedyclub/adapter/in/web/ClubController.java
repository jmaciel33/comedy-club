package com.jcemaciel.comedyclub.adapter.in.web;

import com.jcemaciel.comedyclub.application.port.in.ClubUseCase;
import com.jcemaciel.comedyclub.domain.Club;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/club", produces = "application/json;charset=utf-8")
public class ClubController {

    private ClubUseCase clubUseCase;

    public ClubController(ClubUseCase clubUseCase) {
        this.clubUseCase = clubUseCase;
    }

    @PostMapping
    private Club save(@RequestBody Club club) {
        return this.clubUseCase.save(club);
    }

    @GetMapping("{id}")
    private Club getClubById(@PathVariable UUID id) {
        return this.clubUseCase.getClubById(id);
    }

    @GetMapping
    private List<Club> getAllClubs() {
        return this.clubUseCase.getAllClubs();
    }

    @PutMapping
    private Club update(@RequestBody Club club) {
        return this.clubUseCase.save(club);
    }

    @DeleteMapping
    private void delete(UUID id) {
        this.clubUseCase.delete(id);
    }

}
