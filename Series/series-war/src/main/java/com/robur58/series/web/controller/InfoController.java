package com.robur58.series.web.controller;

import com.robur58.series.business.BsmInfoFacadeLocal;
import com.robur58.series.business.BsmTypeInfoFacadeLocal;
import com.robur58.series.domein.BsmInfo;
import com.robur58.series.domein.BsmTypeInfo;
import com.robur58.series.web.view.SeriesSessionTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Gebruiker
 */
@ManagedBean(name="infoController")
@RequestScoped
public class InfoController {

    private List<BsmInfo> homepageInfo = new ArrayList<BsmInfo>();
    private List<BsmInfo> info = new ArrayList<BsmInfo>();
    private String infoTitel;

    @EJB
    private BsmInfoFacadeLocal infoFacade;

    @EJB
    private BsmTypeInfoFacadeLocal typeInfoFacade;

    @ManagedProperty(value="#{seriesSessionTO}")
    SeriesSessionTO seriesSessionTO;

    /** Creates a new instance of InfoController */
    public InfoController() {
    }

    public void executeOphalenInfo(String typeInfoVolgnr) {
        if (!StringUtils.isEmpty(typeInfoVolgnr)) {
            // Ophalen titel
            BsmTypeInfo typeInfo = typeInfoFacade.findByVolgnr(Long.valueOf(typeInfoVolgnr));

            if (seriesSessionTO.isDutch()) {
                infoTitel = typeInfo.getOmschrijving();
            } else {
                infoTitel = typeInfo.getOmschrijvingEn();
            }

            // Ophalen informatie
            if (typeInfoVolgnr != null && !typeInfoVolgnr.equals("")) {
                info = infoFacade.findByTypeInfoAndArchief(Long.valueOf(typeInfoVolgnr), "N");
            } else {
                info = new ArrayList<BsmInfo>();
            }
            filterInfoLijst(info);
        }
    }

    /* Filter Info */
    public void filterInfoLijst(List<BsmInfo> infoLijst) {
        for (BsmInfo info : infoLijst) {
            filterInfo(info);
        }
    }

    public void filterInfo(BsmInfo info) {
        String result = "";

        result = filterString(info.getBericht());
        info.setBericht(result);

        result = filterString(info.getBerichtEn());
        info.setBerichtEn(result);
    }

    public String filterString(String bericht) {
        String result = "";

        /* Plaats hieronder de replaces die je wilt uitvoeren */
        result = StringUtils.replace(bericht, "src=\"/pls/", "src=\"http://homeplate.robur58.com/pls/");

        return result;
    }    
    
    public List<BsmInfo> getHomepageInfo() {
        return homepageInfo;
    }

    public void setHomepageInfo(List<BsmInfo> homepageInfo) {
        this.homepageInfo = homepageInfo;
    }

    public List<BsmInfo> getInfo() {
        return info;
    }

    public void setInfo(List<BsmInfo> info) {
        this.info = info;
    }

    public String getInfoTitel() {
        if (infoTitel != null && infoTitel.indexOf("Info") < 0) {
            return infoTitel + " Info";
        } else {
            return infoTitel;
        }
    }

    public void setInfoTitel(String infoTitel) {
        this.infoTitel = infoTitel;
    }

    public SeriesSessionTO getSeriesSessionTO() {
        return seriesSessionTO;
    }

    public void setSeriesSessionTO(SeriesSessionTO seriesSessionTO) {
        this.seriesSessionTO = seriesSessionTO;
    }
    
}
