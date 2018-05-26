package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
public class Mennice {
    private Integer id;
    private String nazwa;
    private String opis;
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
    @Column(name = "nazwa", nullable = false, length = -1)
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "opis", nullable = true, length = -1)
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mennice mennice = (Mennice) o;

        if (id != null ? !id.equals(mennice.id) : mennice.id != null) return false;
        if (nazwa != null ? !nazwa.equals(mennice.nazwa) : mennice.nazwa != null) return false;
        if (opis != null ? !opis.equals(mennice.opis) : mennice.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "menniceByMennicaId")
    public Collection<Monety> getMonetiesById() {
        return monetiesById;
    }

    public void setMonetiesById(Collection<Monety> monetiesById) {
        this.monetiesById = monetiesById;
    }
}
