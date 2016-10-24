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
@Table(name = "RIS_MENU")
@NamedQueries({
    @NamedQuery(name = "RisMenu.findAll", query = "SELECT r FROM RisMenu r"),
    @NamedQuery(name = "RisMenu.findByMnuVolgnr", query = "SELECT r FROM RisMenu r WHERE r.mnuVolgnr = :mnuVolgnr"),
    @NamedQuery(name = "RisMenu.findByOmschrijving", query = "SELECT r FROM RisMenu r WHERE r.omschrijving = :omschrijving"),
    @NamedQuery(name = "RisMenu.findByUrl", query = "SELECT r FROM RisMenu r WHERE r.url = :url"),
    @NamedQuery(name = "RisMenu.findByHint", query = "SELECT r FROM RisMenu r WHERE r.hint = :hint"),
    @NamedQuery(name = "RisMenu.findByPlaatje", query = "SELECT r FROM RisMenu r WHERE r.plaatje = :plaatje"),
    @NamedQuery(name = "RisMenu.findByNivo", query = "SELECT r FROM RisMenu r WHERE r.nivo = :nivo"),
    @NamedQuery(name = "RisMenu.findByParent", query = "SELECT r FROM RisMenu r WHERE r.parent = :parent"),
    @NamedQuery(name = "RisMenu.findByWidth", query = "SELECT r FROM RisMenu r WHERE r.width = :width"),
    @NamedQuery(name = "RisMenu.findByTarget", query = "SELECT r FROM RisMenu r WHERE r.target = :target"),
    @NamedQuery(name = "RisMenu.findByOmschrijvinglang", query = "SELECT r FROM RisMenu r WHERE r.omschrijvinglang = :omschrijvinglang"),
    @NamedQuery(name = "RisMenu.findByToonVolgnr", query = "SELECT r FROM RisMenu r WHERE r.toonVolgnr = :toonVolgnr")})
public class RisMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MNU_VOLGNR")
    private Long mnuVolgnr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OMSCHRIJVING")
    private String omschrijving;
    @Size(max = 500)
    @Column(name = "URL")
    private String url;
    @Size(max = 500)
    @Column(name = "HINT")
    private String hint;
    @Size(max = 500)
    @Column(name = "PLAATJE")
    private String plaatje;
    @Column(name = "NIVO")
    private Short nivo;
    @Column(name = "PARENT")
    private Long parent;
    @Column(name = "WIDTH")
    private Long width;
    @Size(max = 100)
    @Column(name = "TARGET")
    private String target;
    @Size(max = 500)
    @Column(name = "OMSCHRIJVINGLANG")
    private String omschrijvinglang;
    @Column(name = "TOON_VOLGNR")
    private Long toonVolgnr;

    public RisMenu() {
    }

    public RisMenu(Long mnuVolgnr) {
        this.mnuVolgnr = mnuVolgnr;
    }

    public RisMenu(Long mnuVolgnr, String omschrijving) {
        this.mnuVolgnr = mnuVolgnr;
        this.omschrijving = omschrijving;
    }

    public Long getMnuVolgnr() {
        return mnuVolgnr;
    }

    public void setMnuVolgnr(Long mnuVolgnr) {
        this.mnuVolgnr = mnuVolgnr;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getPlaatje() {
        return plaatje;
    }

    public void setPlaatje(String plaatje) {
        this.plaatje = plaatje;
    }

    public Short getNivo() {
        return nivo;
    }

    public void setNivo(Short nivo) {
        this.nivo = nivo;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getOmschrijvinglang() {
        return omschrijvinglang;
    }

    public void setOmschrijvinglang(String omschrijvinglang) {
        this.omschrijvinglang = omschrijvinglang;
    }

    public Long getToonVolgnr() {
        return toonVolgnr;
    }

    public void setToonVolgnr(Long toonVolgnr) {
        this.toonVolgnr = toonVolgnr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mnuVolgnr != null ? mnuVolgnr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisMenu)) {
            return false;
        }
        RisMenu other = (RisMenu) object;
        if ((this.mnuVolgnr == null && other.mnuVolgnr != null) || (this.mnuVolgnr != null && !this.mnuVolgnr.equals(other.mnuVolgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisMenu[ mnuVolgnr=" + mnuVolgnr + " ]";
    }
    
}
