/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisSoortJaar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisSoortJaarFacadeLocal {

    void create(RisSoortJaar risSoortJaar);

    void edit(RisSoortJaar risSoortJaar);

    void remove(RisSoortJaar risSoortJaar);

    RisSoortJaar find(Object id);

    List<RisSoortJaar> findAll();

    List<RisSoortJaar> findRange(int[] range);

    List<RisSoortJaar> findByJaar(String jaar);

    RisSoortJaar findByAfkortingAndJaar(String jaar, String afkorting);
    
    int count();
    
}
