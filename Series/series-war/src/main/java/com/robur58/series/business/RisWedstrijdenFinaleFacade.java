/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisWedstrijdenFinale;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author godefrooije
 */
@Stateless
public class RisWedstrijdenFinaleFacade extends AbstractFacade<RisWedstrijdenFinale> implements RisWedstrijdenFinaleFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisWedstrijdenFinaleFacade() {
        super(RisWedstrijdenFinale.class);
    }
    
}
