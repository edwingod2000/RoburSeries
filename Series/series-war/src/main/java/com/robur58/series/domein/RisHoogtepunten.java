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
@Table(name = "RIS_HOOGTEPUNTEN")
@NamedQueries({
    @NamedQuery(name = "RisHoogtepunten.findAll", query = "SELECT r FROM RisHoogtepunten r"),
    @NamedQuery(name = "RisHoogtepunten.findByVolgnr", query = "SELECT r FROM RisHoogtepunten r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisHoogtepunten.findByTitel", query = "SELECT r FROM RisHoogtepunten r WHERE r.titel = :titel"),
    @NamedQuery(name = "RisHoogtepunten.findByDirectory", query = "SELECT r FROM RisHoogtepunten r WHERE r.directory = :directory"),
    @NamedQuery(name = "RisHoogtepunten.findByHtmlpagina", query = "SELECT r FROM RisHoogtepunten r WHERE r.htmlpagina = :htmlpagina"),
    @NamedQuery(name = "RisHoogtepunten.findByDisplayVolgnr", query = "SELECT r FROM RisHoogtepunten r WHERE r.displayVolgnr = :displayVolgnr"),
    @NamedQuery(name = "RisHoogtepunten.findByJaar", query = "SELECT r FROM RisHoogtepunten r WHERE r.jaar = :jaar ORDER BY r.displayVolgnr")})
public class RisHoogtepunten implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOLGNR")
    private Long volgnr;
    @Size(max = 200)
    @Column(name = "TITEL")
    private String titel;
    @Size(max = 200)
    @Column(name = "DIRECTORY")
    private String directory;
    @Size(max = 200)
    @Column(name = "HTMLPAGINA")
    private String htmlpagina;
    @Column(name = "DISPLAY_VOLGNR")
    private BigInteger displayVolgnr;
    @Column(name = "JAAR")
    private Short jaar;
    @Column(name="INTERN")
    private String intern;

    public RisHoogtepunten() {
    }

    public RisHoogtepunten(Long volgnr) {
        this.volgnr = volgnr;
    }

    public Long getVolgnr() {
        return volgnr;
    }

    public void setVolgnr(Long volgnr) {
        this.volgnr = volgnr;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getHtmlpagina() {
        return htmlpagina;
    }

    public void setHtmlpagina(String htmlpagina) {
        this.htmlpagina = htmlpagina;
    }

    public BigInteger getDisplayVolgnr() {
        return displayVolgnr;
    }

    public void setDisplayVolgnr(BigInteger displayVolgnr) {
        this.displayVolgnr = displayVolgnr;
    }

    public Short getJaar() {
        return jaar;
    }

    public void setJaar(Short jaar) {
        this.jaar = jaar;
    }

    public String getIntern() {
        return intern;
    }

    public void setIntern(String intern) {
        this.intern = intern;
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
        if (!(object instanceof RisHoogtepunten)) {
            return false;
        }
        RisHoogtepunten other = (RisHoogtepunten) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisHoogtepunten[ volgnr=" + volgnr + " ]";
    }
    
}
