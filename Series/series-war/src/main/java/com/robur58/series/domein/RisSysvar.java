/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author godefrooije
 */
@Entity
@Table(name = "RIS_SYSVAR")
@NamedQueries({
    @NamedQuery(name = "RisSysvar.findAll", query = "SELECT r FROM RisSysvar r"),
    @NamedQuery(name = "RisSysvar.findByCode", query = "SELECT r FROM RisSysvar r WHERE r.code = :code"),
    @NamedQuery(name = "RisSysvar.findByWaarde", query = "SELECT r FROM RisSysvar r WHERE r.waarde = :waarde"),
    @NamedQuery(name = "RisSysvar.findByOmschrijving", query = "SELECT r FROM RisSysvar r WHERE r.omschrijving = :omschrijving")})
public class RisSysvar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE")
    private String code;
    @Size(max = 100)
    @Column(name = "WAARDE")
    private String waarde;
    @Size(max = 100)
    @Column(name = "OMSCHRIJVING")
    private String omschrijving;

    public RisSysvar() {
    }

    public RisSysvar(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWaarde() {
        return waarde;
    }

    public void setWaarde(String waarde) {
        this.waarde = waarde;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisSysvar)) {
            return false;
        }
        RisSysvar other = (RisSysvar) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisSysvar[ code=" + code + " ]";
    }
    
}
