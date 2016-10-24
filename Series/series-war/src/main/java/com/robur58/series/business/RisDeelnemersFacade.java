/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisDeelnemers;
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
public class RisDeelnemersFacade extends AbstractFacade<RisDeelnemers> implements RisDeelnemersFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisDeelnemersFacade() {
        super(RisDeelnemers.class);
    }

    public List<RisDeelnemers> findByTemVolgnr(Long temVolgnr) {
        Query q = em.createNamedQuery("RisDeelnemers.findByTemVolgnr");
        q.setParameter("temVolgnr", temVolgnr);
        return q.getResultList();
                
    }
}
