package org.example.controller;

import org.example.entities.NotesEntity;
import org.example.repository.DocsmoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DocsmoxController {

    @Autowired
    private DocsmoxRepository docsmoxRepository;

    @GetMapping("/notes")
    public List<NotesEntity> getAllNotes() {
        return docsmoxRepository.findAll();
    }
}
