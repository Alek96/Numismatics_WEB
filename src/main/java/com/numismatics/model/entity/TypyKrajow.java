package com.numismatics.model.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Eoller on 28-May-18.
 */
@Entity
@Table(name = "typy_krajow", schema = "public")
public class TypyKrajow {
    private Integer id;
    private String nazwa;

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

}
