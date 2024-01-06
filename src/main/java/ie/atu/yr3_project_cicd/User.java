package ie.atu.yr3_project_cicd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String Name;
    private String Email;
    private String Address;
    private String Password;

    public User(String name,String password) {
        Name = name;
        Password = password;
    }
}
