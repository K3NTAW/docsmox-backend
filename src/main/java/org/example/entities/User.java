package org.example.entities;

        import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.GenerationType;
        import lombok.Getter;
        import lombok.Setter;

        import java.util.UUID;

@Entity
@Getter
@Setter
public class User {
    @jakarta.persistence.Id
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
