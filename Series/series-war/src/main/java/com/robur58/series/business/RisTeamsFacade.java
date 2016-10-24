/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisTeams;
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
public class RisTeamsFacade extends AbstractFacade<RisTeams> implements RisTeamsFacadeLocal {
    @PersistenceContext(unitName = "Series-warPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public RisTeamsFacade() {
        super(RisTeams.class);
    }

    @Override
    public List<RisTeams> findByJaarAndSoort(String jaar, String soort) {
        short jaarShort = Short.parseShort(jaar);
        Query q = em.createNamedQuery("RisTeams.findByJaarAndSoort");
        q.setParameter("jaar", jaarShort);
        q.setParameter("soort", soort);
        return q.getResultList();
    }
    
    public RisTeams findByVolgnr(Long volgnr) {
        Query q = em.createNamedQuery("RisTeams.findByVolgnr");
        q.setParameter("volgnr", volgnr);
        return (RisTeams)q.getSingleResult();
    }
    
    public List<String> findPoulesByJaarAndSoort(String jaar, String soort) {
        Query q = em.createQuery("SELECT distinct r.poule FROM RisTeams r WHERE r.jaar = " + jaar + " AND r.soort = '" + soort + "'" );
        return q.getResultList();

    }
    
    public List<RisTeams> findByPouleAndJaarAndSoort(String poule, String jaar, String soort) {
        short jaarShort = Short.parseShort(jaar);
        Query q = em.createNamedQuery("RisTeams.findByPouleAndJaarAndSoort");
        q.setParameter("poule", poule);        
        q.setParameter("jaar", jaarShort);
        q.setParameter("soort", soort);
        return q.getResultList();
    }
    
    public List<RisTeams> findBySoortAndJaarForEindstand(String soort, String jaar) {
        short jaarShort = Short.parseShort(jaar);
        Query q = em.createNamedQuery("RisTeams.findBySoortAndJaarForEindstand");
        q.setParameter("soort", soort);    
        q.setParameter("jaar", jaarShort);
        return q.getResultList();
    }
    
    public boolean findByJaarAndEindstandNotNull(String jaar) {
        short jaarShort = Short.parseShort(jaar);
        Query q = em.createNamedQuery("RisTeams.findByJaarAndEindstandNotNull");
        q.setParameter("jaar", jaarShort);
        List<RisTeams> result = q.getResultList();
        if (result != null && result.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
