package com.robur58.series.web.controller;

import com.robur58.series.business.RisSysvarFacadeLocal;
import com.robur58.series.domein.RisSysvar;
import com.robur58.series.web.view.SeriesSessionTO;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import nl.profict.platform.web.util.FacesUtils;

@ManagedBean(name = "navigatieController")
@RequestScoped
public class NavigatieController {

    @EJB
    RisSysvarFacadeLocal sysvarFacade;
    
    private String progress = "Opstarten......";
    private StringBuffer menu;
    private StringBuffer gebruikermenu;

    private String currentMenu = "1";

    private String currentTabblad = "1";

    @ManagedProperty(value="#{seriesSessionTO}")
    SeriesSessionTO seriesSessionTO;
    
    private static final Map<String, String> INTERNE_NAVIGATIE = new HashMap<String, String>();

    /** Creates a new instance of NavigatieController */
    public NavigatieController() {
    }

    @PostConstruct
    private void vulNavigatieMap() {
        INTERNE_NAVIGATIE.put("home", "/pages/homePage.faces");
        INTERNE_NAVIGATIE.put("organisatie", "/pages/infopagina.faces?typeInfo=60");
        INTERNE_NAVIGATIE.put("overdeseries", "/pages/infopagina.faces?typeInfo=61");
        INTERNE_NAVIGATIE.put("programma", "/pages/infopagina.faces?typeInfo=66");
        INTERNE_NAVIGATIE.put("regels", "/pages/infopagina.faces?typeInfo=59");
        INTERNE_NAVIGATIE.put("onderkomen", "/pages/infopagina.faces?typeInfo=62");
        INTERNE_NAVIGATIE.put("komendejaren", "/pages/infopagina.faces?typeInfo=65");
        INTERNE_NAVIGATIE.put("overrobur58", "/pages/infopagina.faces?typeInfo=67");
        INTERNE_NAVIGATIE.put("overhetspeelveld", "/pages/infopagina.faces?typeInfo=68");
        INTERNE_NAVIGATIE.put("souveniers", "/pages/infopagina.faces?typeInfo=69");
        INTERNE_NAVIGATIE.put("umpires", "/pages/infopagina.faces?typeInfo=70");
        INTERNE_NAVIGATIE.put("testimonials", "/pages/infopagina.faces?typeInfo=71");
        INTERNE_NAVIGATIE.put("school", "/pages/infopagina.faces?typeInfo=63");
        INTERNE_NAVIGATIE.put("umpireclinic", "/pages/infopagina.faces?typeInfo=73");
        INTERNE_NAVIGATIE.put("previousteams", "/pages/teamsList.faces?jaar="+ bepaalVorigJaar());
        INTERNE_NAVIGATIE.put("previouswedstrijden", "/pages/wedstrijdenList.faces?jaar=" + bepaalVorigJaar());
        INTERNE_NAVIGATIE.put("previousstatistieken", "/pages/statsList.faces?jaar=" + bepaalVorigJaar());
        INTERNE_NAVIGATIE.put("previousstand", "/pages/rankingList.faces?jaar=" + bepaalVorigJaar());
        INTERNE_NAVIGATIE.put("previoushoogtepunten", "/pages/highlightsList.faces?jaar=" + bepaalVorigJaar());
        INTERNE_NAVIGATIE.put("currentteams", "/pages/teamsList.faces?jaar=" + bepaalHuidigJaar());
        INTERNE_NAVIGATIE.put("currentwedstrijden", "/pages/wedstrijdenList.faces?jaar=" + bepaalHuidigJaar());
        INTERNE_NAVIGATIE.put("currentstatistieken", "/pages/statsList.faces?jaar="+ bepaalHuidigJaar());
        INTERNE_NAVIGATIE.put("currentstand", "/pages/rankingList.faces?jaar=" + bepaalHuidigJaar());
        INTERNE_NAVIGATIE.put("currenthoogtepunten", "/pages/highlightsList.faces?jaar=" + bepaalHuidigJaar());
        INTERNE_NAVIGATIE.put("nextteams", "/pages/teamsList.faces?jaar=" + bepaalVolgendJaar());
        INTERNE_NAVIGATIE.put("nextwedstrijden", "/pages/wedstrijdenList.faces?jaar=" + bepaalVolgendJaar());
        INTERNE_NAVIGATIE.put("nextstatistieken", "/pages/teamsList.faces?jaar=" + bepaalVolgendJaar());
        INTERNE_NAVIGATIE.put("nextstand", "/pages/rankingList.faces?jaar=" + bepaalVolgendJaar());
        INTERNE_NAVIGATIE.put("nexthoogtepunten", "/pages/highlightsList.faces?jaar=" + bepaalVolgendJaar());
        INTERNE_NAVIGATIE.put("sponsors", "/pages/infopagina.faces?typeInfo=82");
        INTERNE_NAVIGATIE.put("gastenboek", "/pages/gastenboek.faces");
        INTERNE_NAVIGATIE.put("archief", "/pages/archiefMain.faces");
        INTERNE_NAVIGATIE.put("inschrijven", "/pages/infopagina.faces?typeInfo=64");
        INTERNE_NAVIGATIE.put("contact", "/pages/infopagina.faces?typeInfo=60");
    }
    
