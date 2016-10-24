/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisVWedstrijden;
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
public class RisVWedstrijdenFacade extends AbstractFacade<RisVWedstrijden> implements RisVWedstrijdenFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisVWedstrijdenFacade() {
        super(RisVWedstrijden.class);
    }

    public List<RisVWedstrijden> findByJaarAndSoort(String jaar, String soorten) {
        Short jaarShort = Short.parseShort(jaar);
        Query q = em.createQuery("SELECT r FROM RisVWedstrijden r WHERE r.jaar = " + jaar + " AND r.soort in ( " + soorten + " ) ORDER BY r.datum, r.tijdstip");
        return q.getResultList();
    }

}
