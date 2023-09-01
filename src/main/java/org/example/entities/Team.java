package org.example.entities;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Getter
@Setter
@Table("teams") // Specify the table name
public class Team {

    @PrimaryKey // Mark the primary key field
    private int Id;
    @Column("notesId")
    private int notesId;
    @Column("userId")
    private int userId;
    @Column("subspaceId")
    private int subspacesId;
    @Column("spacesId")
    private int spacesId;
    @Column("name")
    private String name;
    @Column("description")
    private String description;
    @Column("usercount")
    private float usercount;
}
