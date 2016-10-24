package com.robur58.series.web.controller;

import com.robur58.series.business.RisSoortFacadeLocal;
import com.robur58.series.business.RisTeamsFacadeLocal;
import com.robur58.series.business.RisVWedstrijdenFacadeLocal;
import com.robur58.series.domein.RisSoort;
import com.robur58.series.domein.RisTeams;
import com.robur58.series.domein.RisVWedstrijden;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.apache.commons.lang.StringUtils;

@ManagedBean(name="wedstrijdenController")
@SessionScoped
public class WedstrijdenController {

    @EJB
    private RisVWedstrijdenFacadeLocal wedstrijdenFacade;
    
    @EJB
    private RisTeamsFacadeLocal teamsFacade;

    @EJB
    private RisSoortFacadeLocal soortFacade;
    
    private List<RisVWedstrijden> wedstrijden;
    
    private List<Date> datumLijst;
    
    private List<String> poules;
    private RisSoort soort;
    
    public WedstrijdenController() {
    }
    
    public void ophalenWedstrijden(String jaar, String soort) {
        if(!StringUtils.isEmpty(jaar) && !StringUtils.isEmpty(soort)) {
            String soorten = "'"+soort+"','DEMO"+soort+"'";

            wedstrijden = wedstrijdenFacade.findByJaarAndSoort(jaar, soorten);
            ophalenPoules(jaar, soort);
            this.soort = ophalenSoort(soort);
            maakDatumLijst(wedstrijden);
        }
    }

    public List<RisTeams> ophalenTeamsOpPouleAndJaarAndSoort(String poule, String jaar, String soort) {
        if (!StringUtils.isEmpty(poule) && !StringUtils.isEmpty(jaar) && !StringUtils.isEmpty(soort)) {
            return teamsFacade.findByPouleAndJaarAndSoort(poule, jaar, soort);
        } else {
            return new ArrayList<RisTeams>();
        }
    }
    
    public List<RisVWedstrijden> getWedstrijden() {
        return wedstrijden;
    }

    public void setWedstrijden(List<RisVWedstrijden> wedstrijden) {
        this.wedstrijden = wedstrijden;
    }
    
    private void maakDatumLijst(List<RisVWedstrijden> wedstrijdenLijst) {
        datumLijst = new ArrayList<Date>();
        
        Date currentDate = null;
        
        for (RisVWedstrijden wedstrijd: wedstrijdenLijst) {
            if (!wedstrijd.getDatum().equals(currentDate)) {
                datumLijst.add(wedstrijd.getDatum());
                currentDate = wedstrijd.getDatum();
            }
        }
    }
    
    public List<RisVWedstrijden> ophalenWedstrijdenOpDatum(Date datum) {
        List<RisVWedstrijden> result = new ArrayList<RisVWedstrijden>();
        
        for(RisVWedstrijden wedstrijd: wedstrijden) {
            if (wedstrijd.getDatum().equals(datum)) {
                result.add(wedstrijd);
            }
        }
        return result;
    }

    public void ophalenPoules(String jaar, String soort) {
        poules = teamsFacade.findPoulesByJaarAndSoort(jaar, soort);
    }
    
    public List<Date> getDatumLijst() {
        return datumLijst;
    }

    public void setDatumLijst(List<Date> datumLijst) {
        this.datumLijst = datumLijst;
    }
    
    public String datumTitel(Date date) {
        // Voorbeeld: dinsdag 06 juli 2010 / Tuesday 06 July 2010
        StringBuilder result = new StringBuilder();
        Locale localeNL = new Locale("NL");
        String datePattern = "EEEE dd MMMM yyyy";
        SimpleDateFormat sdfNL = new SimpleDateFormat(datePattern, localeNL);
        SimpleDateFormat sdfEN = new SimpleDateFormat(datePattern, Locale.US);
        
        result.append(sdfNL.format(date));
        result.append(" / ");
        result.append(sdfEN.format(date));
        
        return result.toString();
    }

    public List<String> getPoules() {
        return poules;
    }

    public void setPoules(List<String> poules) {
        this.poules = poules;
    }

    private RisSoort ophalenSoort(String soort) {
        if (!StringUtils.isEmpty(soort)) {
            return soortFacade.findByAfkorting(soort);
        }
        return null;
    }

    public RisSoort getSoort() {
        return soort;
    }

    public void setSoort(RisSoort soort) {
        this.soort = soort;
    }
    
    
}
