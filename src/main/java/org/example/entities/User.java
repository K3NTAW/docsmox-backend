package org.example.entities;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table("user") // Specify the table name
public class User {

    @PrimaryKey // Mark the primary key field
    private int id;
    @Column("name")
    private String name;
    @Column("lastname")
    private String firstname;
    @Column("phonenumber")
    private String phonenumber;
    @Column("name")
    private String email;
    @Column("friendsId")
    private int friendsId;
    @Column("teamsId")
    private int teamsId;

}

