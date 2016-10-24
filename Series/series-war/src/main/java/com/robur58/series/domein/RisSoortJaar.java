/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author godefrooije
 */
@Entity
@Table(name = "RIS_SOORT_JAAR")
@NamedQueries({
    @NamedQuery(name = "RisSoortJaar.findAll", query = "SELECT r FROM RisSoortJaar r"),
    @NamedQuery(name = "RisSoortJaar.findByJaar", query = "SELECT r FROM RisSoortJaar r WHERE r.risSoortJaarPK.jaar = :jaar AND r.risSoort.displayVolgnr IS NOT NULL ORDER BY r.risSoort.displayVolgnr"),
    @NamedQuery(name = "RisSoortJaar.findByAfkorting", query = "SELECT r FROM RisSoortJaar r WHERE r.risSoortJaarPK.afkorting = :afkorting"),
    @NamedQuery(name = "RisSoortJaar.findByAfkortingAndJaar", query = "SELECT r FROM RisSoortJaar r WHERE r.risSoortJaarPK.afkorting = :afkorting AND r.risSoortJaarPK.jaar = :jaar"),
    @NamedQuery(name = "RisSoortJaar.findByStatszipAvailable", query = "SELECT r FROM RisSoortJaar r WHERE r.statszipAvailable = :statszipAvailable")})
public class RisSoortJaar implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RisSoortJaarPK risSoortJaarPK;
    @Size(max = 1)
    @Column(name = "STATSZIP_AVAILABLE")
    private String statszipAvailable;
    @JoinColumn(name = "AFKORTING", referencedColumnName = "AFKORTING", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RisSoort risSoort;

    public RisSoortJaar() {
    }

    public RisSoortJaar(RisSoortJaarPK risSoortJaarPK) {
        this.risSoortJaarPK = risSoortJaarPK;
    }

    public RisSoortJaar(short jaar, String afkorting) {
        this.risSoortJaarPK = new RisSoortJaarPK(jaar, afkorting);
    }

    public RisSoortJaarPK getRisSoortJaarPK() {
        return risSoortJaarPK;
    }

    public void setRisSoortJaarPK(RisSoortJaarPK risSoortJaarPK) {
        this.risSoortJaarPK = risSoortJaarPK;
    }

    public String getStatszipAvailable() {
        return statszipAvailable;
    }

    public void setStatszipAvailable(String statszipAvailable) {
        this.statszipAvailable = statszipAvailable;
    }
    
    public RisSoort getRisSoort() {
        return risSoort;
    }

    public void setRisSoort(RisSoort risSoort) {
        this.risSoort = risSoort;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (risSoortJaarPK != null ? risSoortJaarPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisSoortJaar)) {
            return false;
        }
        RisSoortJaar other = (RisSoortJaar) object;
        if ((this.risSoortJaarPK == null && other.risSoortJaarPK != null) || (this.risSoortJaarPK != null && !this.risSoortJaarPK.equals(other.risSoortJaarPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisSoortJaar[ risSoortJaarPK=" + risSoortJaarPK + " ]";
    }
    
}
