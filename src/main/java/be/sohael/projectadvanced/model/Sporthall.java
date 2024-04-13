package be.sohael.projectadvanced.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;
import java.util.Date;


@Entity
public class Sporthall {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @NotBlank
    private String roomname;
    private String location;
    private int capacity;
    private String description;
    private double rate;
    private String imageUrl;
    private boolean dressingrooms;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private Date date;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    @NotNull
    private Date sporthallopening;


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

    public String getRoomname() {
        return roomname;
    }



    public void setRoomname(String zaalnaam) {
        this.roomname = zaalnaam;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getSporthallopening() {
        return sporthallopening;
    }

    public void setSporthallopening(Date sporthallopening) {
        this.sporthallopening = sporthallopening;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String locatie) {
        this.location = locatie;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capaciteit) {
        this.capacity = capaciteit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String beschrijving) {
        this.description = beschrijving;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double tarief) {
        this.rate = tarief;
    }



    public boolean isDressingrooms() {
        return dressingrooms;
    }

    public void setDressingrooms(boolean kleedkamers) {
        this.dressingrooms = kleedkamers;
    }





}