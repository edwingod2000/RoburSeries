/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.robur58.series.business;

import com.robur58.series.domein.BsmTypeGastenboek;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Gebruiker
 */
@Local
public interface BsmTypeGastenboekFacadeLocal {

    void create(BsmTypeGastenboek bsmTypeGastenboek);

    void edit(BsmTypeGastenboek bsmTypeGastenboek);

    void remove(BsmTypeGastenboek bsmTypeGastenboek);

    BsmTypeGastenboek find(Object id);

    List<BsmTypeGastenboek> findAll();

    List<BsmTypeGastenboek> findRange(int[] range);

    int count();

}
