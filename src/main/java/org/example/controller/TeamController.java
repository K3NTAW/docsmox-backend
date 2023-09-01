package org.example.controller;

import org.example.entities.Team;
import org.example.entities.User;
import org.example.repository.TeamRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/teams")
public class TeamController {

    private final TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        team.setId(UUID.randomUUID());
        return teamRepository.save(team);
    }
    @GetMapping("")
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable UUID id) {
        return teamRepository.findById(id).orElse(null);
    }
}
