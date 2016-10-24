package com.robur58.series.web.controller;

import com.robur58.series.business.RisDeelnemersFacadeLocal;
import com.robur58.series.business.RisPersoonlijkeprijzenFacadeLocal;
import com.robur58.series.business.RisSoortFacadeLocal;
import com.robur58.series.business.RisSoortJaarFacadeLocal;
import com.robur58.series.business.RisJaarSettingsFacadeLocal;
import com.robur58.series.business.RisTeamsFacadeLocal;
import com.robur58.series.domein.RisDeelnemers;
import com.robur58.series.domein.RisPersoonlijkeprijzen;
import com.robur58.series.domein.RisSoort;
import com.robur58.series.domein.RisSoortJaar;
import com.robur58.series.domein.RisJaarSettings;
import com.robur58.series.domein.RisTeams;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.apache.commons.lang.StringUtils;

@ManagedBean
@SessionScoped
public class TeamsController {
    
    @EJB
    private RisTeamsFacadeLocal teamsFacade;
    
    @EJB
    private RisSoortJaarFacadeLocal soortJaarFacade;
    
    @EJB
    private RisDeelnemersFacadeLocal deelnemersFacade;
    
    @EJB
    private RisSoortFacadeLocal soortFacade;
    
    @EJB
    private RisJaarSettingsFacadeLocal jaarSettingsFacade;
    
    @EJB
    private RisPersoonlijkeprijzenFacadeLocal persoonlijkeprijzenFacade;
    
    private String jaar;
    private String soort;
    private List<RisTeams> teams;
    private RisTeams team;
    private List<RisDeelnemers> deelnemers;
    private String teamFotoLocatiePrefix = "http://homeplate.robur58.com/ris-doc/";
    private String teamFotoLocatiePostfix = "/teamfotos/";

    public TeamsController() {
        
    }
    
    public String getTeamFotoUrl(String jaar) {
        RisJaarSettings jaarSetting = jaarSettingsFacade.findByJaar(jaar);
        if (team != null) {
            if (jaarSetting.getTeamfotolocatieIntern().equals("J")) {
                return teamFotoLocatiePrefix + team.getJaar() + teamFotoLocatiePostfix + team.getFoto();
            } else {
                return jaarSetting.getTeamfotolocatieUrl() + team.getFoto();
            }
        } else {
            return "";
        }
    }

    public String getTeamFotoBigUrl(String jaar) {
        RisJaarSettings jaarSetting = jaarSettingsFacade.findByJaar(jaar);
        if (team != null) {
            if (jaarSetting.getTeamfotolocatieIntern().equals("J")) {
                return teamFotoLocatiePrefix + team.getJaar() + teamFotoLocatiePostfix + team.getFotoBig();
            } else {
                return jaarSetting.getTeamfotolocatieUrl() + team.getFotoBig();
            }
        } else {
            return "";
        }
    }
    
    public String getStatsZipUrl(String jaar, String soort) {
        RisJaarSettings jaarSetting = jaarSettingsFacade.findByJaar(jaar);
        if (jaarSetting.getStatsIntern().equals("J")) {
            return "http://homeplate.robur58.com/ris-doc/" + jaar + "/stats/" + soort + ".zip";
        } else {
            return jaarSetting.getStatsExterneUrl() + soort + ".zip";
        }
    }

    public String getStatsUrl(String jaar, String soort, String team) {
        RisJaarSettings jaarSetting = jaarSettingsFacade.findByJaar(jaar);
        if (StringUtils.isEmpty(team)) {
            if (jaarSetting.getStatsIntern().equals("J")) {
                return "http://homeplate.robur58.com/ris-doc/" + jaar + "/stats/" + soort + "/confstat.htm";
            } else {
                return jaarSetting.getStatsExterneUrl() + soort + "/confstat.htm";
            }
        } else {
            RisTeams statsTeam = teamsFacade.findByVolgnr(Long.parseLong(team));
            if (jaarSetting.getStatsIntern().equals("J")) {
                return "http://homeplate.robur58.com/ris-doc/" + jaar + "/stats/" + soort + "/" + statsTeam.getStatsHtmlpagina();
            } else {
                return jaarSetting.getStatsExterneUrl() + soort + "/" + statsTeam.getStatsHtmlpagina();
            }
        }
    }

    public String getStandUrl(String jaar, String soort) {
        return "http://homeplate.robur58.com/pls/ris/ris_pck_stand.toon_stand?p_soort=" + soort + "&p_jaar=" + jaar;
    }
    
    public String getJaar() {
        if (jaar == null) {
            Calendar cal = Calendar.getInstance();
            jaar = "" + cal.get(Calendar.YEAR);
            
        }
        return jaar;
    }

    public void setJaar(String jaar) {
        this.jaar = jaar;
    }

    public List<RisTeams> getTeams() {
        return teams;
    }

    public void setTeams(List<RisTeams> teams) {
        this.teams = teams;
    }
    
    public List<RisSoortJaar> ophalenSoorten(String jaar) {
        if (!StringUtils.isEmpty(jaar)) {
            return soortJaarFacade.findByJaar(jaar);
        }
        return new ArrayList<RisSoortJaar>();
    }
    
    public List<RisTeams> ophalenTeams(String jaar, String soort) {
        if (!StringUtils.isEmpty(jaar) && !StringUtils.isEmpty(soort)) {
            return teamsFacade.findByJaarAndSoort(jaar, soort);
        }
        return new ArrayList<RisTeams>();
    }
    
    public void ophalenTeamLineup(String jaar, String temVolgnr) {
        jaar = jaar;
        Long temVolgnrLong = Long.parseLong(temVolgnr);
        team = teamsFacade.findByVolgnr(temVolgnrLong);
        deelnemers = deelnemersFacade.findByTemVolgnr(temVolgnrLong);
    }
    
    public List<RisTeams> ophalenTeamsEindstand(String jaar, String soort) {
        jaar = jaar;
        if (!StringUtils.isEmpty(jaar) && !StringUtils.isEmpty(soort)) {
            return teamsFacade.findBySoortAndJaarForEindstand(soort, jaar);
        }
        return new ArrayList<RisTeams>();
    }
    
    public List<RisPersoonlijkeprijzen> ophalenPersonalPrices(String jaar, String soort) {
        if (!StringUtils.isEmpty(jaar) && !StringUtils.isEmpty(soort)) {
            return persoonlijkeprijzenFacade.findByJaarAndSoort(jaar, soort);
        }
        return new ArrayList<RisPersoonlijkeprijzen>();
    }
    
    public boolean toonWinners(String jaar) {
        if (!StringUtils.isEmpty(jaar)) {
            return teamsFacade.findByJaarAndEindstandNotNull(jaar);
        } else {
            return false;
        }
    }
    
    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public List<RisDeelnemers> getDeelnemers() {
        return deelnemers;
    }

    public void setDeelnemers(List<RisDeelnemers> deelnemers) {
        this.deelnemers = deelnemers;
    }

    public RisTeams getTeam() {
        return team;
    }
    
    public void setTeam(RisTeams team) {
        this.team = team;
    }
    
    public String getStandTitel(String soort, String jaar) {
        StringBuilder result = new StringBuilder();
        if (!StringUtils.isEmpty(soort)) {
            RisSoort soortObject = getSoort(soort);
            
            result.append(soortObject.getTitelNl() +" Standen / " + soortObject.getTitelEn() + " Ranking " + jaar);
            
        }
        return result.toString();
    }
    
    public RisSoort getSoort(String soort) {
          return soortFacade.findByAfkorting(soort);
    }
}
