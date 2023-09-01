package org.example.controller;

import org.example.entities.Subspace;
import org.example.entities.Team;
import org.example.repository.SubspaceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/subspaces")
public class SubspaceController {

    private final SubspaceRepository subspaceRepository;

    public SubspaceController(SubspaceRepository subspaceRepository) {
        this.subspaceRepository = subspaceRepository;
    }

    @PostMapping
    public Subspace createSpace(@RequestBody Subspace subspace) {
        subspace.setId(UUID.randomUUID());
        return subspaceRepository.save(subspace);
    }
    @GetMapping("")
    public List<Subspace> getAllSubspace() {
        return subspaceRepository.findAll();
    }
    @GetMapping("/{id}")
    public Subspace getSubspaceById(@PathVariable UUID id) {
        return subspaceRepository.findById(id).orElse(null);
    }
}