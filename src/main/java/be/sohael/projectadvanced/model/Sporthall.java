package be.sohael.projectadvanced.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Collection;
import java.util.List;


@Entity
public class Sporthall {
    @Id

    private Integer id;

    @NotBlank
    private String zaalnaam;
    private String locatie;
    private int capaciteit;
    private String beschrijving;
    private double tarief;
    private String imageUrl;
    private boolean kleedkamers;
    @ElementCollection
    private List<String> beschikbareTijden;



    @OneToMany(mappedBy = "sporthall")
    private Collection<Reservation> reservations;



    public Sporthall() {
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getZaalnaam() {
        return zaalnaam;
    }



    public List<String> getBeschikbareTijden() {
        return beschikbareTijden;
    }

    public void setBeschikbareTijden(List<String> beschikbareTijden) {
        this.beschikbareTijden = beschikbareTijden;
    }


    public void setZaalnaam(String zaalnaam) {
        this.zaalnaam = zaalnaam;
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



    public boolean isKleedkamers() {
        return kleedkamers;
    }

    public void setKleedkamers(boolean kleedkamers) {
        this.kleedkamers = kleedkamers;
    }





}