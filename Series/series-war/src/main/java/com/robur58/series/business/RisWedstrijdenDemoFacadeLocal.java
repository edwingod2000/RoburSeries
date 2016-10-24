/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisWedstrijdenDemo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisWedstrijdenDemoFacadeLocal {

    void create(RisWedstrijdenDemo risWedstrijdenDemo);

    void edit(RisWedstrijdenDemo risWedstrijdenDemo);

    void remove(RisWedstrijdenDemo risWedstrijdenDemo);

    RisWedstrijdenDemo find(Object id);

    List<RisWedstrijdenDemo> findAll();

    List<RisWedstrijdenDemo> findRange(int[] range);

    int count();
    
}
