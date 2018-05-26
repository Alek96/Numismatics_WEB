package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
@Table(name = "typy_stanow", schema = "public", catalog = "dde690ho440f18")
public class TypyStanow {
    private Integer id;
    private String nazwa;
    private Collection<FirmyCertyfikujace> firmyCertyfikujacesById;
    private Collection<FirmyCertyfikujace> firmyCertyfikujacesById_0;
    private Collection<Stany> staniesById;

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

        TypyStanow that = (TypyStanow) o;

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

    @OneToMany(mappedBy = "typyStanowByTypStanuId")
    public Collection<FirmyCertyfikujace> getFirmyCertyfikujacesById() {
        return firmyCertyfikujacesById;
    }

    public void setFirmyCertyfikujacesById(Collection<FirmyCertyfikujace> firmyCertyfikujacesById) {
        this.firmyCertyfikujacesById = firmyCertyfikujacesById;
    }

    @OneToMany(mappedBy = "typyStanowByTypLustrzankiId")
    public Collection<FirmyCertyfikujace> getFirmyCertyfikujacesById_0() {
        return firmyCertyfikujacesById_0;
    }

    public void setFirmyCertyfikujacesById_0(Collection<FirmyCertyfikujace> firmyCertyfikujacesById_0) {
        this.firmyCertyfikujacesById_0 = firmyCertyfikujacesById_0;
    }

    @OneToMany(mappedBy = "typyStanowByTypId")
    public Collection<Stany> getStaniesById() {
        return staniesById;
    }

    public void setStaniesById(Collection<Stany> staniesById) {
        this.staniesById = staniesById;
    }
}
