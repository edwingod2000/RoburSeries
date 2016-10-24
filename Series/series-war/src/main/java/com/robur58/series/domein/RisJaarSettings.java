/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author godefrooije
 */
@Entity
@Table(name = "RIS_JAAR_SETTINGS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RisJaarSettings.findAll", query = "SELECT r FROM RisJaarSettings r"),
    @NamedQuery(name = "RisJaarSettings.findByJaar", query = "SELECT r FROM RisJaarSettings r WHERE r.jaar = :jaar"),
    @NamedQuery(name = "RisJaarSettings.findByStatsIntern", query = "SELECT r FROM RisJaarSettings r WHERE r.statsIntern = :statsIntern"),
    @NamedQuery(name = "RisJaarSettings.findByStatsExterneUrl", query = "SELECT r FROM RisJaarSettings r WHERE r.statsExterneUrl = :statsExterneUrl"),
    @NamedQuery(name = "RisJaarSettings.findByTeamfotolocatieIntern", query = "SELECT r FROM RisJaarSettings r WHERE r.teamfotolocatieIntern = :teamfotolocatieIntern"),
    @NamedQuery(name = "RisJaarSettings.findByTeamfotolocatieUrl", query = "SELECT r FROM RisJaarSettings r WHERE r.teamfotolocatieUrl = :teamfotolocatieUrl")})
public class RisJaarSettings implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "JAAR")
    private Short jaar;
    @Size(max = 20)
    @Column(name = "STATS_INTERN")
    private String statsIntern;
    @Size(max = 100)
    @Column(name = "STATS_EXTERNE_URL")
    private String statsExterneUrl;
    @Size(max = 1)
    @Column(name = "TEAMFOTOLOCATIE_INTERN")
    private String teamfotolocatieIntern;
    @Size(max = 100)
    @Column(name = "TEAMFOTOLOCATIE_URL")
    private String teamfotolocatieUrl;
    @Size(max = 100)

    public RisJaarSettings() {
    }

    public RisJaarSettings(Short jaar) {
        this.jaar = jaar;
    }

    public Short getJaar() {
        return jaar;
    }

    public void setJaar(Short jaar) {
        this.jaar = jaar;
    }

    public String getStatsIntern() {
        return statsIntern;
    }

    public void setStatsIntern(String statsIntern) {
        this.statsIntern = statsIntern;
    }

    public String getStatsExterneUrl() {
        return statsExterneUrl;
    }

    public void setStatsExterneUrl(String statsExterneUrl) {
        this.statsExterneUrl = statsExterneUrl;
    }

    public String getTeamfotolocatieIntern() {
        return teamfotolocatieIntern;
    }

    public void setTeamfotolocatieIntern(String teamfotolocatieIntern) {
        this.teamfotolocatieIntern = teamfotolocatieIntern;
    }

    public String getTeamfotolocatieUrl() {
        return teamfotolocatieUrl;
    }

    public void setTeamfotolocatieUrl(String teamfotolocatieUrl) {
        this.teamfotolocatieUrl = teamfotolocatieUrl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jaar != null ? jaar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisJaarSettings)) {
            return false;
        }
        RisJaarSettings other = (RisJaarSettings) object;
        if ((this.jaar == null && other.jaar != null) || (this.jaar != null && !this.jaar.equals(other.jaar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisJaarSettings[ jaar=" + jaar + " ]";
    }
    
}
