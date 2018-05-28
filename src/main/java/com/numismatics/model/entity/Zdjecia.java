package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Eoller on 28-May-18.
 */
@Entity
public class Zdjecia {
    private Integer id;
    private byte[] zdjecie;
    private Monety monetyByMonetaId;

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
}
