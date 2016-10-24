    fixMozillaZIndex=true; //Fixes Z-Index problem  with Mozilla browsers but causes odd scrolling problem, toggle to see if it helps
    _menuCloseDelay=500;
    _menuOpenDelay=150;

    with(menuStyle=new mm_style()) {
        bordercolor="#343434";
        borderstyle="solid";
        borderwidth=0;
        fontfamily="Verdana, Tahoma, Arial";
        fontsize="12pt";
        fontstyle="normal";
        fontweight="bold";
        headerbgcolor="#FFFFFF";
        headercolor="#FFFFFF";
        margin=0;
        imagepadding=0;
        itemheight=28;
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
        itemheight=28;
        offbgcolor="#343434";
        offcolor="#FFFFFF";
        onbgcolor="#FFFFFF";
        oncolor="#343434";
        outfilter="Fade(Overlap=1.00)";
        separatorcolor="#FFFFFF";
        separatorsize="1";
        padding=8;
    }

    with(milonic=new menuname("Main Menu")) {
        alwaysvisible=1;
        orientation="horizontal";
        style=menuStyle;
        screenposition="center";
        itemheight=28;
        aI("text=Home;url=javascript:verwerkHeaderMenuKeuze(1)");
        aI("text=Toernooi;showmenu=Toernooi");
        aI("text=School;url=javascript:verwerkHeaderMenuKeuze(16)");
        aI("text=Umpire Clinic;url=javascript:verwerkHeaderMenuKeuze(31)");

        aI("text=Series 2011;showmenu=Series");
        aI("text=Series 2012;showmenu=SeriesNext");

        aI("text=Sponsors;url=javascript:verwerkHeaderMenuKeuze(8)");
        aI("text=Gastenboek;url=javascript:verwerkHeaderMenuKeuze(15)");
        aI("text=Archief;url=javascript:verwerkHeaderMenuKeuze(11)");
    }

    with(milonic=new menuname("Toernooi")) {
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

    with(milonic=new menuname("SeriesPrevious")){
        overflow="scroll";
        style=subMenuStyle;
        aI("text=Teams;url=javascript:verwerkHeaderMenuKeuze(26)");
        aI("text=Wedstrijden;url=javascript:verwerkHeaderMenuKeuze(27)");
        aI("text=Statistieken;url=javascript:verwerkHeaderMenuKeuze(28)");
        aI("text=Stand;url=javascript:verwerkHeaderMenuKeuze(29)");
        aI("text=Hoogtepunten;url=javascript:verwerkHeaderMenuKeuze(30)");
    }

    with(milonic=new menuname("SeriesNext")){
        overflow="scroll";
        style=subMenuStyle;
        aI("text=Datum;url=javascript:verwerkHeaderMenuKeuze(18)");
        aI("text=Inschrijven;url=javascript:verwerkHeaderMenuKeuze(17)");
        aI("text=Onderkomen;url=javascript:verwerkHeaderMenuKeuze(14)");
    }

    drawMenus();
    
  function test() {
    alert("bla");
  }
  function openNewWindow(myUrl) {
    var myWindowName = "FotoImpressie";
    var myWindowOptions = "width=800,height=600";
    window.open(myUrl, myWindowName, myWindowOptions);
  }

  var ImgPath='http://homeplate.robur58.com/Series/Highlights/';


  var ImgAry=["highlights (1).jpg","highlights (2).jpg","highlights (3).jpg","highlights (4).jpg","highlights (5).jpg","highlights (6).jpg","highlights (7).jpg","highlights (8).jpg","highlights (9).jpg","highlights (10).jpg","highlights (11).jpg","highlights (12).jpg","highlights (13).jpg","highlights (14).jpg","highlights (15).jpg","highlights (16).jpg","highlights (17).jpg","highlights (18).jpg","highlights (19).jpg","highlights (20).jpg","highlights (21).jpg","highlights (22).jpg","highlights (23).jpg","highlights (24).jpg","highlights (25).jpg","highlights (26).jpg","highlights (27).jpg","highlights (28).jpg","highlights (29).jpg","highlights (30).jpg","highlights (31).jpg","highlights (32).jpg","highlights (33).jpg","highlights (34).jpg","highlights (35).jpg","highlights (36).jpg","highlights (37).jpg","highlights (38).jpg","highlights (39).jpg","highlights (40).jpg","highlights (41).jpg","highlights (42).jpg","highlights (43).jpg","highlights (44).jpg","highlights (45).jpg","highlights (46).jpg","highlights (47).jpg","highlights (48).jpg","highlights (49).jpg","highlights (50).jpg","highlights (51).jpg","highlights (52).jpg","highlights (53).jpg","highlights (54).jpg","highlights (55).jpg","highlights (56).jpg","highlights (57).jpg","highlights (58).jpg","highlights (59).jpg","highlights (60).jpg","highlights (61).jpg","highlights (62).jpg","highlights (63).jpg","highlights (64).jpg","highlights (65).jpg","highlights (66).jpg","highlights (67).jpg","highlights (68).jpg","highlights (69).jpg","highlights (70).jpg","highlights (71).jpg","highlights (72).jpg","highlights (73).jpg","highlights (74).jpg","highlights (75).jpg","highlights (76).jpg","highlights (77).jpg","highlights (78).jpg","highlights (79).jpg","highlights (80).jpg","highlights (81).jpg","highlights (82).jpg","highlights (83).jpg","highlights (84).jpg","highlights (85).jpg","highlights (86).jpg","highlights (87).jpg","highlights (88).jpg","highlights (89).jpg","highlights (90).jpg","highlights (91).jpg","highlights (92).jpg","highlights (93).jpg","highlights (94).jpg","highlights (95).jpg","highlights (96).jpg","highlights (97).jpg","highlights (98).jpg","highlights (99).jpg",];
  var NameAry=["highlights (1).jpg","highlights (2).jpg","highlights (3).jpg","highlights (4).jpg","highlights (5).jpg","highlights (6).jpg","highlights (7).jpg","highlights (8).jpg","highlights (9).jpg","highlights (10).jpg","highlights (11).jpg","highlights (12).jpg","highlights (13).jpg","highlights (14).jpg","highlights (15).jpg","highlights (16).jpg","highlights (17).jpg","highlights (18).jpg","highlights (19).jpg","highlights (20).jpg","highlights (21).jpg","highlights (22).jpg","highlights (23).jpg","highlights (24).jpg","highlights (25).jpg","highlights (26).jpg","highlights (27).jpg","highlights (28).jpg","highlights (29).jpg","highlights (30).jpg","highlights (31).jpg","highlights (32).jpg","highlights (33).jpg","highlights (34).jpg","highlights (35).jpg","highlights (36).jpg","highlights (37).jpg","highlights (38).jpg","highlights (39).jpg","highlights (40).jpg","highlights (41).jpg","highlights (42).jpg","highlights (43).jpg","highlights (44).jpg","highlights (45).jpg","highlights (46).jpg","highlights (47).jpg","highlights (48).jpg","highlights (49).jpg","highlights (50).jpg","highlights (51).jpg","highlights (52).jpg","highlights (53).jpg","highlights (54).jpg","highlights (55).jpg","highlights (56).jpg","highlights (57).jpg","highlights (58).jpg","highlights (59).jpg","highlights (60).jpg","highlights (61).jpg","highlights (62).jpg","highlights (63).jpg","highlights (64).jpg","highlights (65).jpg","highlights (66).jpg","highlights (67).jpg","highlights (68).jpg","highlights (69).jpg","highlights (70).jpg","highlights (71).jpg","highlights (72).jpg","highlights (73).jpg","highlights (74).jpg","highlights (75).jpg","highlights (76).jpg","highlights (77).jpg","highlights (78).jpg","highlights (79).jpg","highlights (80).jpg","highlights (81).jpg","highlights (82).jpg","highlights (83).jpg","highlights (84).jpg","highlights (85).jpg","highlights (86).jpg","highlights (87).jpg","highlights (88).jpg","highlights (89).jpg","highlights (90).jpg","highlights (91).jpg","highlights (92).jpg","highlights (93).jpg","highlights (94).jpg","highlights (95).jpg","highlights (96).jpg","highlights (97).jpg","highlights (98).jpg","highlights (99).jpg",];
  var SRCAry=[]

  for (var zxc0=0;zxc0<ImgAry.length;zxc0++){
    SRCAry[zxc0]=new Image();
    SRCAry[zxc0].src=ImgPath+ImgAry[zxc0];
    SRCAry[zxc0].name=NameAry[zxc0];
  }

  var Cnt=0;

  function initializeTimer() {
    newImage = SRCAry[Cnt].src;
    newOnClick = function() { openNewWindow( "" + SRCAry[Cnt].name ); };
    document.getElementById('impressieFoto').src = newImage;

    timerID = setInterval('chgImage()',5000) // change the image every 5 seconds
  }

  function chgImage() {
    Cnt=++Cnt%ImgAry.length; // this just cycles 0,1,2,3,4,5,0,1,2,3,4,5,0...............
    newImage = SRCAry[Cnt].src;
    newOnClick = function() { openNewWindow( "" + SRCAry[Cnt].name ); };
    document.getElementById('impressieFoto').src = newImage;
  }
  function changeMenuImageOn(veldNaam, type) {
    var veld = document.getElementById(veldNaam);
    source = "img/new/" + veldNaam + "_on." + type;
    veld.src = source;
  }
  function changeMenuImageOff(veldNaam, type) {
    var veld = document.getElementById(veldNaam);
    source = "img/new/" + veldNaam +"."+type;
    veld.src = source;
  }
  function verwerkLeftMenuKeuze(menuitem) {
    document.startpaginaForm.currentMenu.value=menuitem;
    document.startpaginaForm.submit();
  }    