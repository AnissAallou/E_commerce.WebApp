package e_commerce.webapp.model.vetement;

import javax.persistence.*;

@Entity
@Table(name="femme")
public class Femme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String hiver;

    @Column(nullable = false)
    private String ete;
}
