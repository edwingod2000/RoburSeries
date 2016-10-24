/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author godefrooije
 */
@Entity
@Table(name = "RIS_SOORT")
@NamedQueries({
    @NamedQuery(name = "RisSoort.findAll", query = "SELECT r FROM RisSoort r"),
    @NamedQuery(name = "RisSoort.findByAfkorting", query = "SELECT r FROM RisSoort r WHERE r.afkorting = :afkorting"),
    @NamedQuery(name = "RisSoort.findByTitelNl", query = "SELECT r FROM RisSoort r WHERE r.titelNl = :titelNl"),
    @NamedQuery(name = "RisSoort.findByTitelEn", query = "SELECT r FROM RisSoort r WHERE r.titelEn = :titelEn"),
    @NamedQuery(name = "RisSoort.findByDisplayVolgnr", query = "SELECT r FROM RisSoort r WHERE r.displayVolgnr = :displayVolgnr")})
public class RisSoort implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "risSoort")
    private Collection<RisSoortJaar> risSoortJaarCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AFKORTING")
    private String afkorting;
    @Size(max = 1000)
    @Column(name = "TITEL_NL")
    private String titelNl;
    @Size(max = 1000)
    @Column(name = "TITEL_EN")
    private String titelEn;
    @Column(name = "DISPLAY_VOLGNR")
    private Short displayVolgnr;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "risSoort")
    private List<RisSoortJaar> risSoortJaarList;

    public RisSoort() {
    }

    public RisSoort(String afkorting) {
        this.afkorting = afkorting;
    }

    public String getAfkorting() {
        return afkorting;
    }

    public void setAfkorting(String afkorting) {
        this.afkorting = afkorting;
    }

    public String getTitelNl() {
        return titelNl;
    }

    public void setTitelNl(String titelNl) {
        this.titelNl = titelNl;
    }

    public String getTitelEn() {
        return titelEn;
    }

    public void setTitelEn(String titelEn) {
        this.titelEn = titelEn;
    }

    public Short getDisplayVolgnr() {
        return displayVolgnr;
    }

    public void setDisplayVolgnr(Short displayVolgnr) {
        this.displayVolgnr = displayVolgnr;
    }

    public List<RisSoortJaar> getRisSoortJaarList() {
        return risSoortJaarList;
    }

    public void setRisSoortJaarList(List<RisSoortJaar> risSoortJaarList) {
        this.risSoortJaarList = risSoortJaarList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (afkorting != null ? afkorting.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisSoort)) {
            return false;
        }
        RisSoort other = (RisSoort) object;
        if ((this.afkorting == null && other.afkorting != null) || (this.afkorting != null && !this.afkorting.equals(other.afkorting))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisSoort[ afkorting=" + afkorting + " ]";
    }

    public Collection<RisSoortJaar> getRisSoortJaarCollection() {
        return risSoortJaarCollection;
    }

    public void setRisSoortJaarCollection(Collection<RisSoortJaar> risSoortJaarCollection) {
        this.risSoortJaarCollection = risSoortJaarCollection;
    }
    
}
