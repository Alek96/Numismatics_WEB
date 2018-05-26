package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
public class Stany {
    private Integer id;
    private String nazwa;
    private Integer typId;
    private Collection<Monety> monetiesById;
    private TypyStanow typyStanowByTypId;

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

        Stany stany = (Stany) o;

        if (id != null ? !id.equals(stany.id) : stany.id != null) return false;
        if (nazwa != null ? !nazwa.equals(stany.nazwa) : stany.nazwa != null) return false;
        if (typId != null ? !typId.equals(stany.typId) : stany.typId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (typId != null ? typId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "stanyByStanId")
    public Collection<Monety> getMonetiesById() {
        return monetiesById;
    }

    public void setMonetiesById(Collection<Monety> monetiesById) {
        this.monetiesById = monetiesById;
    }

    @ManyToOne
    @JoinColumn(name = "typ_id", referencedColumnName = "id", nullable = false)
    public TypyStanow getTypyStanowByTypId() {
        return typyStanowByTypId;
    }

    public void setTypyStanowByTypId(TypyStanow typyStanowByTypId) {
        this.typyStanowByTypId = typyStanowByTypId;
    }
}
