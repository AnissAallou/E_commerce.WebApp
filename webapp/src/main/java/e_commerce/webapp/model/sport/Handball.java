package e_commerce.webapp.model.sport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Handball {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String maillot;

    private String bas;

    private String chaussette;

    private String accessoire;
}
