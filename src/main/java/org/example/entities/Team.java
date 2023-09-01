package org.example.entities;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;


@Getter
@Setter
@Table("teams") // Specify the table name
public class Team {

    @PrimaryKey // Mark the primary key field
    @Column("id")
    private UUID Id;

    @Column("notesId")
    private UUID notesId;

    @Column("userId")
    private UUID userId;

    @Column("subspaceId")
    private UUID subspacesId;

    @Column("spacesId")
    private UUID spacesId;

    @Column("name")
    private String name;

    @Column("description")
    private String description;

    @Column("usercount")
    private float usercount;
}
