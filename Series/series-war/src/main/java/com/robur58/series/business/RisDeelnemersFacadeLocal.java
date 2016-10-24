/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisDeelnemers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisDeelnemersFacadeLocal {

    void create(RisDeelnemers risDeelnemers);

    void edit(RisDeelnemers risDeelnemers);

    void remove(RisDeelnemers risDeelnemers);

    RisDeelnemers find(Object id);

    List<RisDeelnemers> findAll();

    List<RisDeelnemers> findRange(int[] range);
    
    List<RisDeelnemers> findByTemVolgnr(Long temVolgnr);

    int count();
    
}
