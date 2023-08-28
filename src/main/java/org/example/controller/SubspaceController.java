package org.example.controller;

import org.example.entities.Subspace;
import org.example.repository.SubspaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subspaces")
public class SubspaceController {
    @Autowired
    private SubspaceRepository subspaceRepository;

    @PostMapping
    public Subspace createSpace(@RequestBody Subspace subspace) {
        return subspaceRepository.save(subspace);
    }

    @GetMapping("/{id}")
    public Subspace getSubspaceById(@PathVariable String id) {
        return subspaceRepository.findById(id).orElse(null);
    }
}