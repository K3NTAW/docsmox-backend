package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class TeamsEntity {
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
