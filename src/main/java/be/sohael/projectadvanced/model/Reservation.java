package be.sohael.projectadvanced.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Reservation {
    @Id
    private Integer id;

    private LocalDateTime reservatieDatumTijd;//
    private String status;
    private String opmerkingen;

    @ManyToOne(fetch = FetchType.LAZY) // deze doe je erbij voor  je begint eerst hier bij manytomany  dan bij venue manytoone j zo zeg je wat he is ook getters en setters vergeet niet setters getters  er bij te doen   //
    private Sporthall sporthall;

    @ManyToOne(fetch = FetchType.LAZY) // deze doe je erbij voor  je begint eerst hier bij manytomany  dan bij venue manytoone j zo zeg je wat he is ook getters en setters vergeet niet setters getters  er bij te doen   //
    private User user;

    public Reservation() {
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

    public Sporthall getSporthall() {
        return sporthall;
    }

    public void setSporthall(Sporthall sporthall) {
        this.sporthall = sporthall;
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