package main.java.com.qrcode.qrcode.bo;

import main.java.com.qrcode.qrcode.bo.Promotions;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "qrcode")
public class Qrcode implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(lenght=50)
    private String code;

    @ManyToOne
    @JoinColumn(name = "id_promotion")
    private Promotions promo;

    @ManyToMany
    private Set<Utilisateur> utilisateur;

    public Qrcode() {
    }

    public Qrcode(int id, int promo, String code, Promotions promotion) {
        this.id = id;
        this.code = code;
        this.promo = promotion;
        //is valid
            }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPromo() {
        return promo;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
