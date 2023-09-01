package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Getter
@Setter
@Table("spaces") // Specify the table name
public class Space {

    @PrimaryKey // Mark the primary key field
    private int Id;
    private int notesId;
    private int userId;
    private int subspacesId;
    private int teamsId;
    private String name;
    private String description;
    private float notescount;
}
