package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Subspace {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private int notesId;
    private int userId;
    private int spacesId;
    private int teamsId;
    private String name;
    private String description;
    private float notescount;
}
