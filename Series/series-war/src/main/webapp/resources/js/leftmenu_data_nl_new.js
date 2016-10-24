fixMozillaZIndex=true; //Fixes Z-Index problem  with Mozilla browsers but causes odd scrolling problem, toggle to see if it helps
_menuCloseDelay=500;
_menuOpenDelay=150;
_subOffsetTop=2;
_subOffsetLeft=-2;

with(leftmenuStyle=new mm_style()){
bordercolor="#343434";
borderstyle="solid";
borderwidth=0;
fontfamily="Verdana, Tahoma, Arial";
fontsize="10pt";
fontstyle="normal";
fontweight="normal";
headerbgcolor="#FFFFFF";
headercolor="#FFFFFF";
margin=0;
imagepadding=0;
itemheight=58;
offbgcolor="#343434";
offcolor="#FFFFFF";
onbgcolor="#FFFFFF";
oncolor="#FFFFFF";
outfilter="Fade(Overlap=1.00)";
separatorcolor="#666666";
separatorsize="0";
padding=0;
}

with(milonic=new menuname("Left Menu")){
alwaysvisible=1;
top=400;
left=400;
orientation="vertical";
style=leftmenuStyle;
position="relative";
itemheight=58;
aI("image=http://localhost:8080/SeriesWeb/img/new/topmenu_divider.jpg;overbgimage=/img/new/menu_divider.jpg;url=");
aI("image=http://localhost:8080/SeriesWeb/img/new/menu_inschrijven.jpg;overbgimage=/img/new/menu_inschrijven.jpg;url=javascript:verwerkHeaderMenuKeuze(1)");
aI("image=http://localhost:8080/SeriesWeb/img/new/topmenu_divider.jpg;overbgimage=/img/new/menu_divider.jpg;url=");
aI("image=http://localhost:8080/SeriesWeb/img/new/button_toernooi.jpg;overbgimage=/img/new/button_home.jpg;showmenu=Toernooi;");
aI("image=http://localhost:8080/SeriesWeb/img/new/topmenu_divider.jpg;overbgimage=/img/new/menu_divider.jpg;url=");
aI("image=http://localhost:8080/SeriesWeb/img/new/button_series2008.jpg;overbgimage=/img/new/button_home.jpg;url=javascript:verwerkHeaderMenuKeuze(1)");
aI("image=http://localhost:8080/SeriesWeb/img/new/topmenu_divider.jpg;overbgimage=/img/new/menu_divider.jpg;url=");
}

drawMenus();
