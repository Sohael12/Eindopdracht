package be.sohael.projectadvanced.model;

import jakarta.persistence.*;

import java.util.Collection;


@Entity
public class Reservation {
    @Id
    private Integer id;
    private String status;
    private String comments;


    @ManyToOne(fetch = FetchType.LAZY) // deze doe je erbij voor  je begint eerst hier bij manytomany  dan bij venue manytoone j zo zeg je wat he is ook getters en setters vergeet niet setters getters  er bij te doen   //
    private Sporthall sporthall;
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



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getComments() {
        return comments;
    }

    public void setComments(String opmerkingen) {
        this.comments = opmerkingen;
    }


    public Collection<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Collection<Equipment> equipments) {
        this.equipments = equipments;
    }
}
