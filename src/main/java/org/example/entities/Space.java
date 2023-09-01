package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;


@Getter
@Setter
@Table("spaces") // Specify the table name
public class Space {

    @PrimaryKey // Mark the primary key field
    @Column("id")
    private UUID Id;

    @Column("notesId")
    private UUID notesId;

    @Column("userId")
    private UUID userId;

    @Column("subspacesId")
    private UUID subspacesId;

    @Column("teamsId")
    private UUID teamsId;

    @Column("name")
    private String name;

    @Column("description")
    private String description;

    @Column("notescount")
    private float notescount;
}
