package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Note {
    @Id
    private int Id;
    private int userId;
    private String title;
    private float wordcount;
    private String content;
    private LocalDateTime timestamp;
}

