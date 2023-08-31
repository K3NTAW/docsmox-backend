package org.example.services;

import org.example.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocsmoxServices {

    @Autowired
    public DocsmoxServices(NoteRepository docsmoxRepository) {
    }

}


