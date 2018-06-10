package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 28-May-18.
 */
@Entity
@Table(name = "firmy_certyfikujace", schema = "public")
public class FirmyCertyfikujace {
    private Integer id;
    private String nazwa;
    private String skrot;
    private TypyStanow typyStanowByTypStanuId;
    private TypyStanow typyStanowByTypLustrzankiId;

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
    @Column(name = "skrot", nullable = false, length = -1)
    public String getSkrot() {
        return skrot;
    }

    public void setSkrot(String skrot) {
        this.skrot = skrot;
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
}
