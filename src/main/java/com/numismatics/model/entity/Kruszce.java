package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 28-May-18.
 */
@Entity
public class Kruszce {
    private Integer id;
    private String typ;
    private Double cena;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "typ", nullable = false, length = -1)
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Basic
    @Column(name = "cena", nullable = false, precision = 0)
    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

}
