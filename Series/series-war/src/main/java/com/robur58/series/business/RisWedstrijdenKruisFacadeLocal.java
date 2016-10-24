/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisWedstrijdenKruis;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisWedstrijdenKruisFacadeLocal {

    void create(RisWedstrijdenKruis risWedstrijdenKruis);

    void edit(RisWedstrijdenKruis risWedstrijdenKruis);

    void remove(RisWedstrijdenKruis risWedstrijdenKruis);

    RisWedstrijdenKruis find(Object id);

    List<RisWedstrijdenKruis> findAll();

    List<RisWedstrijdenKruis> findRange(int[] range);

    int count();
    
}
