/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisSysvar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisSysvarFacadeLocal {

    void create(RisSysvar risSysvar);

    void edit(RisSysvar risSysvar);

    void remove(RisSysvar risSysvar);

    RisSysvar find(Object id);

    List<RisSysvar> findAll();

    List<RisSysvar> findRange(int[] range);

    int count();

    RisSysvar findByCode(String code);

}
