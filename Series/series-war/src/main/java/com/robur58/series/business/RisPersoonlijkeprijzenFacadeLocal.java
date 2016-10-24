/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisPersoonlijkeprijzen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisPersoonlijkeprijzenFacadeLocal {

    void create(RisPersoonlijkeprijzen risPersoonlijkeprijzen);

    void edit(RisPersoonlijkeprijzen risPersoonlijkeprijzen);

    void remove(RisPersoonlijkeprijzen risPersoonlijkeprijzen);

    RisPersoonlijkeprijzen find(Object id);

    List<RisPersoonlijkeprijzen> findAll();

    List<RisPersoonlijkeprijzen> findRange(int[] range);

    List<RisPersoonlijkeprijzen> findByJaarAndSoort(String jaar, String soort);
    
    int count();
    
}