    public void bepaalNavigatie() throws IOException {
        String startPage = FacesUtils.getContextPath() + "/pages/empty.faces";
        FacesContext.getCurrentInstance().getExternalContext().redirect(FacesUtils.getContextPath() + "/pages/empty.faces");

//        FacesUtils.handleNavigationRedirect("/pages/empty.xhtml");
//        FacesContext.getCurrentInstance().getExternalContext().redirect(startPage);
    }

    public String interneNavigatie(String page) {
        String url;
        
        if (INTERNE_NAVIGATIE.containsKey(page)) {
            url = INTERNE_NAVIGATIE.get(page);
        } else {
            url = null;
        }
        return url;
//        FacesContext.getCurrentInstance().getExternalContext().redirect(FacesUtils.getContextPath() + url);
//        return null;
    }

    public String getProgress() {
        return progress;
    }

    public SeriesSessionTO getSeriesSessionTO() {
        return seriesSessionTO;
    }

    public void setSeriesSessionTO(SeriesSessionTO seriesSessionTO) {
        this.seriesSessionTO = seriesSessionTO;
    }
    
    public Integer bepaalHuidigJaar() {
        Integer huidigJaar = null;
        String huidigJaarString = ((RisSysvar)sysvarFacade.findByCode("JAAR_SERIES")).getWaarde();
        if (huidigJaarString != null) {
            huidigJaar = Integer.parseInt(huidigJaarString);
        }

        return huidigJaar;
    }
    
    public String bepaalHuidigeDatum() {
        String beginDatumSeries;
        String eindDatumSeries;
        String tussen;
        if (getSeriesSessionTO().isDutch()) {
            beginDatumSeries = ((RisSysvar)sysvarFacade.findByCode("BEGINDATUM_SERIES_NL")).getWaarde();
            eindDatumSeries = ((RisSysvar)sysvarFacade.findByCode("EINDDATUM_SERIES_NL")).getWaarde();
            tussen = " t/m ";
        } else {
            beginDatumSeries = ((RisSysvar)sysvarFacade.findByCode("BEGINDATUM_SERIES_EN")).getWaarde();
            eindDatumSeries = ((RisSysvar)sysvarFacade.findByCode("EINDDATUM_SERIES_EN")).getWaarde();
            tussen = " - ";
        }
        return beginDatumSeries + tussen + eindDatumSeries;
    }
    
    public Integer bepaalVolgendJaar() {
        return bepaalHuidigJaar() + 1;
    }

    public Integer bepaalVorigJaar() {
        return bepaalHuidigJaar() - 1;
    }

    public boolean toonHuidigToernooiMenu() {
        String toonHuidigToernooiMenu = ((RisSysvar)sysvarFacade.findByCode("TOON_HUIDIG_TOERNOOI_MENU")).getWaarde();
        
        return Boolean.parseBoolean(toonHuidigToernooiMenu);
    }
}