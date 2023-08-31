package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    private UUID notesId;
    private UUID userId;
    private UUID subspacesId;
    private UUID spacesId;
    private String name;
    private String description;
    private float usercount;
}
