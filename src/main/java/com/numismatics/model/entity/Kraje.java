package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
public class Kraje {
    private Integer id;
    private String nazwa;
    private Integer typId;
    private TypyKrajow typyKrajowByTypId;
    private Collection<Monety> monetiesById;
    private Collection<Panujacy> panujaciesById;

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
    @Column(name = "typ_id", nullable = false)
    public Integer getTypId() {
        return typId;
    }

    public void setTypId(Integer typId) {
        this.typId = typId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kraje kraje = (Kraje) o;

        if (id != null ? !id.equals(kraje.id) : kraje.id != null) return false;
        if (nazwa != null ? !nazwa.equals(kraje.nazwa) : kraje.nazwa != null) return false;
        if (typId != null ? !typId.equals(kraje.typId) : kraje.typId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (typId != null ? typId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "typ_id", referencedColumnName = "id", nullable = false)
    public TypyKrajow getTypyKrajowByTypId() {
        return typyKrajowByTypId;
    }

    public void setTypyKrajowByTypId(TypyKrajow typyKrajowByTypId) {
        this.typyKrajowByTypId = typyKrajowByTypId;
    }

    @OneToMany(mappedBy = "krajeByKrajId")
    public Collection<Monety> getMonetiesById() {
        return monetiesById;
    }

    public void setMonetiesById(Collection<Monety> monetiesById) {
        this.monetiesById = monetiesById;
    }

    @OneToMany(mappedBy = "krajeByKrajId")
    public Collection<Panujacy> getPanujaciesById() {
        return panujaciesById;
    }

    public void setPanujaciesById(Collection<Panujacy> panujaciesById) {
        this.panujaciesById = panujaciesById;
    }
}
