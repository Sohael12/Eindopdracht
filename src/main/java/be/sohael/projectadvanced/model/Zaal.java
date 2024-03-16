package be.sohael.projectadvanced.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;


@Entity
public class Zaal {
    @Id
    private Integer id;
    private String zaalnaam;
    private String locatie;
    private int capaciteit;
    private String beschrijving;
    private double tarief;
    private String image;

    @ElementCollection
    private List<String> beschikbareTijden;

    private boolean kleedkamers;

    @OneToMany(mappedBy = "zaal")
    private Collection<Reservatie> reservaties;

    @ManyToMany(mappedBy = "zaals")
    private Collection<User> users;

    public Zaal() {
    }



    public Zaal(Integer id, String zaalnaam,List<String> beschikbareTijden, String locatie, int capaciteit, String beschrijving, double tarief, String image, boolean kleedkamers) {
        this.id = id;
        this.zaalnaam = zaalnaam;
        this.locatie = locatie;
        this.capaciteit = capaciteit;
        this.beschrijving = beschrijving;
        this.tarief = tarief;
        this.image = image;
        this.kleedkamers = kleedkamers;
        this.beschikbareTijden = beschikbareTijden;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isKleedkamers() {
        return kleedkamers;
    }

    public void setKleedkamers(boolean kleedkamers) {
        this.kleedkamers = kleedkamers;
    }



    public Collection<Reservatie> getReservaties() {
        return reservaties;
    }

    public void setReservaties(Collection<Reservatie> reservaties) {
        this.reservaties = reservaties;
    }



    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}