package main.java.com.qrcode.qrcode.bo;


import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name = "promotions")
public class Promotions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private float montant;

    @OneToMany(mappedBy = "promo", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Set<Qrcode> qrcode;

    public Promotions() {
    }

    public Promotions(int id, float montant) {
        this.id = id;
        this.montant = montant;
    }

    public Set<Qrcode> getQrcode() {
        return qrcode;
    }

    public void setQrcode(Set<Qrcode> qrcode) {
        this.qrcode = qrcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }
}
