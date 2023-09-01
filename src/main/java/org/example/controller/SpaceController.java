package org.example.controller;

import org.example.entities.Space;
import org.example.repository.SpaceRepository;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Space getSpaceById(@PathVariable String id) {
        return spaceRepository.findById(Integer.valueOf(id)).orElse(null);
    }
}