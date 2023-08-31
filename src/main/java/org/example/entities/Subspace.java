package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
