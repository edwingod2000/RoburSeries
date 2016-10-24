/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisSoortDeelnemers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisSoortDeelnemersFacadeLocal {

    void create(RisSoortDeelnemers risSoortDeelnemers);

    void edit(RisSoortDeelnemers risSoortDeelnemers);

    void remove(RisSoortDeelnemers risSoortDeelnemers);

    RisSoortDeelnemers find(Object id);

    List<RisSoortDeelnemers> findAll();

    List<RisSoortDeelnemers> findRange(int[] range);

    int count();
    
}
