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

    @OneToMany(mappedBy = "user")
    private Collection<Reservatie> reservaties;

    @ManyToMany
    private Collection<Zaal> zaals;

    public User(){}



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Zaal> getZaals() {
        return zaals;
    }

    public void setZaals(Collection<Zaal> zaals) {
        this.zaals = zaals;
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




    public Collection<Reservatie> getReservaties() {
        return reservaties;
    }

    public void setReservaties(Collection<Reservatie> reservaties) {
        this.reservaties = reservaties;
    }
}
