package com.robur58.series.web.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="menuController")
@SessionScoped
public class MenuController {
    
    private String currentMenu;
    
    public MenuController() {
        
    }

    public String getCurrentMenu() {
        return currentMenu;
    }

    public void setCurrentMenu(String currentMenu) {
        this.currentMenu = currentMenu;
    }
    
}
