/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisWedstrijdenPoule;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisWedstrijdenPouleFacadeLocal {

    void create(RisWedstrijdenPoule risWedstrijdenPoule);

    void edit(RisWedstrijdenPoule risWedstrijdenPoule);

    void remove(RisWedstrijdenPoule risWedstrijdenPoule);

    RisWedstrijdenPoule find(Object id);

    List<RisWedstrijdenPoule> findAll();

    List<RisWedstrijdenPoule> findRange(int[] range);

    int count();
    
}
