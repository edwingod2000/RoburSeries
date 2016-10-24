/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisSysvar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author godefrooije
 */
@Stateless
public class RisSysvarFacade extends AbstractFacade<RisSysvar> implements RisSysvarFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisSysvarFacade() {
        super(RisSysvar.class);
    }

    public RisSysvar findByCode(String code) {
        Query q = em.createNamedQuery("RisSysvar.findByCode");
        q.setParameter("code", code);
        return (RisSysvar)q.getSingleResult();
    }
    
}
