package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
public class Panujacy {
    private Integer id;
    private String nazwa;
    private Integer krajId;
    private Integer lata;
    private Collection<Monety> monetiesById;
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
    @Column(name = "kraj_id", nullable = false)
    public Integer getKrajId() {
        return krajId;
    }

    public void setKrajId(Integer krajId) {
        this.krajId = krajId;
    }

    @Basic
    @Column(name = "lata", nullable = true)
    public Integer getLata() {
        return lata;
    }

    public void setLata(Integer lata) {
        this.lata = lata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Panujacy panujacy = (Panujacy) o;

        if (id != null ? !id.equals(panujacy.id) : panujacy.id != null) return false;
        if (nazwa != null ? !nazwa.equals(panujacy.nazwa) : panujacy.nazwa != null) return false;
        if (krajId != null ? !krajId.equals(panujacy.krajId) : panujacy.krajId != null) return false;
        if (lata != null ? !lata.equals(panujacy.lata) : panujacy.lata != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (krajId != null ? krajId.hashCode() : 0);
        result = 31 * result + (lata != null ? lata.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "panujacyByPanujacyId")
    public Collection<Monety> getMonetiesById() {
        return monetiesById;
    }

    public void setMonetiesById(Collection<Monety> monetiesById) {
        this.monetiesById = monetiesById;
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
