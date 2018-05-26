package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
public class Kruszce {
    private Integer id;
    private String typ;
    private Double cena;
    private Collection<Monety> monetiesById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kruszce kruszce = (Kruszce) o;

        if (id != null ? !id.equals(kruszce.id) : kruszce.id != null) return false;
        if (typ != null ? !typ.equals(kruszce.typ) : kruszce.typ != null) return false;
        if (cena != null ? !cena.equals(kruszce.cena) : kruszce.cena != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (typ != null ? typ.hashCode() : 0);
        result = 31 * result + (cena != null ? cena.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "kruszceByKruszecId")
    public Collection<Monety> getMonetiesById() {
        return monetiesById;
    }

    public void setMonetiesById(Collection<Monety> monetiesById) {
        this.monetiesById = monetiesById;
    }
}
