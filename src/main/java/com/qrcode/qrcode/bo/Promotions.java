package com.qrcode.qrcode.bo;


import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "promotions")
public class Promotions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String codePromo;

    @OneToMany(mappedBy = "promo", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Set<QRCode> qrCodes;

    public Promotions() {
    }

    public Promotions(int id, String codePromo) {
        this.id = id;
        this.codePromo = codePromo;
    }

    public Set<QRCode> getQrCodes() {
        return qrCodes;
    }

    public void setQrCodes(Set<QRCode> qrCodes) {
        this.qrCodes = qrCodes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodePromo() {
        return codePromo;
    }

    public void setCodePromo(String codePromo) {
        this.codePromo = codePromo;
    }
}
