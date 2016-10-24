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
@Table(name = "RIS_WEDSTRIJDEN_MIX")
@NamedQueries({
    @NamedQuery(name = "RisWedstrijdenMix.findAll", query = "SELECT r FROM RisWedstrijdenMix r"),
    @NamedQuery(name = "RisWedstrijdenMix.findByVolgnr", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisWedstrijdenMix.findByDatum", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.datum = :datum"),
    @NamedQuery(name = "RisWedstrijdenMix.findByTijdstip", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.tijdstip = :tijdstip"),
    @NamedQuery(name = "RisWedstrijdenMix.findByPuntenVoor", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.puntenVoor = :puntenVoor"),
    @NamedQuery(name = "RisWedstrijdenMix.findByPuntenTegen", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.puntenTegen = :puntenTegen"),
    @NamedQuery(name = "RisWedstrijdenMix.findByTypeThuis", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.typeThuis = :typeThuis"),
    @NamedQuery(name = "RisWedstrijdenMix.findByTypeUit", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.typeUit = :typeUit"),
    @NamedQuery(name = "RisWedstrijdenMix.findByPouleThuis", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.pouleThuis = :pouleThuis"),
    @NamedQuery(name = "RisWedstrijdenMix.findByPouleThuisNr", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.pouleThuisNr = :pouleThuisNr"),
    @NamedQuery(name = "RisWedstrijdenMix.findByPouleUit", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.pouleUit = :pouleUit"),
    @NamedQuery(name = "RisWedstrijdenMix.findByPouleUitNr", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.pouleUitNr = :pouleUitNr"),
    @NamedQuery(name = "RisWedstrijdenMix.findByThuisWv", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.thuisWv = :thuisWv"),
    @NamedQuery(name = "RisWedstrijdenMix.findByThuisWed", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.thuisWed = :thuisWed"),
    @NamedQuery(name = "RisWedstrijdenMix.findByThuisNr", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.thuisNr = :thuisNr"),
    @NamedQuery(name = "RisWedstrijdenMix.findByUitWv", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.uitWv = :uitWv"),
    @NamedQuery(name = "RisWedstrijdenMix.findByUitWed", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.uitWed = :uitWed"),
    @NamedQuery(name = "RisWedstrijdenMix.findByUitNr", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.uitNr = :uitNr"),
    @NamedQuery(name = "RisWedstrijdenMix.findBySoort", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.soort = :soort"),
    @NamedQuery(name = "RisWedstrijdenMix.findByOpmerking", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.opmerking = :opmerking"),
    @NamedQuery(name = "RisWedstrijdenMix.findByScheidsrechters", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.scheidsrechters = :scheidsrechters"),
    @NamedQuery(name = "RisWedstrijdenMix.findByWedstrijdNummer", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.wedstrijdNummer = :wedstrijdNummer"),
    @NamedQuery(name = "RisWedstrijdenMix.findByJaar", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.jaar = :jaar"),
    @NamedQuery(name = "RisWedstrijdenMix.findByThuisTeam", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.thuisTeam = :thuisTeam"),
    @NamedQuery(name = "RisWedstrijdenMix.findByUitTeam", query = "SELECT r FROM RisWedstrijdenMix r WHERE r.uitTeam = :uitTeam")})
public class RisWedstrijdenMix implements Serializable {
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
    @Column(name = "TYPE_THUIS")
    private String typeThuis;
    @Size(max = 10)
    @Column(name = "TYPE_UIT")
    private String typeUit;
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
    @Column(name = "THUIS_WV")
    private String thuisWv;
    @Size(max = 10)
    @Column(name = "THUIS_WED")
    private String thuisWed;
    @Column(name = "THUIS_NR")
    private BigInteger thuisNr;
    @Size(max = 10)
    @Column(name = "UIT_WV")
    private String uitWv;
    @Size(max = 10)
    @Column(name = "UIT_WED")
    private String uitWed;
    @Column(name = "UIT_NR")
    private BigInteger uitNr;
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
    @Column(name = "THUIS_TEAM")
    private BigInteger thuisTeam;
    @Column(name = "UIT_TEAM")
    private BigInteger uitTeam;

    public RisWedstrijdenMix() {
    }

    public RisWedstrijdenMix(Long volgnr) {
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

    public String getTypeThuis() {
        return typeThuis;
    }

    public void setTypeThuis(String typeThuis) {
        this.typeThuis = typeThuis;
    }

    public String getTypeUit() {
        return typeUit;
    }

    public void setTypeUit(String typeUit) {
        this.typeUit = typeUit;
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

    public String getThuisWv() {
        return thuisWv;
    }

    public void setThuisWv(String thuisWv) {
        this.thuisWv = thuisWv;
    }

    public String getThuisWed() {
        return thuisWed;
    }

    public void setThuisWed(String thuisWed) {
        this.thuisWed = thuisWed;
    }

    public BigInteger getThuisNr() {
        return thuisNr;
    }

    public void setThuisNr(BigInteger thuisNr) {
        this.thuisNr = thuisNr;
    }

    public String getUitWv() {
        return uitWv;
    }

    public void setUitWv(String uitWv) {
        this.uitWv = uitWv;
    }

    public String getUitWed() {
        return uitWed;
    }

    public void setUitWed(String uitWed) {
        this.uitWed = uitWed;
    }

    public BigInteger getUitNr() {
        return uitNr;
    }

    public void setUitNr(BigInteger uitNr) {
        this.uitNr = uitNr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (volgnr != null ? volgnr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisWedstrijdenMix)) {
            return false;
        }
        RisWedstrijdenMix other = (RisWedstrijdenMix) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisWedstrijdenMix[ volgnr=" + volgnr + " ]";
    }
    
}
