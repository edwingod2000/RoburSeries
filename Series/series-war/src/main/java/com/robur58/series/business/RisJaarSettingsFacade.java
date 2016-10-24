/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisJaarSettings;
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
public class RisJaarSettingsFacade extends AbstractFacade<RisJaarSettings> implements RisJaarSettingsFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RisJaarSettingsFacade() {
        super(RisJaarSettings.class);
    }
    
    @Override
    public RisJaarSettings findByJaar(String jaar) {
        Query q = em.createNamedQuery("RisJaarSettings.findByJaar");
        short jaarShort = Short.parseShort(jaar);
        q.setParameter("jaar", jaarShort);
        return (RisJaarSettings)q.getSingleResult();
    }

}
