/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "RIS_WEDSTRIJDEN_POULE")
@NamedQueries({
    @NamedQuery(name = "RisWedstrijdenPoule.findAll", query = "SELECT r FROM RisWedstrijdenPoule r"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByVolgnr", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByDatum", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.datum = :datum"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByTijdstip", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.tijdstip = :tijdstip"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByPuntenVoor", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.puntenVoor = :puntenVoor"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByPuntenTegen", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.puntenTegen = :puntenTegen"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByTeamVolgnr", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.teamVolgnr = :teamVolgnr"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByTeam2Volgnr", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.team2Volgnr = :team2Volgnr"),
    @NamedQuery(name = "RisWedstrijdenPoule.findBySoort", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.soort = :soort"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByOpmerking", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.opmerking = :opmerking"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByScheidsrechters", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.scheidsrechters = :scheidsrechters"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByWedstrijdNummer", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.wedstrijdNummer = :wedstrijdNummer"),
    @NamedQuery(name = "RisWedstrijdenPoule.findByJaar", query = "SELECT r FROM RisWedstrijdenPoule r WHERE r.jaar = :jaar")})
public class RisWedstrijdenPoule implements Serializable {
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
    @Column(name = "TEAM_VOLGNR")
    private BigInteger teamVolgnr;
    @Column(name = "TEAM2_VOLGNR")
    private BigInteger team2Volgnr;
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

    public RisWedstrijdenPoule() {
    }

    public RisWedstrijdenPoule(Long volgnr) {
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

    public BigInteger getTeamVolgnr() {
        return teamVolgnr;
    }

    public void setTeamVolgnr(BigInteger teamVolgnr) {
        this.teamVolgnr = teamVolgnr;
    }

    public BigInteger getTeam2Volgnr() {
        return team2Volgnr;
    }

    public void setTeam2Volgnr(BigInteger team2Volgnr) {
        this.team2Volgnr = team2Volgnr;
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
        if (!(object instanceof RisWedstrijdenPoule)) {
            return false;
        }
        RisWedstrijdenPoule other = (RisWedstrijdenPoule) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisWedstrijdenPoule[ volgnr=" + volgnr + " ]";
    }
    
}
