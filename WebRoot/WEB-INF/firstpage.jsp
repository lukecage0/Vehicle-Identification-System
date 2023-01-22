<%@ page language="java"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body>
<table width="75%" border="1" cellspacing="2" cellpadding="2">
  <tr>
  
    <td><jsp:include  page="/head.jsp"/>
    
    </td>
    
  </tr>
  <tr>
    <td>
    <center>
	<body  background="C:\Program Files\Common Files\Microsoft Shared\Stationery\Network Blitz Bkgrd.gif"/><center>
		<center><h2>BRANCH FORM</b></h2></center>
		<html:form action="/gotoaction" >
		<b>	BID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          <html:text property="bid"/><html:errors property="bid"/><br/>
			BR NAME &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     <html:text property="bname"/><html:errors property="bname"/><br/>
			BR LOCATION  <html:text property="bloc"/><html:errors property="bloc"/><br/>
			BR ADDRESS  &nbsp;&nbsp; <html:text property="baddress"/><html:errors property="baddress"/><br/>
			PIN NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;       <html:text property="pin"/><html:errors property="pin"/><br/>
			OWNERNAME  <html:text property="oname"/><html:errors property="oname"/><br/>
			CONT NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      <html:text property="contno"/><html:errors property="contno"/><br/>
			
            <html:submit/>         	</b>
		</html:form>
		</tr>
			</center>
	</body>
    
    </td>
    
  </tr>
  <tr>
    <td><jsp:include page="/foot.jsp"/>
   
    </td>
    
  </tr>
</table>
</body>
</html>
