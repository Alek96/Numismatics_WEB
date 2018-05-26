package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
@Table(name = "firmy_certyfikujace", schema = "public", catalog = "dde690ho440f18")
public class FirmyCertyfikujace {
    private Integer id;
    private String nazwa;
    private Integer typStanuId;
    private Integer typLustrzankiId;
    private Collection<Certyfikaty> certyfikatiesById;
    private TypyStanow typyStanowByTypStanuId;
    private TypyStanow typyStanowByTypLustrzankiId;
    private String skrot;

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
    @Column(name = "typ_stanu_id", nullable = true)
    public Integer getTypStanuId() {
        return typStanuId;
    }

    public void setTypStanuId(Integer typStanuId) {
        this.typStanuId = typStanuId;
    }

    @Basic
    @Column(name = "typ_lustrzanki_id", nullable = true)
    public Integer getTypLustrzankiId() {
        return typLustrzankiId;
    }

    public void setTypLustrzankiId(Integer typLustrzankiId) {
        this.typLustrzankiId = typLustrzankiId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FirmyCertyfikujace that = (FirmyCertyfikujace) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (typStanuId != null ? !typStanuId.equals(that.typStanuId) : that.typStanuId != null) return false;
        if (typLustrzankiId != null ? !typLustrzankiId.equals(that.typLustrzankiId) : that.typLustrzankiId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (typStanuId != null ? typStanuId.hashCode() : 0);
        result = 31 * result + (typLustrzankiId != null ? typLustrzankiId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "firmyCertyfikujaceByFirmaId")
    public Collection<Certyfikaty> getCertyfikatiesById() {
        return certyfikatiesById;
    }

    public void setCertyfikatiesById(Collection<Certyfikaty> certyfikatiesById) {
        this.certyfikatiesById = certyfikatiesById;
    }

    @ManyToOne
    @JoinColumn(name = "typ_stanu_id", referencedColumnName = "id")
    public TypyStanow getTypyStanowByTypStanuId() {
        return typyStanowByTypStanuId;
    }

    public void setTypyStanowByTypStanuId(TypyStanow typyStanowByTypStanuId) {
        this.typyStanowByTypStanuId = typyStanowByTypStanuId;
    }

    @ManyToOne
    @JoinColumn(name = "typ_lustrzanki_id", referencedColumnName = "id")
    public TypyStanow getTypyStanowByTypLustrzankiId() {
        return typyStanowByTypLustrzankiId;
    }

    public void setTypyStanowByTypLustrzankiId(TypyStanow typyStanowByTypLustrzankiId) {
        this.typyStanowByTypLustrzankiId = typyStanowByTypLustrzankiId;
    }

    @Basic
    @Column(name = "skrot", nullable = false, length = -1)
    public String getSkrot() {
        return skrot;
    }

    public void setSkrot(String skrot) {
        this.skrot = skrot;
    }
}
