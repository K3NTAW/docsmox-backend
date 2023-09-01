package org.example.controller;

import org.example.entities.Note;
import org.example.repository.NoteRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable String id) {
        return noteRepository.findById(Integer.valueOf(id)).orElse(null);
    }
}

