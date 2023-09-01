package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table("user") // Specify the table name
public class User {

    @PrimaryKey // Mark the primary key field
    private int id;

    private String name;
    private String firstname;
    private String phonenumber;
    private String email;
    private int friendsId;
    private int teamsId;
}

