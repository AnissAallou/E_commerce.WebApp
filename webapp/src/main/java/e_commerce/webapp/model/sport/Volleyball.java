package e_commerce.webapp.model.sport;

import javax.persistence.*;

@Entity
@Table(name="volleyball")
public class Volleyball {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String maillot;

    @Column(nullable = false)
    private String bas;

    @Column(nullable = false)
    private String chaussette;

    @Column(nullable = false)
    private String accessoire;
}
