package org.example.entities;


import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Getter
@Setter
@Table("notes") // Specify the table name
public class Note {

    @PrimaryKey // Mark the primary key field
    @Column("id")
    private UUID Id;

    @Column("userId")
    private UUID userId;

    @Column("title")
    private String title;

    @Column("wordcount")
    private float wordcount;

    @Column("content")
    private String content;

    @Column("timestamp")
    private LocalDateTime timestamp;
}

