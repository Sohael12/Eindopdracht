package be.sohael.projectadvanced.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Zaal {
    @Id
    private Integer id;
    private String Zaalnaam;
    private String locatie;
    private int capaciteit;
    private String beschrijving;
    private double tarief;



    public Zaal() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZaalnaam() {
        return Zaalnaam;
    }

    public void setZaalnaam(String zaalnaam) {
        Zaalnaam = zaalnaam;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public double getTarief() {
        return tarief;
    }

    public void setTarief(double tarief) {
        this.tarief = tarief;
    }
}