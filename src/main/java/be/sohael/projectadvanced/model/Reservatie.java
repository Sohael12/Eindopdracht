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

    @ManyToOne(fetch = FetchType.LAZY) // deze doe je erbij voor  je begint eerst hier bij manytomany  dan bij venue manytoone j zo zeg je wat he is ook getters en setters vergeet niet setters getters  er bij te doen   //
    private Zaal zaal;

    @ManyToOne(fetch = FetchType.LAZY) // deze doe je erbij voor  je begint eerst hier bij manytomany  dan bij venue manytoone j zo zeg je wat he is ook getters en setters vergeet niet setters getters  er bij te doen   //
    private User user;

    public Reservatie() {
    }



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }




    public LocalDateTime getReservatieDatumTijd() {
        return reservatieDatumTijd;
    }

    public Zaal getZaal() {
        return zaal;
    }

    public void setZaal(Zaal zaal) {
        this.zaal = zaal;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
