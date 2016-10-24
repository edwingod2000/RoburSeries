package com.robur58.series.web.controller;

import com.robur58.series.business.RisSysvarFacadeLocal;
import com.robur58.series.domein.RisSysvar;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ArchiefController {

    @EJB
    RisSysvarFacadeLocal sysvarFacade;

    private int huidigJaar;
    private String oracleServerName;
    
    public ArchiefController() {
        
    }
    
    @PostConstruct
    public void init() {
        String huidigJaarString = ((RisSysvar)sysvarFacade.findByCode("JAAR_SERIES")).getWaarde();
        if (huidigJaarString != null) {
            huidigJaar = Integer.parseInt(huidigJaarString);
        }
        oracleServerName = ((RisSysvar)sysvarFacade.findByCode("ORACLE_SERVER_NAME")).getWaarde();
    }

    public int getHuidigJaar() {
        return huidigJaar;
    }

    public void setHuidigJaar(int huidigJaar) {
        this.huidigJaar = huidigJaar;
    }
    
    public int getHuidigJaarMinusAantal(int aantal) {
        return huidigJaar - aantal;
    }

    public String getOracleServerName() {
        return oracleServerName;
    }

    public void setOracleServerName(String oracleServerName) {
        this.oracleServerName = oracleServerName;
    }
 
    
}
