package be.sohael.projectadvanced.model;

import jakarta.persistence.*;

import java.util.Collection;


@Entity @Table(name ="zaaluser")
public class User {
    @Id
    private Integer id;

    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String image;

    @OneToMany(mappedBy = "user")
    private Collection<Reservation> reservations;

    @ManyToMany
    private Collection<Sporthall> sporthalls;

    public User(){}


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Sporthall> getSporthalls() {
        return sporthalls;
    }

    public void setSporthalls(Collection<Sporthall> zaals) {
        this.sporthalls = zaals;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Collection<Reservation> reservations) {
        this.reservations = reservations;
    }
}
