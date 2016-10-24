/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "RIS_TEAMS")
@NamedQueries({
    @NamedQuery(name = "RisTeams.findAll", query = "SELECT r FROM RisTeams r"),
    @NamedQuery(name = "RisTeams.findByVolgnr", query = "SELECT r FROM RisTeams r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisTeams.findByNaam", query = "SELECT r FROM RisTeams r WHERE r.naam = :naam"),
    @NamedQuery(name = "RisTeams.findByPoule", query = "SELECT r FROM RisTeams r WHERE r.poule = :poule"),
    @NamedQuery(name = "RisTeams.findBySoort", query = "SELECT r FROM RisTeams r WHERE r.soort = :soort"),
    @NamedQuery(name = "RisTeams.findByFoto", query = "SELECT r FROM RisTeams r WHERE r.foto = :foto"),
    @NamedQuery(name = "RisTeams.findByStatsHtmlpagina", query = "SELECT r FROM RisTeams r WHERE r.statsHtmlpagina = :statsHtmlpagina"),
    @NamedQuery(name = "RisTeams.findByEindstand", query = "SELECT r FROM RisTeams r WHERE r.eindstand = :eindstand"),
    @NamedQuery(name = "RisTeams.findByPoulestand", query = "SELECT r FROM RisTeams r WHERE r.poulestand = :poulestand"),
    @NamedQuery(name = "RisTeams.findByPoulestandOffset", query = "SELECT r FROM RisTeams r WHERE r.poulestandOffset = :poulestandOffset"),
    @NamedQuery(name = "RisTeams.findByJaar", query = "SELECT r FROM RisTeams r WHERE r.jaar = :jaar"),
    @NamedQuery(name = "RisTeams.findByJaarAndSoort", query = "SELECT r FROM RisTeams r WHERE r.jaar = :jaar AND r.soort = :soort"),
    @NamedQuery(name = "RisTeams.findByPouleAndJaarAndSoort", query = "SELECT r FROM RisTeams r WHERE r.poule = :poule AND r.jaar = :jaar AND r.soort = :soort"),
    @NamedQuery(name = "RisTeams.findByFotoBig", query = "SELECT r FROM RisTeams r WHERE r.fotoBig = :fotoBig"),
    @NamedQuery(name = "RisTeams.findByJaarAndEindstandNotNull", query = "SELECT r FROM RisTeams r WHERE r.jaar = :jaar AND r.eindstand IS NOT NULL"),
    @NamedQuery(name = "RisTeams.findBySoortAndJaarForEindstand", query = "SELECT r FROM RisTeams r WHERE r.soort = :soort AND r.jaar = :jaar AND r.eindstand IS NOT NULL ORDER BY r.eindstand"),
    @NamedQuery(name = "RisTeams.findByFotoPrijsuitreiking", query = "SELECT r FROM RisTeams r WHERE r.fotoPrijsuitreiking = :fotoPrijsuitreiking")})
public class RisTeams implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOLGNR")
    private Long volgnr;
    @Size(max = 50)
    @Column(name = "NAAM")
    private String naam;
    @Size(max = 100)
    @Column(name = "POULE")
    private String poule;
    @Size(max = 10)
    @Column(name = "SOORT")
    private String soort;
    @Size(max = 100)
    @Column(name = "FOTO")
    private String foto;
    @Size(max = 100)
    @Column(name = "STATS_HTMLPAGINA")
    private String statsHtmlpagina;
    @Column(name = "EINDSTAND")
    private BigInteger eindstand;
    @Column(name = "POULESTAND")
    private BigInteger poulestand;
    @Column(name = "POULESTAND_OFFSET")
    private BigInteger poulestandOffset;
    @Column(name = "JAAR")
    private Short jaar;
    @Size(max = 100)
    @Column(name = "FOTO_BIG")
    private String fotoBig;
    @Size(max = 100)
    @Column(name = "FOTO_PRIJSUITREIKING")
    private String fotoPrijsuitreiking;

    public RisTeams() {
    }

    public RisTeams(Long volgnr) {
        this.volgnr = volgnr;
    }

    public Long getVolgnr() {
        return volgnr;
    }

    public void setVolgnr(Long volgnr) {
        this.volgnr = volgnr;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getPoule() {
        return poule;
    }

    public void setPoule(String poule) {
        this.poule = poule;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getStatsHtmlpagina() {
        return statsHtmlpagina;
    }

    public void setStatsHtmlpagina(String statsHtmlpagina) {
        this.statsHtmlpagina = statsHtmlpagina;
    }

    public BigInteger getEindstand() {
        return eindstand;
    }

    public void setEindstand(BigInteger eindstand) {
        this.eindstand = eindstand;
    }

    public BigInteger getPoulestand() {
        return poulestand;
    }

    public void setPoulestand(BigInteger poulestand) {
        this.poulestand = poulestand;
    }

    public BigInteger getPoulestandOffset() {
        return poulestandOffset;
    }

    public void setPoulestandOffset(BigInteger poulestandOffset) {
        this.poulestandOffset = poulestandOffset;
    }

    public Short getJaar() {
        return jaar;
    }

    public void setJaar(Short jaar) {
        this.jaar = jaar;
    }

    public String getFotoBig() {
        return fotoBig;
    }

    public void setFotoBig(String fotoBig) {
        this.fotoBig = fotoBig;
    }

    public String getFotoPrijsuitreiking() {
        return fotoPrijsuitreiking;
    }

    public void setFotoPrijsuitreiking(String fotoPrijsuitreiking) {
        this.fotoPrijsuitreiking = fotoPrijsuitreiking;
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
        if (!(object instanceof RisTeams)) {
            return false;
        }
        RisTeams other = (RisTeams) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisTeams[ volgnr=" + volgnr + " ]";
    }
    
}
