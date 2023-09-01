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
<<<<<<< HEAD
    @Column("id")
    private UUID id;

    @Column("name")
    private String name;

    @Column("firstname")
=======
    private int id;
    @Column("name")
    private String name;
    @Column("lastname")
>>>>>>> 218e6b40c6d7bac53994f8bb12f563e39decc87f
    private String firstname;

    @Column("phonenumber")
    private String phonenumber;

    @Column("name")
    private String email;
<<<<<<< HEAD

    @Column("friendsid")
    private int friendsId;

    @Column("teamsid")
=======
    @Column("friendsId")
    private int friendsId;
    @Column("teamsId")
>>>>>>> 218e6b40c6d7bac53994f8bb12f563e39decc87f
    private int teamsId;

}

