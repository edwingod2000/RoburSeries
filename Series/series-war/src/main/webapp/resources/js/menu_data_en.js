fixMozillaZIndex=true; //Fixes Z-Index problem  with Mozilla browsers but causes odd scrolling problem, toggle to see if it helps
_menuCloseDelay=500;
_menuOpenDelay=150;
_subOffsetTop=2;
_subOffsetLeft=-2;

with(submenuStyle=new mm_style()){
styleid=1;
bordercolor="#FFFFFF";
borderstyle="solid";
borderwidth=1;
fontfamily="Verdana, Tahoma, Arial";
fontsize="8pt";
fontstyle="normal";
fontweight="normal";
headercolor="#FFFFFF";
imagepadding=8;
offbgcolor="#CC0000";
offcolor="#FFFFFF";
onbgcolor="#FFFFFF";
oncolor="#CC0000";
outfilter="Blinds( Bands=1,direction=up, duration=0.3)";
overfilter="Blinds( Bands=1,direction=down, duration=0.3)";
padding=4;
pagecolor="#FFFFFF";
separatorcolor="#FFFFFF";
separatorsize=2;
subimagepadding=8;
}

with(menuStyle=new mm_style()){
bordercolor="#CC0000";
borderstyle="solid";
borderwidth=1;
fontfamily="Verdana, Tahoma, Arial";
fontsize="10pt";
fontstyle="normal";
fontweight="normal";
headerbgcolor="#CC0000";
headercolor="#FFFFFF";
margin=6;
imagepadding=6;
offbgcolor="#CC0000";
offcolor="#FFFFFF";
onbgcolor="#666666";
oncolor="#FFFFFF";
outfilter="Fade(Overlap=1.00)";
separatorcolor="#666666";
separatorsize="0";
padding=8;
}

with(milonic=new menuname("Main Menu")){
alwaysvisible=1;
left=170;
orientation="horizontal";
style=menuStyle;
position="relative";
top=190;
aI("text=Home;url=javascript:verwerkHeaderMenuKeuze(1)");
aI("showmenu=Toernooi;text=Tournament;");
aI("text=Teams;url=javascript:verwerkHeaderMenuKeuze(2)");
aI("text=Schedule;url=javascript:verwerkHeaderMenuKeuze(3)");
aI("text=Stats;url=javascript:verwerkHeaderMenuKeuze(4)");
aI("text=Ranking;url=javascript:verwerkHeaderMenuKeuze(5)");
aI("text=Highlights;url=javascript:verwerkHeaderMenuKeuze(6)");
aI("text=Volunteers Info;url=javascript:verwerkHeaderMenuKeuze(7)");
aI("text=Sponsors;url=javascript:verwerkHeaderMenuKeuze(8)");
aI("text=Archive;url=javascript:verwerkHeaderMenuKeuze(11)");
}

with(milonic=new menuname("Toernooi")){
overflow="scroll";
style=menuStyle;
aI("text=Organisation;url=javascript:verwerkHeaderMenuKeuze(13)");
aI("text=Rules;url=javascript:verwerkHeaderMenuKeuze(12)");
aI("text=Accomodation;url=javascript:verwerkHeaderMenuKeuze(14)");
}

drawMenus();
