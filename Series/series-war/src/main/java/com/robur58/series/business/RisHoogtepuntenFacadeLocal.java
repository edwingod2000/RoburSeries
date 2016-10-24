/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisHoogtepunten;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisHoogtepuntenFacadeLocal {

    void create(RisHoogtepunten risHoogtepunten);

    void edit(RisHoogtepunten risHoogtepunten);

    void remove(RisHoogtepunten risHoogtepunten);

    RisHoogtepunten find(Object id);

    List<RisHoogtepunten> findAll();

    List<RisHoogtepunten> findRange(int[] range);

    RisHoogtepunten findByVolgnr(String volgnr);
    
    List<RisHoogtepunten> findByJaar(String jaar);
    
    int count();
    
}
