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
@Table(name = "RIS_POULE_COMMENTAAR")
@NamedQueries({
    @NamedQuery(name = "RisPouleCommentaar.findAll", query = "SELECT r FROM RisPouleCommentaar r"),
    @NamedQuery(name = "RisPouleCommentaar.findByVolgnr", query = "SELECT r FROM RisPouleCommentaar r WHERE r.volgnr = :volgnr"),
    @NamedQuery(name = "RisPouleCommentaar.findByJaar", query = "SELECT r FROM RisPouleCommentaar r WHERE r.jaar = :jaar"),
    @NamedQuery(name = "RisPouleCommentaar.findByAfkorting", query = "SELECT r FROM RisPouleCommentaar r WHERE r.afkorting = :afkorting"),
    @NamedQuery(name = "RisPouleCommentaar.findByCommentaar", query = "SELECT r FROM RisPouleCommentaar r WHERE r.commentaar = :commentaar")})
public class RisPouleCommentaar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOLGNR")
    private Long volgnr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "JAAR")
    private short jaar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "AFKORTING")
    private String afkorting;
    @Size(max = 1000)
    @Column(name = "COMMENTAAR")
    private String commentaar;

    public RisPouleCommentaar() {
    }

    public RisPouleCommentaar(Long volgnr) {
        this.volgnr = volgnr;
    }

    public RisPouleCommentaar(Long volgnr, short jaar, String afkorting) {
        this.volgnr = volgnr;
        this.jaar = jaar;
        this.afkorting = afkorting;
    }

    public Long getVolgnr() {
        return volgnr;
    }

    public void setVolgnr(Long volgnr) {
        this.volgnr = volgnr;
    }

    public short getJaar() {
        return jaar;
    }

    public void setJaar(short jaar) {
        this.jaar = jaar;
    }

    public String getAfkorting() {
        return afkorting;
    }

    public void setAfkorting(String afkorting) {
        this.afkorting = afkorting;
    }

    public String getCommentaar() {
        return commentaar;
    }

    public void setCommentaar(String commentaar) {
        this.commentaar = commentaar;
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
        if (!(object instanceof RisPouleCommentaar)) {
            return false;
        }
        RisPouleCommentaar other = (RisPouleCommentaar) object;
        if ((this.volgnr == null && other.volgnr != null) || (this.volgnr != null && !this.volgnr.equals(other.volgnr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.robur58.series.domein.RisPouleCommentaar[ volgnr=" + volgnr + " ]";
    }
    
}
