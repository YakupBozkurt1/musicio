package codinigio.musicio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //What does it do?
    @Column(name = "id")
    private int id;
    @Column(name= "User Name")
    private String UserName;

    @Column(name = "Password")
    private String Password;

}
