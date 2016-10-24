/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisSoort;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author godefrooije
 */
@Stateless
public class RisSoortFacade extends AbstractFacade<RisSoort> implements RisSoortFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisSoortFacade() {
        super(RisSoort.class);
    }

    public RisSoort findByAfkorting(String afkorting) {
        Query q = em.createNamedQuery("RisSoort.findByAfkorting");
        q.setParameter("afkorting", afkorting);
        return (RisSoort)q.getSingleResult();
    }
}
