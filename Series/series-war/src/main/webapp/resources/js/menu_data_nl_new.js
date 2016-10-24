fixMozillaZIndex=true; //Fixes Z-Index problem  with Mozilla browsers but causes odd scrolling problem, toggle to see if it helps
_menuCloseDelay=500;
_menuOpenDelay=150;
_subOffsetTop=2;
_subOffsetLeft=-2;

with(menuStyle=new mm_style()){
bordercolor="#343434";
borderstyle="solid";
borderwidth=0;
fontfamily="Verdana, Tahoma, Arial";
fontsize="14pt";
fontstyle="normal";
fontweight="bold";
headerbgcolor="#FFFFFF";
headercolor="#FFFFFF";
margin=0;
imagepadding=0;
itemheight=34;
offbgcolor="#343434";
offcolor="#FFFFFF";
onbgcolor="#FFFFFF";
oncolor="#343434";
outfilter="Fade(Overlap=1.00)";
separatorcolor="#666666";
separatorsize="5";
padding=5;
}

with(subMenuStyle=new mm_style()){
bordercolor="#343434";
borderstyle="solid";
borderwidth=0;
fontfamily="Verdana, Tahoma, Arial";
fontsize="10pt";
fontstyle="normal";
fontweight="bold";
headerbgcolor="#FFFFFF";
headercolor="#FFFFFF";
margin=0;
imagepadding=0;
itemheight=34;
offbgcolor="#343434";
offcolor="#FFFFFF";
onbgcolor="#FFFFFF";
oncolor="#343434";
outfilter="Fade(Overlap=1.00)";
separatorcolor="#FFFFFF";
separatorsize="1";
padding=8;
}

with(milonic=new menuname("Main Menu")){
alwaysvisible=1;
top=20;
left=400;
orientation="horizontal";
style=menuStyle;
position="relative";
itemheight=32;
aI("text=Home;url=javascript:verwerkHeaderMenuKeuze(1)");
aI("text=Toernooi;showmenu=Toernooi");
aI("text=School;url=javascript:verwerkHeaderMenuKeuze(16)");
aI("text=Series;showmenu=Series");
aI("text=Series 2010;showmenu=SeriesNext");
aI("text=Sponsors;url=javascript:verwerkHeaderMenuKeuze(8)");
aI("text=Gastenboek;url=javascript:verwerkHeaderMenuKeuze(15)");
aI("text=Archief;url=javascript:verwerkHeaderMenuKeuze(11)");
}

with(milonic=new menuname("Toernooi")){
overflow="scroll";
style=subMenuStyle;
aI("text=Organisatie;url=javascript:verwerkHeaderMenuKeuze(13)");
aI("text=Over de Series;url=javascript:verwerkHeaderMenuKeuze(19)");
aI("text=Programma;url=javascript:verwerkHeaderMenuKeuze(20)");
aI("text=Regels;url=javascript:verwerkHeaderMenuKeuze(12)");
aI("text=Onderkomen;url=javascript:verwerkHeaderMenuKeuze(14)");
aI("text=Komende jaren;url=javascript:verwerkHeaderMenuKeuze(18)");
aI("text=Over Robur '58;url=javascript:verwerkHeaderMenuKeuze(21)");
aI("text=Over het speelveld;url=javascript:verwerkHeaderMenuKeuze(22)");
aI("text=Souveniers;url=javascript:verwerkHeaderMenuKeuze(23)");
aI("text=Umpires;url=javascript:verwerkHeaderMenuKeuze(24)");
aI("text=Testimonials;url=javascript:verwerkHeaderMenuKeuze(25)");
}

with(milonic=new menuname("Series")){
overflow="scroll";
style=subMenuStyle;
aI("text=Teams;url=javascript:verwerkHeaderMenuKeuze(2)");
aI("text=Wedstrijden;url=javascript:verwerkHeaderMenuKeuze(3)");
aI("text=Statistieken;url=javascript:verwerkHeaderMenuKeuze(4)");
aI("text=Stand;url=javascript:verwerkHeaderMenuKeuze(5)");
aI("text=Hoogtepunten;url=javascript:verwerkHeaderMenuKeuze(6)");
}

with(milonic=new menuname("SeriesNext")){
overflow="scroll";
style=subMenuStyle;
aI("text=Datum;url=javascript:verwerkHeaderMenuKeuze(18)");
aI("text=Inschrijven;url=javascript:verwerkHeaderMenuKeuze(17)");
aI("text=Onderkomen;url=javascript:verwerkHeaderMenuKeuze(14)");
}
drawMenus();
