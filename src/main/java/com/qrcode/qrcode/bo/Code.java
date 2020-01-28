package com.qrcode.qrcode.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Code implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String description;
}
