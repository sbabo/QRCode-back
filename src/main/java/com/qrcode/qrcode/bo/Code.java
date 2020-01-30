package com.qrcode.qrcode.bo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Code")
public class Code implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String code;
    private String description;

    public Code() {
        super();
    }

    public Code(Long id, String code, String description) {
        super();
        this.id = id;
        this.code = code;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
