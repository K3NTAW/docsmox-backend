package org.example.controller;

import org.example.entities.Subspace;
import org.example.repository.SubspaceRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subspaces")
public class SubspaceController {

    private final SubspaceRepository subspaceRepository;

    public SubspaceController(SubspaceRepository subspaceRepository) {
        this.subspaceRepository = subspaceRepository;
    }

    @PostMapping
    public Subspace createSpace(@RequestBody Subspace subspace) {
        return subspaceRepository.save(subspace);
    }

    @GetMapping("/{id}")
    public Subspace getSubspaceById(@PathVariable String id) {
        return subspaceRepository.findById(Integer.valueOf(id)).orElse(null);
    }
}