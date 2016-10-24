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
@Table(name = "RIS_WEDSTRIJDEN_KRUIS")
@NamedQueries({
    @NamedQuery(name = "RisWedstrijdenKruis.findAll", query = "SELECT r FROM RisWedstrijdenKruis r"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByVolgnr", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByDatum", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.datum = :datum"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByTijdstip", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.tijdstip = :tijdstip"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByPuntenVoor", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.puntenVoor = :puntenVoor"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByPuntenTegen", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.puntenTegen = :puntenTegen"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByPouleThuis", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.pouleThuis = :pouleThuis"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByPouleThuisNr", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.pouleThuisNr = :pouleThuisNr"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByPouleUit", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.pouleUit = :pouleUit"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByPouleUitNr", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.pouleUitNr = :pouleUitNr"),
    @NamedQuery(name = "RisWedstrijdenKruis.findBySoort", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.soort = :soort"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByOpmerking", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.opmerking = :opmerking"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByScheidsrechters", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.scheidsrechters = :scheidsrechters"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByWedstrijdNummer", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.wedstrijdNummer = :wedstrijdNummer"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByThuisTeam", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.thuisTeam = :thuisTeam"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByUitTeam", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.uitTeam = :uitTeam"),
    @NamedQuery(name = "RisWedstrijdenKruis.findByJaar", query = "SELECT r FROM RisWedstrijdenKruis r WHERE r.jaar = :jaar")})
public class RisWedstrijdenKruis implements Serializable {
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
    @Size(max = 10)
    @Column(name = "POULE_THUIS")
    private String pouleThuis;
    @Size(max = 10)
    @Column(name = "POULE_THUIS_NR")
    private String pouleThuisNr;
    @Size(max = 10)
    @Column(name = "POULE_UIT")
    private String pouleUit;
    @Size(max = 10)
    @Column(name = "POULE_UIT_NR")
    private String pouleUitNr;
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
    @Column(name = "THUIS_TEAM")
    private BigInteger thuisTeam;
    @Column(name = "UIT_TEAM")
    private BigInteger uitTeam;
    @Column(name = "JAAR")
    private Short jaar;

    public RisWedstrijdenKruis() {
    }

    public RisWedstrijdenKruis(Long volgnr) {
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

    public String getPouleThuis() {
        return pouleThuis;
    }

    public void setPouleThuis(String pouleThuis) {
        this.pouleThuis = pouleThuis;
    }

    public String getPouleThuisNr() {
        return pouleThuisNr;
    }

    public void setPouleThuisNr(String pouleThuisNr) {
        this.pouleThuisNr = pouleThuisNr;
    }

    public String getPouleUit() {
        return pouleUit;
    }

    public void setPouleUit(String pouleUit) {
        this.pouleUit = pouleUit;
    }

    public String getPouleUitNr() {
        return pouleUitNr;
    }

    public void setPouleUitNr(String pouleUitNr) {
        this.pouleUitNr = pouleUitNr;
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

    public BigInteger getThuisTeam() {
        return thuisTeam;
    }

    public void setThuisTeam(BigInteger thuisTeam) {
        this.thuisTeam = thuisTeam;
    }

    public BigInteger getUitTeam() {
        return uitTeam;
    }

    public void setUitTeam(BigInteger uitTeam) {
        this.uitTeam = uitTeam;
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
        if (!(object instanceof RisWedstrijdenKruis)) {
            return false;
        }
        RisWedstrijdenKruis other = (RisWedstrijdenKruis) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisWedstrijdenKruis[ volgnr=" + volgnr + " ]";
    }
    
}
