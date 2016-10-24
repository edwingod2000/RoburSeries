/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author godefrooije
 */
@Entity
@Table(name = "RIS_WEDSTRIJDEN_DEMO")
@NamedQueries({
    @NamedQuery(name = "RisWedstrijdenDemo.findAll", query = "SELECT r FROM RisWedstrijdenDemo r"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByVolgnr", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByDatum", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.datum = :datum"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByTijdstip", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.tijdstip = :tijdstip"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByPuntenVoor", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.puntenVoor = :puntenVoor"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByPuntenTegen", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.puntenTegen = :puntenTegen"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByTeamThuis", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.teamThuis = :teamThuis"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByTeamUit", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.teamUit = :teamUit"),
    @NamedQuery(name = "RisWedstrijdenDemo.findBySoort", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.soort = :soort"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByOpmerking", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.opmerking = :opmerking"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByScheidsrechters", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.scheidsrechters = :scheidsrechters"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByWedstrijdNummer", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.wedstrijdNummer = :wedstrijdNummer"),
    @NamedQuery(name = "RisWedstrijdenDemo.findByJaar", query = "SELECT r FROM RisWedstrijdenDemo r WHERE r.jaar = :jaar")})
public class RisWedstrijdenDemo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOLGNR")
    private Long volgnr;
    @Column(name = "DATUM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datum;
    @Size(max = 10)
    @Column(name = "TIJDSTIP")
    private String tijdstip;
    @Size(max = 10)
    @Column(name = "PUNTEN_VOOR")
    private String puntenVoor;
    @Size(max = 10)
    @Column(name = "PUNTEN_TEGEN")
    private String puntenTegen;
    @Size(max = 100)
    @Column(name = "TEAM_THUIS")
    private String teamThuis;
    @Size(max = 100)
    @Column(name = "TEAM_UIT")
    private String teamUit;
    @Size(max = 10)
    @Column(name = "SOORT")
    private String soort;
    @Size(max = 50)
    @Column(name = "OPMERKING")
    private String opmerking;
    @Size(max = 100)
    @Column(name = "SCHEIDSRECHTERS")
    private String scheidsrechters;
    @Size(max = 10)
    @Column(name = "WEDSTRIJD_NUMMER")
    private String wedstrijdNummer;
    @Column(name = "JAAR")
    private Short jaar;

    public RisWedstrijdenDemo() {
    }

    public RisWedstrijdenDemo(Long volgnr) {
        this.volgnr = volgnr;
    }

    public Long getVolgnr() {
        return volgnr;
    }

    public void setVolgnr(Long volgnr) {
        this.volgnr = volgnr;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(String tijdstip) {
        this.tijdstip = tijdstip;
    }

    public String getPuntenVoor() {
        return puntenVoor;
    }

    public void setPuntenVoor(String puntenVoor) {
        this.puntenVoor = puntenVoor;
    }

    public String getPuntenTegen() {
        return puntenTegen;
    }

    public void setPuntenTegen(String puntenTegen) {
        this.puntenTegen = puntenTegen;
    }

    public String getTeamThuis() {
        return teamThuis;
    }

    public void setTeamThuis(String teamThuis) {
        this.teamThuis = teamThuis;
    }

    public String getTeamUit() {
        return teamUit;
    }

    public void setTeamUit(String teamUit) {
        this.teamUit = teamUit;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getOpmerking() {
        return opmerking;
    }

    public void setOpmerking(String opmerking) {
        this.opmerking = opmerking;
    }

    public String getScheidsrechters() {
        return scheidsrechters;
    }

    public void setScheidsrechters(String scheidsrechters) {
        this.scheidsrechters = scheidsrechters;
    }

    public String getWedstrijdNummer() {
        return wedstrijdNummer;
    }

    public void setWedstrijdNummer(String wedstrijdNummer) {
        this.wedstrijdNummer = wedstrijdNummer;
    }

    public Short getJaar() {
        return jaar;
    }

    public void setJaar(Short jaar) {
        this.jaar = jaar;
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
        if (!(object instanceof RisWedstrijdenDemo)) {
            return false;
        }
        RisWedstrijdenDemo other = (RisWedstrijdenDemo) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisWedstrijdenDemo[ volgnr=" + volgnr + " ]";
    }
    
}
