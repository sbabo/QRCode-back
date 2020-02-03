package com.qrcode.qrcode.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "Code")
public class Code implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String libellePromotion;

    @Column(name = "Promotion")
    private int promotion;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @Temporal(TemporalType.DATE)
    private Date dateFin;

    @OneToOne(cascade = CascadeType.ALL)
    private QRCode qrCode;

    public Code() {
        super();
    }

    public Code(Long id, String libellePromotion, int promotion, String description, Date dateDebut, Date dateFin, QRCode qrCode) {
        super();
        this.id = id;
        this.libellePromotion = libellePromotion;
        this.promotion = promotion;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.qrCode = qrCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibellePromotion() {
        return libellePromotion;
    }

    public void setLibellePromotion(String libellePromotion) {
        this.libellePromotion = libellePromotion;
    }

    public int getPromotion() {
        return this.promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public QRCode getQrCode() {
        return qrCode;
    }

    public void setQrCode(QRCode qrCode) {
        this.qrCode = qrCode;
    }
}
