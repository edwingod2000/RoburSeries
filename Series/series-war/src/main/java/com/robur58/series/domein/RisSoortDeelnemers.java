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
@Table(name = "RIS_SOORT_DEELNEMERS")
@NamedQueries({
    @NamedQuery(name = "RisSoortDeelnemers.findAll", query = "SELECT r FROM RisSoortDeelnemers r"),
    @NamedQuery(name = "RisSoortDeelnemers.findByVolgnr", query = "SELECT r FROM RisSoortDeelnemers r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisSoortDeelnemers.findByOmschrijving", query = "SELECT r FROM RisSoortDeelnemers r WHERE r.omschrijving = :omschrijving")})
public class RisSoortDeelnemers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOLGNR")
    private Long volgnr;
    @Size(max = 50)
    @Column(name = "OMSCHRIJVING")
    private String omschrijving;

    public RisSoortDeelnemers() {
    }

    public RisSoortDeelnemers(Long volgnr) {
        this.volgnr = volgnr;
    }

    public Long getVolgnr() {
        return volgnr;
    }

    public void setVolgnr(Long volgnr) {
        this.volgnr = volgnr;
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
        hash += (volgnr != null ? volgnr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisSoortDeelnemers)) {
            return false;
        }
        RisSoortDeelnemers other = (RisSoortDeelnemers) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisSoortDeelnemers[ volgnr=" + volgnr + " ]";
    }
    
}
