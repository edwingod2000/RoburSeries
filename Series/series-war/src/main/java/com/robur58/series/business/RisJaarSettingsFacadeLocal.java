/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisJaarSettings;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisJaarSettingsFacadeLocal {

    void create(RisJaarSettings risJaarSettings);

    void edit(RisJaarSettings risJaarSettings);

    void remove(RisJaarSettings risJaarSettings);

    RisJaarSettings find(Object id);

    List<RisJaarSettings> findAll();

    List<RisJaarSettings> findRange(int[] range);

    RisJaarSettings findByJaar(String jaar);
    
    int count();
    
}
