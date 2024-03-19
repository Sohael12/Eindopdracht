package be.sohael.projectadvanced.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BicycleParking {
    @Id
    private int id;
    private String name;
    private String street;
    private String number;
    private double pricePerDayInEur;
    private boolean rainProof;
    private boolean guarded;
    private int numberOfPlaces;
    private int numberOfPlacesFree;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getPricePerDayInEur() {
        return pricePerDayInEur;
    }

    public void setPricePerDayInEur(double pricePerDayInEur) {
        this.pricePerDayInEur = pricePerDayInEur;
    }

    public boolean isRainProof() {
        return rainProof;
    }

    public void setRainProof(boolean rainProof) {
        this.rainProof = rainProof;
    }

    public boolean isGuarded() {
        return guarded;
    }

    public void setGuarded(boolean guarded) {
        this.guarded = guarded;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getNumberOfPlacesFree() {
        return numberOfPlacesFree;
    }

    public void setNumberOfPlacesFree(int numberOfPlacesFree) {
        this.numberOfPlacesFree = numberOfPlacesFree;
    }
}
