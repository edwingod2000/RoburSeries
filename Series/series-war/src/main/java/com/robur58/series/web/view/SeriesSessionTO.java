package com.robur58.series.web.view;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "seriesSessionTO")
@SessionScoped
public class SeriesSessionTO implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String SERIESSESSIONTO = "seriesSessionTO";
  private List menuItems;
  private List highlightItems;
  private List calendarItems;
  private int currentMenu;
  private String language = "NL";
  private String typeTeamList;
  private boolean showContextHighlights;
  private boolean showContextCalendar;
  private boolean showContextTeamList;
  private boolean showContextSpelersInfo;
  private boolean showContextWedstrijdenActueel;
  private boolean showContextSponsors;
  private boolean showContextWeer;
  private boolean showContextGoogleNews;
  private boolean showKnbsbNews;
  private List beheerModules;
  private List sponsorLogos;
  private Map googleNews;
  private List knbsbNews;
  private int knbsbNewsSize;
  private int typeInfo;

  public SeriesSessionTO() {
  }

  public String switchLanguage() {
      if (isDutch()) {
          language = "EN";
      } else {
          language = "NL";
      }
      
      return "/pages/homePage.xhtml";
  }
  
  public boolean isDutch() {
      if (language.equals("NL")) {
          return true;
      } else {
          return false;
      }
  }
  
  // Getters and Setters
  public List getSponsorLogos() {
    return sponsorLogos;
  }

  public void setSponsorLogos(List sponsorLogos) {
    this.sponsorLogos = sponsorLogos;
  }

  public List getBeheerModules() {
    return beheerModules;
  }

  public void setBeheerModules(List beheerModules) {
    this.beheerModules = beheerModules;
  }

  public boolean getShowContextSpelersInfo() {
    return showContextSpelersInfo;
  }

  public void setShowContextSpelersInfo(boolean showContextSpelersInfo) {
    this.showContextSpelersInfo = showContextSpelersInfo;
  }

  public boolean getShowContextTeamList() {
    return showContextTeamList;
  }

  public void setShowContextTeamList(boolean showContextTeamList) {
    this.showContextTeamList = showContextTeamList;
  }

  public int getCurrentMenu() {
    return currentMenu;
  }

  public void setCurrentMenu(int currentMenu) {
    this.currentMenu = currentMenu;
  }

  public List getHighlightItems() {
    return highlightItems;
  }

  public void setHighlightItems(List highlightItems) {
    this.highlightItems = highlightItems;
  }

  public List getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List menuItems) {
    this.menuItems = menuItems;
  }

  public boolean getShowContextHighlights() {
    return showContextHighlights;
  }

  public void setShowContextHighlights(boolean showContextHighlights) {
    this.showContextHighlights = showContextHighlights;
  }

  public List getCalendarItems() {
    return calendarItems;
  }

  public void setCalendarItems(List calendarItems) {
    this.calendarItems = calendarItems;
  }

  public Map getGoogleNews() {
    return googleNews;
  }

  public void setGoogleNews(Map googleNews) {
    this.googleNews = googleNews;
  }

  public boolean getShowContextCalendar() {
    return showContextCalendar;
  }

  public void setShowContextCalendar(boolean showCalendar) {
    this.showContextCalendar = showCalendar;
  }

  public boolean getShowContextWedstrijdenActueel() {
    return showContextWedstrijdenActueel;
  }

  public void setShowContextWedstrijdenActueel(
    boolean showContextWedstrijdenActueel) {
    this.showContextWedstrijdenActueel = showContextWedstrijdenActueel;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getTypeTeamList() {
    return typeTeamList;
  }

  public void setTypeTeamList(String typeTeamList) {
    this.typeTeamList = typeTeamList;
  }

  public boolean getShowContextSponsors() {
    return showContextSponsors;
  }

  public void setShowContextSponsors(boolean showContextSponsors) {
    this.showContextSponsors = showContextSponsors;
  }

  public boolean getShowContextWeer() {
    return showContextWeer;
  }

  public void setShowContextWeer(boolean showContextWeer) {
    this.showContextWeer = showContextWeer;
  }

  public boolean getShowContextGoogleNews() {
    return showContextGoogleNews;
  }

  public void setShowContextGoogleNews(boolean showContextGoogleNews) {
    this.showContextGoogleNews = showContextGoogleNews;
  }

  public List getKnbsbNews() {
    return knbsbNews;
  }

  public void setKnbsbNews(List knbsbNews) {
    this.knbsbNews = knbsbNews;
  }

  public boolean getShowKnbsbNews() {
    return showKnbsbNews;
  }

  public void setShowKnbsbNews(boolean showKnbsbNews) {
    this.showKnbsbNews = showKnbsbNews;
  }

  public int getKnbsbNewsSize() {
    return knbsbNewsSize;
  }

  public void setKnbsbNewsSize(int knbsbNewsSize) {
    this.knbsbNewsSize = knbsbNewsSize;
  }

  public int getTypeInfo() {
    return typeInfo;
  }

  public void setTypeInfo(int typeInfo) {
    this.typeInfo = typeInfo;
  }

}
