/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisVPouleJaar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisVPouleJaarFacadeLocal {

    void create(RisVPouleJaar risVPouleJaar);

    void edit(RisVPouleJaar risVPouleJaar);

    void remove(RisVPouleJaar risVPouleJaar);

    RisVPouleJaar find(Object id);

    List<RisVPouleJaar> findAll();

    List<RisVPouleJaar> findRange(int[] range);

    int count();
    
}
