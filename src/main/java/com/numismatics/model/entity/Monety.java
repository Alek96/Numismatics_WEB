package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 28-May-18.
 */
@Entity
public class Monety {
    private Integer id;
    private String uid;
    private String nazwa;
    private Double waga;
    private Integer proba;
    private Double cena;
    private Integer rok;
    private String opis;
    private String literatura;
    private Kruszce kruszceByKruszecId;
    private Certyfikaty certyfikatyByCeryfikatId;
    private Kraje krajeByKrajId;
    private Panujacy panujacyByPanujacyId;
    private Mennice menniceByMennicaId;

    public Monety() {
        super();
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uid", nullable = false, length = -1)
    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "nazwa", nullable = false, length = -1)
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(final String nazwa) {
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
    @Column(name = "literatura", nullable = true, length = -1)
    public String getLiteratura() {
        return literatura;
    }

    public void setLiteratura(String literatura) {
        this.literatura = literatura;
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
    @JoinColumn(name = "ceryfikat_id", referencedColumnName = "id", nullable = false)
    public Certyfikaty getCertyfikatyByCeryfikatId() {
        return certyfikatyByCeryfikatId;
    }

    public void setCertyfikatyByCeryfikatId(Certyfikaty certyfikatyByCeryfikatId) {
        this.certyfikatyByCeryfikatId = certyfikatyByCeryfikatId;
    }

    @ManyToOne
    @JoinColumn(name = "kraj_id", referencedColumnName = "id", nullable = false)
    public Kraje getKrajeByKrajId() {
        return krajeByKrajId;
    }

    public void setKrajeByKrajId(Kraje krajeByKrajId) {
        this.krajeByKrajId = krajeByKrajId;
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
    @JoinColumn(name = "mennica_id", referencedColumnName = "id")
    public Mennice getMenniceByMennicaId() {
        return menniceByMennicaId;
    }

    public void setMenniceByMennicaId(Mennice menniceByMennicaId) {
        this.menniceByMennicaId = menniceByMennicaId;
    }

}
