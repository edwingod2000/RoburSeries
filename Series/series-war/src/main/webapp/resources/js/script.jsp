<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-template.tld" prefix="template" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<script language="JavaScript" type="text/javascript">  // test script to rotate the cabinet images on the main page

  function openNewWindow(myUrl) {
    var myWindowName = "FotoImpressie";
    var myWindowOptions = "width=800,height=600";
    window.open(myUrl, myWindowName, myWindowOptions);
  }

  var ImgPath='img/new/';

<%
  StringBuffer impressieFotos = new StringBuffer();
  StringBuffer impressieFotoNames = new StringBuffer();
  for (int i=0; i < 11; i++) {
    impressieFotos.append("\"foto" + i + ".gif\"");
    if (i != 11) {
      impressieFotos.append(",");
      impressieFotoNames.append(",");
    }
  }
%>
  var ImgAry=[<%=impressieFotos.toString()%>];
  var NameAry=[<%=impressieFotos.toString()%>];
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
</script>