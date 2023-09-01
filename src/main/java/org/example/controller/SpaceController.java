package org.example.controller;

import org.example.entities.Space;
import org.example.entities.Team;
import org.example.repository.SpaceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/spaces")
public class SpaceController {

    private final SpaceRepository spaceRepository;

    public SpaceController(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    @PostMapping
    public Space createSpace(@RequestBody Space space) {
        return spaceRepository.save(space);
    }
    @GetMapping("")
    public List<Space> getAllSpaces() {
        return spaceRepository.findAll();
    }
    @GetMapping("/{id}")
    public Space getSpaceById(@PathVariable int id) {
        return spaceRepository.findById(id).orElse(null);
    }
}