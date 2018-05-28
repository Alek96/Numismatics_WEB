package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 28-May-18.
 */
@Entity
public class Kraje {
    private Integer id;
    private String nazwa;
    private TypyKrajow typyKrajowByTypId;

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

    @ManyToOne
    @JoinColumn(name = "typ_id", referencedColumnName = "id", nullable = false)
    public TypyKrajow getTypyKrajowByTypId() {
        return typyKrajowByTypId;
    }

    public void setTypyKrajowByTypId(TypyKrajow typyKrajowByTypId) {
        this.typyKrajowByTypId = typyKrajowByTypId;
    }

}
