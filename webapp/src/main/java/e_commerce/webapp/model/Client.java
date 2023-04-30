package e_commerce.webapp.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity

@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name="client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private int telephone;
    @Column(nullable = false)
    private String ville;

    @Column(nullable = false)
    private int code_postale;
}
