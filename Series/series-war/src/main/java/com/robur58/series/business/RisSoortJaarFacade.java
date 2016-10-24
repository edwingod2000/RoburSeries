/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisSoortJaar;
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
public class RisSoortJaarFacade extends AbstractFacade<RisSoortJaar> implements RisSoortJaarFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisSoortJaarFacade() {
        super(RisSoortJaar.class);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<RisSoortJaar> findByJaar(String jaar) {
        Query q = em.createNamedQuery("RisSoortJaar.findByJaar");
        short jaarShort = Short.parseShort(jaar);
        q.setParameter("jaar", jaarShort);
        return (List<RisSoortJaar>)q.getResultList();
    }

    @Override
    public RisSoortJaar findByAfkortingAndJaar(String jaar, String afkorting) {
        Query q = em.createNamedQuery("RisSoortJaar.findByAfkortingAndJaar");
        short jaarShort = Short.parseShort(jaar);
        q.setParameter("jaar", jaarShort);
        q.setParameter("afkorting", afkorting);
        return (RisSoortJaar)q.getSingleResult();
    }
    
}
