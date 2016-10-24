/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisHoogtepunten;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author godefrooije
 */
@Stateless
public class RisHoogtepuntenFacade extends AbstractFacade<RisHoogtepunten> implements RisHoogtepuntenFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisHoogtepuntenFacade() {
        super(RisHoogtepunten.class);
    }

    public RisHoogtepunten findByVolgnr(String volgnr) {
        long longValue = Long.parseLong(volgnr);
        Query q = em.createNamedQuery("RisHoogtepunten.findByVolgnr");
        q.setParameter("volgnr", longValue);
        return (RisHoogtepunten)q.getSingleResult();
    }
    
    public List<RisHoogtepunten> findByJaar(String jaar) {
        short jaarShort = Short.parseShort(jaar);
        Query q = em.createNamedQuery("RisHoogtepunten.findByJaar");
        q.setParameter("jaar", jaarShort);
        return q.getResultList();
    }

}
