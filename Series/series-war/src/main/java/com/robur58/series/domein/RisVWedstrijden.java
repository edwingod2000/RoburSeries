/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author godefrooije
 */
@Entity
@Table(name = "RIS_V_WEDSTRIJDEN")
@NamedQueries({
    @NamedQuery(name = "RisVWedstrijden.findAll", query = "SELECT r FROM RisVWedstrijden r"),
    @NamedQuery(name = "RisVWedstrijden.findByVolgnr", query = "SELECT r FROM RisVWedstrijden r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisVWedstrijden.findByDatum", query = "SELECT r FROM RisVWedstrijden r WHERE r.datum = :datum"),
    @NamedQuery(name = "RisVWedstrijden.findByTijdstip", query = "SELECT r FROM RisVWedstrijden r WHERE r.tijdstip = :tijdstip"),
    @NamedQuery(name = "RisVWedstrijden.findByPoule", query = "SELECT r FROM RisVWedstrijden r WHERE r.poule = :poule"),
    @NamedQuery(name = "RisVWedstrijden.findByPuntenVoor", query = "SELECT r FROM RisVWedstrijden r WHERE r.puntenVoor = :puntenVoor"),
    @NamedQuery(name = "RisVWedstrijden.findByPuntenTegen", query = "SELECT r FROM RisVWedstrijden r WHERE r.puntenTegen = :puntenTegen"),
    @NamedQuery(name = "RisVWedstrijden.findByDisplayThuis", query = "SELECT r FROM RisVWedstrijden r WHERE r.displayThuis = :displayThuis"),
    @NamedQuery(name = "RisVWedstrijden.findByDisplayUit", query = "SELECT r FROM RisVWedstrijden r WHERE r.displayUit = :displayUit"),
    @NamedQuery(name = "RisVWedstrijden.findBySoort", query = "SELECT r FROM RisVWedstrijden r WHERE r.soort = :soort"),
    @NamedQuery(name = "RisVWedstrijden.findByOpmerking", query = "SELECT r FROM RisVWedstrijden r WHERE r.opmerking = :opmerking"),
    @NamedQuery(name = "RisVWedstrijden.findByScheidsrechters", query = "SELECT r FROM RisVWedstrijden r WHERE r.scheidsrechters = :scheidsrechters"),
    @NamedQuery(name = "RisVWedstrijden.findByWedstrijdNummer", query = "SELECT r FROM RisVWedstrijden r WHERE r.wedstrijdNummer = :wedstrijdNummer"),
    @NamedQuery(name = "RisVWedstrijden.findByTypeWedstrijd", query = "SELECT r FROM RisVWedstrijden r WHERE r.typeWedstrijd = :typeWedstrijd"),
    @NamedQuery(name = "RisVWedstrijden.findByJaar", query = "SELECT r FROM RisVWedstrijden r WHERE r.jaar = :jaar")})
public class RisVWedstrijden implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "VOLGNR")
    private Long volgnr;
    @Column(name = "DATUM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datum;
    @Size(max = 10)
    @Column(name = "TIJDSTIP")
    private String tijdstip;
    @Size(max = 100)
    @Column(name = "POULE")
    private String poule;
    @Size(max = 10)
    @Column(name = "PUNTEN_VOOR")
    private String puntenVoor;
    @Size(max = 10)
    @Column(name = "PUNTEN_TEGEN")
    private String puntenTegen;
    @Size(max = 100)
    @Column(name = "DISPLAY_THUIS")
    private String displayThuis;
    @Size(max = 100)
    @Column(name = "DISPLAY_UIT")
    private String displayUit;
    @Size(max = 10)
    @Column(name = "SOORT")
    private String soort;
    @Size(max = 50)
    @Column(name = "OPMERKING")
    private String opmerking;
    @Size(max = 100)
    @Column(name = "SCHEIDSRECHTERS")
    private String scheidsrechters;
    @Column(name = "WEDSTRIJD_NUMMER")
    private BigInteger wedstrijdNummer;
    @Size(max = 6)
    @Column(name = "TYPE_WEDSTRIJD")
    private String typeWedstrijd;
    @Column(name = "JAAR")
    private Short jaar;

    public RisVWedstrijden() {
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

    public String getPoule() {
        return poule;
    }

    public void setPoule(String poule) {
        this.poule = poule;
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

    public String getDisplayThuis() {
        return displayThuis;
    }

    public void setDisplayThuis(String displayThuis) {
        this.displayThuis = displayThuis;
    }

    public String getDisplayUit() {
        return displayUit;
    }

    public void setDisplayUit(String displayUit) {
        this.displayUit = displayUit;
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

    public BigInteger getWedstrijdNummer() {
        return wedstrijdNummer;
    }

    public void setWedstrijdNummer(BigInteger wedstrijdNummer) {
        this.wedstrijdNummer = wedstrijdNummer;
    }

    public String getTypeWedstrijd() {
        return typeWedstrijd;
    }

    public void setTypeWedstrijd(String typeWedstrijd) {
        this.typeWedstrijd = typeWedstrijd;
    }

    public Short getJaar() {
        return jaar;
    }

    public void setJaar(Short jaar) {
        this.jaar = jaar;
    }
    
    public boolean isDemo() {
        if (typeWedstrijd.toUpperCase().contains("DEMO")) {
            return true;
        } else {
            return false;
        }
    }
}
