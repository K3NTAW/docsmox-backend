package org.example.entities;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

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
>>>>>>> 78b733f3572af52c0d88305914144d4e56b1800d
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
>>>>>>> 78b733f3572af52c0d88305914144d4e56b1800d
    private int teamsId;

}

