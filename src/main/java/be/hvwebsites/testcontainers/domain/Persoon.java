package be.hvwebsites.testcontainers.domain;

import javax.persistence.*;

@Entity
@Table(name = "personen")
public class Persoon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String voornaam;
    private String familienaam;

    public long getId() {
        return id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }
}
