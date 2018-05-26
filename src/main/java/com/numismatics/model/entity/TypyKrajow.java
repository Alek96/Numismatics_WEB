package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
@Table(name = "typy_krajow", schema = "public", catalog = "dde690ho440f18")
public class TypyKrajow {
    private Integer id;
    private String nazwa;
    private Collection<Kraje> krajesById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypyKrajow that = (TypyKrajow) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "typyKrajowByTypId")
    public Collection<Kraje> getKrajesById() {
        return krajesById;
    }

    public void setKrajesById(Collection<Kraje> krajesById) {
        this.krajesById = krajesById;
    }
}
