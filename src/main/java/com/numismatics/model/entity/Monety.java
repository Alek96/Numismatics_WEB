package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
public class Monety {
    private String id;
    private String nazwa;
    private Double waga;
    private Integer proba;
    private Double cena;
    private Integer kruszecId;
    private Integer stanId;
    private Integer rok;
    private String opis;
    private Integer mennicaId;
    private Integer panujacyId;
    private Integer krajId;
    private Certyfikaty certyfikatyById;
    private Kruszce kruszceByKruszecId;
    private Stany stanyByStanId;
    private Mennice menniceByMennicaId;
    private Panujacy panujacyByPanujacyId;
    private Kraje krajeByKrajId;
    private String literatura;
    private Collection<Zdjecia> zdjeciasById;

    @Id
    @Column(name = "id", nullable = false, length = -1)
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    @Column(name = "waga", nullable = false, precision = 0)
    public Double getWaga() {
        return waga;
    }

    public void setWaga(Double waga) {
        this.waga = waga;
    }

    @Basic
    @Column(name = "proba", nullable = false)
    public Integer getProba() {
        return proba;
    }

    public void setProba(Integer proba) {
        this.proba = proba;
    }

    @Basic
    @Column(name = "cena", nullable = false, precision = 0)
    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    @Basic
    @Column(name = "kruszec_id", nullable = false)
    public Integer getKruszecId() {
        return kruszecId;
    }

    public void setKruszecId(Integer kruszecId) {
        this.kruszecId = kruszecId;
    }

    @Basic
    @Column(name = "stan_id", nullable = true)
    public Integer getStanId() {
        return stanId;
    }

    public void setStanId(Integer stanId) {
        this.stanId = stanId;
    }

    @Basic
    @Column(name = "rok", nullable = true)
    public Integer getRok() {
        return rok;
    }

    public void setRok(Integer rok) {
        this.rok = rok;
    }

    @Basic
    @Column(name = "opis", nullable = true, length = -1)
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Basic
    @Column(name = "mennica_id", nullable = true)
    public Integer getMennicaId() {
        return mennicaId;
    }

    public void setMennicaId(Integer mennicaId) {
        this.mennicaId = mennicaId;
    }

    @Basic
    @Column(name = "panujacy_id", nullable = true)
    public Integer getPanujacyId() {
        return panujacyId;
    }

    public void setPanujacyId(Integer panujacyId) {
        this.panujacyId = panujacyId;
    }

    @Basic
    @Column(name = "kraj_id", nullable = false)
    public Integer getKrajId() {
        return krajId;
    }

    public void setKrajId(Integer krajId) {
        this.krajId = krajId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monety monety = (Monety) o;

        if (id != null ? !id.equals(monety.id) : monety.id != null) return false;
        if (nazwa != null ? !nazwa.equals(monety.nazwa) : monety.nazwa != null) return false;
        if (waga != null ? !waga.equals(monety.waga) : monety.waga != null) return false;
        if (proba != null ? !proba.equals(monety.proba) : monety.proba != null) return false;
        if (cena != null ? !cena.equals(monety.cena) : monety.cena != null) return false;
        if (kruszecId != null ? !kruszecId.equals(monety.kruszecId) : monety.kruszecId != null) return false;
        if (stanId != null ? !stanId.equals(monety.stanId) : monety.stanId != null) return false;
        if (rok != null ? !rok.equals(monety.rok) : monety.rok != null) return false;
        if (opis != null ? !opis.equals(monety.opis) : monety.opis != null) return false;
        if (mennicaId != null ? !mennicaId.equals(monety.mennicaId) : monety.mennicaId != null) return false;
        if (panujacyId != null ? !panujacyId.equals(monety.panujacyId) : monety.panujacyId != null) return false;
        if (krajId != null ? !krajId.equals(monety.krajId) : monety.krajId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (waga != null ? waga.hashCode() : 0);
        result = 31 * result + (proba != null ? proba.hashCode() : 0);
        result = 31 * result + (cena != null ? cena.hashCode() : 0);
        result = 31 * result + (kruszecId != null ? kruszecId.hashCode() : 0);
        result = 31 * result + (stanId != null ? stanId.hashCode() : 0);
        result = 31 * result + (rok != null ? rok.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + (mennicaId != null ? mennicaId.hashCode() : 0);
        result = 31 * result + (panujacyId != null ? panujacyId.hashCode() : 0);
        result = 31 * result + (krajId != null ? krajId.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "monetyByMonetaId")
    public Certyfikaty getCertyfikatyById() {
        return certyfikatyById;
    }

    public void setCertyfikatyById(Certyfikaty certyfikatyById) {
        this.certyfikatyById = certyfikatyById;
    }

    @ManyToOne
    @JoinColumn(name = "kruszec_id", referencedColumnName = "id", nullable = false)
    public Kruszce getKruszceByKruszecId() {
        return kruszceByKruszecId;
    }

    public void setKruszceByKruszecId(Kruszce kruszceByKruszecId) {
        this.kruszceByKruszecId = kruszceByKruszecId;
    }

    @ManyToOne
    @JoinColumn(name = "stan_id", referencedColumnName = "id")
    public Stany getStanyByStanId() {
        return stanyByStanId;
    }

    public void setStanyByStanId(Stany stanyByStanId) {
        this.stanyByStanId = stanyByStanId;
    }

    @ManyToOne
    @JoinColumn(name = "mennica_id", referencedColumnName = "id")
    public Mennice getMenniceByMennicaId() {
        return menniceByMennicaId;
    }

    public void setMenniceByMennicaId(Mennice menniceByMennicaId) {
        this.menniceByMennicaId = menniceByMennicaId;
    }

    @ManyToOne
    @JoinColumn(name = "panujacy_id", referencedColumnName = "id")
    public Panujacy getPanujacyByPanujacyId() {
        return panujacyByPanujacyId;
    }

    public void setPanujacyByPanujacyId(Panujacy panujacyByPanujacyId) {
        this.panujacyByPanujacyId = panujacyByPanujacyId;
    }

    @ManyToOne
    @JoinColumn(name = "kraj_id", referencedColumnName = "id", nullable = false)
    public Kraje getKrajeByKrajId() {
        return krajeByKrajId;
    }

    public void setKrajeByKrajId(Kraje krajeByKrajId) {
        this.krajeByKrajId = krajeByKrajId;
    }

    @Basic
    @Column(name = "literatura", nullable = true, length = -1)
    public String getLiteratura() {
        return literatura;
    }

    public void setLiteratura(String literatura) {
        this.literatura = literatura;
    }

    @OneToMany(mappedBy = "monetyByMonetaId")
    public Collection<Zdjecia> getZdjeciasById() {
        return zdjeciasById;
    }

    public void setZdjeciasById(Collection<Zdjecia> zdjeciasById) {
        this.zdjeciasById = zdjeciasById;
    }
}
