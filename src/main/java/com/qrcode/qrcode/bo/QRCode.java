package com.qrcode.qrcode.bo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "QRCode")
public class QRCode implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(length=50)
    private String codeImage;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Code codePromo;

/*
    @OneToMany(mappedBy = "qrcode")
    private Set<User> users;
*/
    public QRCode() {
    }

    public QRCode(Long id, String codeImage, Code codePromo) {
        this.id = id;
        this.codeImage = codeImage;
        this.codePromo = codePromo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Code getCodePromo() {
        return codePromo;
    }

    public void setCodePromo(Code codePromo) {
        this.codePromo = codePromo;
    }

    public String getCodeImage() {
        return codeImage;
    }

    public void setCodeImage(String codeImage) {
        this.codeImage = codeImage;
    }
}
