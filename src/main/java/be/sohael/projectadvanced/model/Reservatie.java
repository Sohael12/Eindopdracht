package be.sohael.projectadvanced.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity @Table(name = "registratie")
public class Reservatie {
    @Id
    private Integer id;
    @ManyToOne
    private User user;

    @ManyToOne
    private Zaal zaal;

    private Date datum;

    public Reservatie(){}

    public Reservatie(Integer id, User user, Zaal zaal, Date datum) {
        this.id = id;
        this.user = user;
        this.zaal = zaal;
        this.datum = datum;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Zaal getZaal() {
        return zaal;
    }

    public void setZaal(Zaal zaal) {
        this.zaal = zaal;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
}
