/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author godefrooije
 */
@Embeddable
public class RisSoortJaarPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "JAAR")
    private short jaar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AFKORTING")
    private String afkorting;

    public RisSoortJaarPK() {
    }

    public RisSoortJaarPK(short jaar, String afkorting) {
        this.jaar = jaar;
        this.afkorting = afkorting;
    }

    public short getJaar() {
        return jaar;
    }

    public void setJaar(short jaar) {
        this.jaar = jaar;
    }

    public String getAfkorting() {
        return afkorting;
    }

    public void setAfkorting(String afkorting) {
        this.afkorting = afkorting;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) jaar;
        hash += (afkorting != null ? afkorting.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisSoortJaarPK)) {
            return false;
        }
        RisSoortJaarPK other = (RisSoortJaarPK) object;
        if (this.jaar != other.jaar) {
            return false;
        }
        if ((this.afkorting == null && other.afkorting != null) || (this.afkorting != null && !this.afkorting.equals(other.afkorting))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisSoortJaarPK[ jaar=" + jaar + ", afkorting=" + afkorting + " ]";
    }
    
}
