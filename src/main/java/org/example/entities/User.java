package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
        import lombok.Getter;
        import lombok.Setter;

        import java.util.UUID;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    private String name;
    private String firstname;
    private String phonenummber;
    private String email;
    private int birthday;
    private UUID friendsId;
    private UUID teamsId;
}
