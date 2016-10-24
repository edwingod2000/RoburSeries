/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisWedstrijdenKruis;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author godefrooije
 */
@Stateless
public class RisWedstrijdenKruisFacade extends AbstractFacade<RisWedstrijdenKruis> implements RisWedstrijdenKruisFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisWedstrijdenKruisFacade() {
        super(RisWedstrijdenKruis.class);
    }
    
}
