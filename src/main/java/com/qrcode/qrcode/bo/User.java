package com.qrcode.qrcode.bo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "User")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50)
    private String login;

    @Column(length = 50)
    String email;

    @Column(length = 20)
    private String password;

    @ManyToMany
    private Set<QRCode> qrcodeList;

    public User() {
    }

    public User(int id, String login, String email, String password) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
         return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<QRCode> getQrcodeList() {
        return qrcodeList;
    }

    public void setQrcodeList(Set<QRCode> qrcodeList) {
        this.qrcodeList = qrcodeList;
    }
}
