package be.sohael.projectadvanced.model;

import jakarta.persistence.*;



@Entity
public class Equipment  {
    @Id
    private Integer id;
    private String article;
    private double price;
    private String sport;

    private String brand;

    private boolean available;

    private String imageUrl;
   @ManyToOne(fetch = FetchType.LAZY)
   private Reservation reservations;
    public Equipment(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double prijs) {
        this.price = prijs;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String merk) {
        this.brand = merk;
    }

    public Reservation getReservations() {
        return reservations;
    }

    public void setReservations(Reservation reservations) {
        this.reservations = reservations;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean beschikbaar) {
        this.available = beschikbaar;
    }




}
