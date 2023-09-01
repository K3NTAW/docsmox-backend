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
    @Column("id")
    private UUID id;

    @Column("name")
    private String name;

    @Column("firstname")
    private String firstname;

    @Column("phonenumber")
    private String phonenumber;

    @Column("name")
    private String email;

    @Column("friendsid")
    private int friendsId;

    @Column("teamsid")
    private int teamsId;

}

