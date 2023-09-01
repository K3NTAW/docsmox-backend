package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Getter
@Setter
@Table("subspaces") // Specify the table name
public class Subspace {

    @PrimaryKey // Mark the primary key field
    @Column("id")
    private UUID Id;

    @Column("notesId")
    private UUID notesId;

    @Column("userId")
    private UUID userId;

    @Column("spacesId")
    private UUID spacesId;

    @Column("teamsid")
    private UUID teamsId;

    @Column("name")
    private String name;

    @Column("description")
    private String description;

    @Column("notescount")
    private float notescount;
}
