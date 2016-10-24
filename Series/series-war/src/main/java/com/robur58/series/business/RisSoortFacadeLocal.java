/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisSoort;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisSoortFacadeLocal {

    void create(RisSoort risSoort);

    void edit(RisSoort risSoort);

    void remove(RisSoort risSoort);

    RisSoort find(Object id);

    List<RisSoort> findAll();

    List<RisSoort> findRange(int[] range);

    RisSoort findByAfkorting(String afkorting);

    int count();
    
}
