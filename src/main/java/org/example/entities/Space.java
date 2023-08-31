package org.example.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private int notesId;
    private int userId;
    private int subspacesId;
    private int teamsId;
    private String name;
    private String description;
    private float notescount;
}
