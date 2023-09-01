package org.example.entities;


import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Getter
@Setter
@Table("notes") // Specify the table name
public class Note {

    @PrimaryKey // Mark the primary key field
    private int Id;

    private int userId;
    private String title;
    private float wordcount;
    private String content;
    private LocalDateTime timestamp;
}

