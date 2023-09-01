package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Getter
@Setter

@Table("user") // Specify the table name
public class User {

    @PrimaryKey // Mark the primary key field
    private int id;
    private String name;
    private String firstname;
    private String phonenummber;
    private String email;
    private int birthday;
    private int friendsId;
    private int teamsId;
}

