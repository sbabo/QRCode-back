package com.qrcode.qrcode.bo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "QRCode")
public class QRCode implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length=50)
    private String codeImage;


    @ManyToOne
    @JoinColumn(name = "id_promotion")
    private Promotions promo;

    @ManyToMany
    private Set<User> users;

    public QRCode() {
    }

    public QRCode(int id, String codeImage, Promotions promotion) {
        this.id = id;
        this.codeImage = codeImage;
        this.promo = promotion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Promotions getPromo() {
        return promo;
    }

    public void setPromo(Promotions promo) {
        this.promo = promo;
    }

    public String getCodeImage() {
        return codeImage;
    }

    public void setCodeImage(String codeImage) {
        this.codeImage = codeImage;
    }
}
