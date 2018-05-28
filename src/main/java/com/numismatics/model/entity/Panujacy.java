package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 28-May-18.
 */
@Entity
public class Panujacy {
    private Integer id;
    private String nazwa;
    private Integer lata;
    private Kraje krajeByKrajId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nazwa", nullable = false, length = -1)
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "lata", nullable = true)
    public Integer getLata() {
        return lata;
    }

    public void setLata(Integer lata) {
        this.lata = lata;
    }

    @ManyToOne
    @JoinColumn(name = "kraj_id", referencedColumnName = "id", nullable = false)
    public Kraje getKrajeByKrajId() {
        return krajeByKrajId;
    }

    public void setKrajeByKrajId(Kraje krajeByKrajId) {
        this.krajeByKrajId = krajeByKrajId;
    }
}
