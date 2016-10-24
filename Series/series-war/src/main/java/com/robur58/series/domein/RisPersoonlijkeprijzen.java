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
@Table(name = "RIS_PERSOONLIJKEPRIJZEN")
@NamedQueries({
    @NamedQuery(name = "RisPersoonlijkeprijzen.findAll", query = "SELECT r FROM RisPersoonlijkeprijzen r"),
    @NamedQuery(name = "RisPersoonlijkeprijzen.findByVolgnr", query = "SELECT r FROM RisPersoonlijkeprijzen r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisPersoonlijkeprijzen.findByJaarAndSoort", query = "SELECT r FROM RisPersoonlijkeprijzen r WHERE r.jaar = :jaar AND r.soort = :soort ORDER BY r.type"),
    @NamedQuery(name = "RisPersoonlijkeprijzen.findBySoort", query = "SELECT r FROM RisPersoonlijkeprijzen r WHERE r.soort = :soort"),
    @NamedQuery(name = "RisPersoonlijkeprijzen.findByType", query = "SELECT r FROM RisPersoonlijkeprijzen r WHERE r.type = :type"),
    @NamedQuery(name = "RisPersoonlijkeprijzen.findByNaam", query = "SELECT r FROM RisPersoonlijkeprijzen r WHERE r.naam = :naam"),
    @NamedQuery(name = "RisPersoonlijkeprijzen.findByGemiddelde", query = "SELECT r FROM RisPersoonlijkeprijzen r WHERE r.gemiddelde = :gemiddelde"),
    @NamedQuery(name = "RisPersoonlijkeprijzen.findByFoto", query = "SELECT r FROM RisPersoonlijkeprijzen r WHERE r.foto = :foto")})
public class RisPersoonlijkeprijzen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOLGNR")
    private Long volgnr;
    @Column(name = "JAAR")
    private Short jaar;
    @Size(max = 10)
    @Column(name = "SOORT")
    private String soort;
    @Size(max = 1)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 100)
    @Column(name = "NAAM")
    private String naam;
    @Size(max = 5)
    @Column(name = "GEMIDDELDE")
    private String gemiddelde;
    @Size(max = 100)
    @Column(name = "FOTO")
    private String foto;
    @JoinColumn(name = "TEM_VOLGNR", referencedColumnName = "VOLGNR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RisTeams risTeam;

    public RisPersoonlijkeprijzen() {
    }

    public RisPersoonlijkeprijzen(Long volgnr) {
        this.volgnr = volgnr;
    }

    public Long getVolgnr() {
        return volgnr;
    }

    public void setVolgnr(Long volgnr) {
        this.volgnr = volgnr;
    }

    public Short getJaar() {
        return jaar;
    }

    public void setJaar(Short jaar) {
        this.jaar = jaar;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getGemiddelde() {
        return gemiddelde;
    }

    public void setGemiddelde(String gemiddelde) {
        this.gemiddelde = gemiddelde;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public RisTeams getRisTeam() {
        return risTeam;
    }

    public void setRisTeam(RisTeams risTeam) {
        this.risTeam = risTeam;
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
        if (!(object instanceof RisPersoonlijkeprijzen)) {
            return false;
        }
        RisPersoonlijkeprijzen other = (RisPersoonlijkeprijzen) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisPersoonlijkeprijzen[ volgnr=" + volgnr + " ]";
    }
    
}
