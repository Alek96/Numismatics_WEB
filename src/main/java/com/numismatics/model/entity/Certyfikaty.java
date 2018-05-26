package com.numismatics.model.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
public class Certyfikaty {
    private String monetaId;
    private String nazwa;
    private String gradying;
    private Integer firmaId;
    private Date dataWystawienia;
    private Monety monetyByMonetaId;
    private FirmyCertyfikujace firmyCertyfikujaceByFirmaId;

    @Id
    @Column(name = "moneta_id", nullable = false, length = -1)
    public String getMonetaId() {
        return monetaId;
    }

    public void setMonetaId(String monetaId) {
        this.monetaId = monetaId;
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
    @Column(name = "gradying", nullable = false, length = -1)
    public String getGradying() {
        return gradying;
    }

    public void setGradying(String gradying) {
        this.gradying = gradying;
    }

    @Basic
    @Column(name = "firma_id", nullable = false)
    public Integer getFirmaId() {
        return firmaId;
    }

    public void setFirmaId(Integer firmaId) {
        this.firmaId = firmaId;
    }

    @Basic
    @Column(name = "data_wystawienia", nullable = true)
    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Certyfikaty that = (Certyfikaty) o;

        if (monetaId != null ? !monetaId.equals(that.monetaId) : that.monetaId != null) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (gradying != null ? !gradying.equals(that.gradying) : that.gradying != null) return false;
        if (firmaId != null ? !firmaId.equals(that.firmaId) : that.firmaId != null) return false;
        if (dataWystawienia != null ? !dataWystawienia.equals(that.dataWystawienia) : that.dataWystawienia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = monetaId != null ? monetaId.hashCode() : 0;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (gradying != null ? gradying.hashCode() : 0);
        result = 31 * result + (firmaId != null ? firmaId.hashCode() : 0);
        result = 31 * result + (dataWystawienia != null ? dataWystawienia.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "moneta_id", referencedColumnName = "id", nullable = false)
    public Monety getMonetyByMonetaId() {
        return monetyByMonetaId;
    }

    public void setMonetyByMonetaId(Monety monetyByMonetaId) {
        this.monetyByMonetaId = monetyByMonetaId;
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
