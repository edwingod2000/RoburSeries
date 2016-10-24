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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "RIS_DEELNEMERS")
@NamedQueries({
    @NamedQuery(name = "RisDeelnemers.findAll", query = "SELECT r FROM RisDeelnemers r"),
    @NamedQuery(name = "RisDeelnemers.findByVolgnr", query = "SELECT r FROM RisDeelnemers r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisDeelnemers.findByAchternaam", query = "SELECT r FROM RisDeelnemers r WHERE r.achternaam = :achternaam"),
    @NamedQuery(name = "RisDeelnemers.findByTussenvoegsel", query = "SELECT r FROM RisDeelnemers r WHERE r.tussenvoegsel = :tussenvoegsel"),
    @NamedQuery(name = "RisDeelnemers.findByVoornaam", query = "SELECT r FROM RisDeelnemers r WHERE r.voornaam = :voornaam"),
    @NamedQuery(name = "RisDeelnemers.findByPosities", query = "SELECT r FROM RisDeelnemers r WHERE r.posities = :posities"),
    @NamedQuery(name = "RisDeelnemers.findByTemVolgnr", query = "SELECT r FROM RisDeelnemers r WHERE r.temVolgnr = :temVolgnr ORDER BY r.soortDeelnemers.volgnr"),
    @NamedQuery(name = "RisDeelnemers.findByRugnummer", query = "SELECT r FROM RisDeelnemers r WHERE r.rugnummer = :rugnummer"),
    @NamedQuery(name = "RisDeelnemers.findByJaar", query = "SELECT r FROM RisDeelnemers r WHERE r.jaar = :jaar")})
public class RisDeelnemers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOLGNR")
    private Long volgnr;
    @Size(max = 100)
    @Column(name = "ACHTERNAAM")
    private String achternaam;
    @Size(max = 50)
    @Column(name = "TUSSENVOEGSEL")
    private String tussenvoegsel;
    @Size(max = 50)
    @Column(name = "VOORNAAM")
    private String voornaam;
    @Size(max = 50)
    @Column(name = "POSITIES")
    private String posities;
    @Column(name = "TEM_VOLGNR")
    private Long temVolgnr;
    @JoinColumn(name = "SDS_VOLGNR", referencedColumnName = "VOLGNR")
    @ManyToOne
    private RisSoortDeelnemers soortDeelnemers;
    @Column(name = "RUGNUMMER")
    private Long rugnummer;
    @Column(name = "JAAR")
    private Short jaar;

    public RisDeelnemers() {
    }

    public RisDeelnemers(Long volgnr) {
        this.volgnr = volgnr;
    }

    public Long getVolgnr() {
        return volgnr;
    }

    public void setVolgnr(Long volgnr) {
        this.volgnr = volgnr;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getPosities() {
        return posities;
    }

    public void setPosities(String posities) {
        this.posities = posities;
    }

    public Long getTemVolgnr() {
        return temVolgnr;
    }

    public void setTemVolgnr(Long temVolgnr) {
        this.temVolgnr = temVolgnr;
    }

    public Long getRugnummer() {
        return rugnummer;
    }

    public void setRugnummer(Long rugnummer) {
        this.rugnummer = rugnummer;
    }

    public Short getJaar() {
        return jaar;
    }

    public void setJaar(Short jaar) {
        this.jaar = jaar;
    }

    public RisSoortDeelnemers getSoortDeelnemers() {
        return soortDeelnemers;
    }

    public void setSoortDeelnemers(RisSoortDeelnemers soortDeelnemers) {
        this.soortDeelnemers = soortDeelnemers;
    }

    public String getDisplayNaam() {
        StringBuilder sb = new StringBuilder();
        if (getVoornaam() != null) {
            sb.append(getVoornaam());
        }
        if (getTussenvoegsel() != null && getVoornaam() != null) {
            sb.append(" ");
        }
        if (getTussenvoegsel() != null) {
            sb.append(getTussenvoegsel());
        }
        if (getVoornaam() != null || getTussenvoegsel() != null) {
            sb.append(" ");
        }
        if (getAchternaam() != null) {
            sb.append(getAchternaam());
        }
        return sb.toString();
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
        if (!(object instanceof RisDeelnemers)) {
            return false;
        }
        RisDeelnemers other = (RisDeelnemers) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisDeelnemers[ volgnr=" + volgnr + " ]";
    }
    
}
