/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisWedstrijdenFinale;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisWedstrijdenFinaleFacadeLocal {

    void create(RisWedstrijdenFinale risWedstrijdenFinale);

    void edit(RisWedstrijdenFinale risWedstrijdenFinale);

    void remove(RisWedstrijdenFinale risWedstrijdenFinale);

    RisWedstrijdenFinale find(Object id);

    List<RisWedstrijdenFinale> findAll();

    List<RisWedstrijdenFinale> findRange(int[] range);

    int count();
    
}
