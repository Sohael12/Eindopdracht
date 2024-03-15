package be.sohael.projectadvanced.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collection;

@Entity
public class Reservatie {
    @Id
    private Integer id;

    private LocalDateTime reservatieDatumTijd;
    private String status;
    private String opmerkingen;
    @ManyToOne(fetch = FetchType.LAZY)// getters setteers erbij //
    private User user;

    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Zaal> zaal;


    public Reservatie() {
    }

    public Reservatie(Integer id, User user, Zaal zaal, LocalDateTime reservatieDatumTijd, String status, String opmerkingen) {
        this.id = id;
        this.user = user;
        this.reservatieDatumTijd = reservatieDatumTijd;
        this.status = status;
        this.opmerkingen = opmerkingen;
    }

    public Integer getId() {
        return id;
    }

    public Collection<Zaal> getZaal() {
        return zaal;
    }

    public void setZaal(Collection<Zaal> zaal) {
        this.zaal = zaal;
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


    public LocalDateTime getReservatieDatumTijd() {
        return reservatieDatumTijd;
    }

    public void setReservatieDatumTijd(LocalDateTime reservatieDatumTijd) {
        this.reservatieDatumTijd = reservatieDatumTijd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpmerkingen() {
        return opmerkingen;
    }

    public void setOpmerkingen(String opmerkingen) {
        this.opmerkingen = opmerkingen;
    }
}
