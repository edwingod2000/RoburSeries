package com.robur58.series.web.navigatie;

import java.util.List;
import java.lang.IllegalArgumentException;

public class Menu {

    public static final String ORIENTATION_HORIZONTAL = "h";
    public static final String ORIENTATION_VERTICAL = "v";
    
    private List<MenuItem> menuItems;
    private String orientation = ORIENTATION_HORIZONTAL;
    private String menuId;
    
    public Menu(String menuId) {
        this.menuId = menuId;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    
    public String getInitialisatie() {
        StringBuilder initString = new StringBuilder();
        initString.append("$(document).ready(function(){");
        initString.append("    ddsmoothmenu.init({");
        initString.append("    mainmenuid: \"").append(getMenuId()).append("\", //Menu DIV id");
        initString.append("    rightImage: 'img/right.gif',");
        initString.append("    orientation: '").append( getOrientation()).append("', //Horizontal or vertical menu: Set to \"h\" or \"v\"");
        initString.append("    classname: 'ddsmoothmenu', //class added to menu's outer DIV");
        initString.append("    //customtheme: [\"#804000\", \"#482400\"],");
        initString.append("    contentsource: \"markup\" //\"markup\" or [\"container_id\", \"path_to_menu_file\"]");
        initString.append("  })");            
        initString.append("});");
                    
        return initString.toString();
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) throws IllegalArgumentException {
        if (!orientation.equals(ORIENTATION_HORIZONTAL) && !orientation.equals(ORIENTATION_VERTICAL)) {
            throw new IllegalArgumentException("Waarde van orientation is niet correct. Gebruik Menu.ORIENTATION_HORIZONTAL of Menu.ORIENTATION_VERTICAL.");
        }
        this.orientation = orientation;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    
}
