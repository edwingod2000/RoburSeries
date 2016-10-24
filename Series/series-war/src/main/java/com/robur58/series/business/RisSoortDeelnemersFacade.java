/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisSoortDeelnemers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author godefrooije
 */
@Stateless
public class RisSoortDeelnemersFacade extends AbstractFacade<RisSoortDeelnemers> implements RisSoortDeelnemersFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisSoortDeelnemersFacade() {
        super(RisSoortDeelnemers.class);
    }
    
}
