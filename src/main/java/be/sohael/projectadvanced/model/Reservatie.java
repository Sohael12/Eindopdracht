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





    public Reservatie() {
    }

    public Reservatie(Integer id, LocalDateTime reservatieDatumTijd, String status, String opmerkingen) {
        this.id = id;
        this.reservatieDatumTijd = reservatieDatumTijd;
        this.status = status;
        this.opmerkingen = opmerkingen;
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
