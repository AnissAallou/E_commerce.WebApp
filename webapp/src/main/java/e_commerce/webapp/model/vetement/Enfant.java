package e_commerce.webapp.model.vetement;

import javax.persistence.*;

@Entity
@Table(name="enfant")
public class Enfant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String hiver;

    @Column(nullable = false)
    private String ete;
}
