package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Eoller on 26-May-18.
 */
@Entity
public class Zdjecia {
    private Integer id;
    private byte[] zdjecie;
    private Monety monetyByMonetaId;
    private String monetaId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "zdjecie", nullable = false)
    public byte[] getZdjecie() {
        return zdjecie;
    }

    public void setZdjecie(byte[] zdjecie) {
        this.zdjecie = zdjecie;
    }

    @ManyToOne
    @JoinColumn(name = "moneta_id", referencedColumnName = "id", nullable = false)
    public Monety getMonetyByMonetaId() {
        return monetyByMonetaId;
    }

    public void setMonetyByMonetaId(Monety monetyByMonetaId) {
        this.monetyByMonetaId = monetyByMonetaId;
    }

    @Basic
    @Column(name = "moneta_id", nullable = false, length = -1)
    public String getMonetaId() {
        return monetaId;
    }

    public void setMonetaId(String monetaId) {
        this.monetaId = monetaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zdjecia zdjecia = (Zdjecia) o;

        if (id != null ? !id.equals(zdjecia.id) : zdjecia.id != null) return false;
        if (!Arrays.equals(zdjecie, zdjecia.zdjecie)) return false;
        if (monetaId != null ? !monetaId.equals(zdjecia.monetaId) : zdjecia.monetaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (monetaId != null ? monetaId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(zdjecie);
        return result;
    }
}
