package com.robur58.series.web.controller;

import com.robur58.series.business.RisHoogtepuntenFacadeLocal;
import com.robur58.series.domein.RisHoogtepunten;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.apache.commons.lang.StringUtils;

@ManagedBean
@SessionScoped
public class HoogtepuntenController {
    
    @EJB
    RisHoogtepuntenFacadeLocal hoogtepuntenFacade;
    
    public HoogtepuntenController() {
        
    }
    
    public List<RisHoogtepunten> ophalenHoogtepunten(String jaar) {
        if (!StringUtils.isEmpty(jaar)) {
            return hoogtepuntenFacade.findByJaar(jaar);
        } else {
            return new ArrayList<RisHoogtepunten>();
        }
    }
    
    public String getHoogtepuntUrl(String volgnr) {
        RisHoogtepunten hoogtepunt = hoogtepuntenFacade.findByVolgnr(volgnr);
        StringBuilder result = new StringBuilder();
        if (hoogtepunt != null) {
            if (hoogtepunt.getIntern().equals("J")) {
               result.append("http://homeplate.robur58.com");
               result.append("/ris-doc/");
               result.append(hoogtepunt.getJaar());
               result.append("/highlights/");
               result.append(hoogtepunt.getDirectory());
               result.append("/");
               result.append(hoogtepunt.getHtmlpagina());
            } else {
               result.append(hoogtepunt.getHtmlpagina());
            }
        }
        
        return result.toString();
    }
    
}
