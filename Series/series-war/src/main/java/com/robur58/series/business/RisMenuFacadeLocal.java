/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisMenu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisMenuFacadeLocal {

    void create(RisMenu risMenu);

    void edit(RisMenu risMenu);

    void remove(RisMenu risMenu);

    RisMenu find(Object id);

    List<RisMenu> findAll();

    List<RisMenu> findRange(int[] range);

    int count();
    
}
