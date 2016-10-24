/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisVWedstrijden;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisVWedstrijdenFacadeLocal {

    void create(RisVWedstrijden risVWedstrijden);

    void edit(RisVWedstrijden risVWedstrijden);

    void remove(RisVWedstrijden risVWedstrijden);

    RisVWedstrijden find(Object id);

    List<RisVWedstrijden> findAll();

    List<RisVWedstrijden> findRange(int[] range);

    List<RisVWedstrijden> findByJaarAndSoort(String jaar, String soorten);

    int count();
    
}
