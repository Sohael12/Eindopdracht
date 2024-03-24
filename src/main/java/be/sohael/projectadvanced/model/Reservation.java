package be.sohael.projectadvanced.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collection;


@Entity
public class Reservation {
    @Id
    private Integer id;

    private LocalDateTime reservatieDatumTijd;//
    private String status;
    private String opmerkingen;
    private String username;
    @ManyToOne(fetch = FetchType.LAZY) // deze doe je erbij voor  je begint eerst hier bij manytomany  dan bij venue manytoone j zo zeg je wat he is ook getters en setters vergeet niet setters getters  er bij te doen   //
    private Sporthall sporthall;
   private String equipmentinformation;
    @ManyToOne(fetch = FetchType.LAZY) // deze doe je erbij voor  je begint eerst hier bij manytomany  dan bij venue manytoone j zo zeg je wat he is ook getters en setters vergeet niet setters getters  er bij te doen   //
    private User user;
    @OneToMany(mappedBy = "reservations")
    private Collection<Equipment> equipments;

    public Reservation() {
    }



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEquipmentinformation() {
        return equipmentinformation;
    }

    public void setEquipmentinformation(String equipmentinformation) {
        this.equipmentinformation = equipmentinformation;
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


    public Collection<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Collection<Equipment> equipments) {
        this.equipments = equipments;
    }
}
