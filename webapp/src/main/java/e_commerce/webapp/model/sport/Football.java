package e_commerce.webapp.model.sport;

import javax.persistence.*;

@Entity
@Table(name="football")
public class Football {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "maillot")
    private String maillot;

    @Column(name = "bas")
    private String bas;

    @Column(name = "chaussette")
    private String chaussette;

    @Column(name = "accessoire" )
    private String accessoire;

}
