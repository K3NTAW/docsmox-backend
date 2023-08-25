package org.example.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class NotesEntity {
    @Id
    private UUID noteId;
    private UUID userId;
    private String title;
    private float wordcount;
    private String content;
    private LocalDateTime timestamp;
}

