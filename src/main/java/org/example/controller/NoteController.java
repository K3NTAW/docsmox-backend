package org.example.controller;

import org.example.entities.Note;
import org.example.entities.Team;
import org.example.repository.NoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        note.setId(UUID.randomUUID());
        return noteRepository.save(note);
    }
    @GetMapping("")
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable UUID id) {
        return noteRepository.findById(id).orElse(null);
    }
}

