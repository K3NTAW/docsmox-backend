package org.example.controller;

import org.example.entities.Subspace;
import org.example.entities.Team;
import org.example.repository.SubspaceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("")
    public List<Subspace> getAllSubspace() {
        return subspaceRepository.findAll();
    }
    @GetMapping("/{id}")
    public Subspace getSubspaceById(@PathVariable int id) {
        return subspaceRepository.findById(id).orElse(null);
    }
}