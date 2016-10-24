package com.robur58.series.web.navigatie;

import java.util.List;

public class MenuItem {

    private String link;
    private String omschrijving;
    private List<MenuItem> subMenuItems;

    public MenuItem() {
        
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public List<MenuItem> getSubMenuItems() {
        return subMenuItems;
    }

    public void setSubMenuItems(List<MenuItem> subMenuItems) {
        this.subMenuItems = subMenuItems;
    }

}
