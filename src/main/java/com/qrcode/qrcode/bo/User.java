package com.qrcode.qrcode.bo;

import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "User")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(length = 50)
    private String nickname;

    @Column(length = 50)
    private String login;

    @Column(length = 20)
    private String password;

    @ManyToOne
    @JoinColumn(name = "qrcode_id")
    private QRCode qrcode;
/*
    @ManyToMany
    private Set<QRCode> qrcodeList;

    @ManyToMany
    private Set<QRCode> codeList;
*/
    public User() {
    }

    public User(int id, String login, String nickname, String password) {
        this.id = id;
        this.login = login;
        this.nickname = nickname;
        this.password = this.hashPassword(password);
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

    public String getNickname() {
         return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
/*
    public Set<QRCode> getQrcodeList() {
        return qrcodeList;
    }

    public void setQrcodeList(Set<QRCode> qrcodeList) {
        this.qrcodeList = qrcodeList;
    }

    public Set<QRCode> getCodeList() {
        return codeList;
    }

    public void setCodeList(Set<QRCode> codeList) {
        this.codeList = codeList;
    }
*/
    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
