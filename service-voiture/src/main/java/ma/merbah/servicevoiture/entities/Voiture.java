package ma.merbah.servicevoiture.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    private Long id_client;
    @Transient
    @ManyToOne
    private Client client;

    public Voiture(long id, String matricule, String marque, String model, long id_client) {
        this.id=id;
        this.marque=marque;
        this.model=model;
        this.id_client=id_client;
        this.matricule=matricule;
    }
}

