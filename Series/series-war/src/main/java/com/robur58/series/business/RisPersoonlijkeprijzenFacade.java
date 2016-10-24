/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisPersoonlijkeprijzen;
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
public class RisPersoonlijkeprijzenFacade extends AbstractFacade<RisPersoonlijkeprijzen> implements RisPersoonlijkeprijzenFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RisPersoonlijkeprijzenFacade() {
        super(RisPersoonlijkeprijzen.class);
    }

    @Override
    public List<RisPersoonlijkeprijzen> findByJaarAndSoort(String jaar, String soort) {
        short jaarShort = Short.parseShort(jaar);
        Query q = em.createNamedQuery("RisPersoonlijkeprijzen.findByJaarAndSoort");
        q.setParameter("jaar", jaarShort);
        q.setParameter("soort", soort);
        return q.getResultList();
    }
    
}
