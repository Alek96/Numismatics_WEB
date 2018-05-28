package com.numismatics.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by Eoller on 28-May-18.
 */
@Entity
public class Certyfikaty {
    private Integer id;
    private String nazwa;
    private Date dataWystawienia;
    private Stany stanyByStanId;
    private FirmyCertyfikujace firmyCertyfikujaceByFirmaId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nazwa", nullable = true, length = -1)
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "data_wystawienia", nullable = true)
    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    @ManyToOne
    @JoinColumn(name = "stan_id", referencedColumnName = "id", nullable = false)
    public Stany getStanyByStanId() {
        return stanyByStanId;
    }

    public void setStanyByStanId(Stany stanyByStanId) {
        this.stanyByStanId = stanyByStanId;
    }

    @ManyToOne
    @JoinColumn(name = "firma_id", referencedColumnName = "id", nullable = false)
    public FirmyCertyfikujace getFirmyCertyfikujaceByFirmaId() {
        return firmyCertyfikujaceByFirmaId;
    }

    public void setFirmyCertyfikujaceByFirmaId(FirmyCertyfikujace firmyCertyfikujaceByFirmaId) {
        this.firmyCertyfikujaceByFirmaId = firmyCertyfikujaceByFirmaId;
    }
}
