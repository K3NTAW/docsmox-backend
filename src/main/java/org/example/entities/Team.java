package org.example.entities;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Getter
@Setter
@Table("teams") // Specify the table name
public class Team {

    @PrimaryKey // Mark the primary key field
    private int Id;
    private int notesId;
    private int userId;
    private int subspacesId;
    private int spacesId;
    private String name;
    private String description;
    private float usercount;
}
