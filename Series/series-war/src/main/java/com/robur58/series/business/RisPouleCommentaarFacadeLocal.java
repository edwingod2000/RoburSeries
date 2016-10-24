/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisPouleCommentaar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisPouleCommentaarFacadeLocal {

    void create(RisPouleCommentaar risPouleCommentaar);

    void edit(RisPouleCommentaar risPouleCommentaar);

    void remove(RisPouleCommentaar risPouleCommentaar);

    RisPouleCommentaar find(Object id);

    List<RisPouleCommentaar> findAll();

    List<RisPouleCommentaar> findRange(int[] range);

    int count();
    
}
