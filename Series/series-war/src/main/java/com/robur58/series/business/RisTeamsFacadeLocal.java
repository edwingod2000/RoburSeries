/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robur58.series.business;

import com.robur58.series.domein.RisTeams;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author godefrooije
 */
@Local
public interface RisTeamsFacadeLocal {

    void create(RisTeams risTeams);

    void edit(RisTeams risTeams);

    void remove(RisTeams risTeams);

    RisTeams find(Object id);

    RisTeams findByVolgnr(Long volgnr);
    
    List<RisTeams> findAll();

    List<RisTeams> findRange(int[] range);

    List<RisTeams> findByJaarAndSoort(String jaar, String soort);
    
    List<String> findPoulesByJaarAndSoort(String jaar, String soort);

    List<RisTeams> findByPouleAndJaarAndSoort(String poule, String jaar, String soort);

    List<RisTeams> findBySoortAndJaarForEindstand(String soort, String jaar);

    boolean findByJaarAndEindstandNotNull(String jaar);

    int count();
    
}
