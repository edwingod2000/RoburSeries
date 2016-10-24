/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.domein;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author godefrooije
 */
@Entity
@Table(name = "RIS_V_POULE_JAAR")
@NamedQueries({
    @NamedQuery(name = "RisVPouleJaar.findAll", query = "SELECT r FROM RisVPouleJaar r"),
    @NamedQuery(name = "RisVPouleJaar.findByPoule", query = "SELECT r FROM RisVPouleJaar r WHERE r.poule = :poule"),
    @NamedQuery(name = "RisVPouleJaar.findByJaar", query = "SELECT r FROM RisVPouleJaar r WHERE r.jaar = :jaar"),
    @NamedQuery(name = "RisVPouleJaar.findBySoort", query = "SELECT r FROM RisVPouleJaar r WHERE r.soort = :soort"),
    @NamedQuery(name = "RisVPouleJaar.findByKey", query = "SELECT r FROM RisVPouleJaar r WHERE r.key = :key")})
public class RisVPouleJaar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 100)
    @Column(name = "POULE")
    private String poule;
    @Column(name = "JAAR")
    private Short jaar;
    @Size(max = 10)
    @Column(name = "SOORT")
    private String soort;
    @Size(max = 150)
    @Column(name = "KEY")
    @Id
    private String key;

    public RisVPouleJaar() {
    }

    public String getPoule() {
        return poule;
    }

    public void setPoule(String poule) {
        this.poule = poule;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
}
