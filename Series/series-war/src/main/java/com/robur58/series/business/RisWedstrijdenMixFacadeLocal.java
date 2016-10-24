/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisWedstrijdenMix;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisWedstrijdenMixFacadeLocal {

    void create(RisWedstrijdenMix risWedstrijdenMix);

    void edit(RisWedstrijdenMix risWedstrijdenMix);

    void remove(RisWedstrijdenMix risWedstrijdenMix);

    RisWedstrijdenMix find(Object id);

    List<RisWedstrijdenMix> findAll();

    List<RisWedstrijdenMix> findRange(int[] range);

    int count();
    
}
