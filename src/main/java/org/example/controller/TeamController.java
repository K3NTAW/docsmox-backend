package org.example.controller;

import org.example.entities.Team;
import org.example.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/teams")
public class TeamController {
    @Autowired
    private TeamRepository teamRepository;

    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        return teamRepository.save(team);
    }

    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable String id) {
        return teamRepository.findById(Integer.valueOf(id)).orElse(null);
    }
}
