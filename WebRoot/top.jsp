<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>Top.html</title>
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="this is my page">
<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
</head>

<body>
<table align="center" background="image/form_banner.jpg" border="0"  cellspacing="0"
	width="100%">
	<tr background="image/form_banner.jpg">
		<td width="11%" align="left"><A href="AdminHome.jsp">Home</a></td>

		<td width="11%" align="left"><A href="Profile.jsp">Profile</a></td>

		<td width="11%" align="left"><A href="Contacts.jsp">Contacts</a></td>

		<td width="12%" align="left"><A href="MessagesMenu.jsp">Messages</a></td>

		<td width="11%" align="left"><A href="Documents.jsp">Documets</a></td>
	</tr>
</table>
</body>
</html>///////////////

<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  ><center>
		<center><h3>VEHICLE REGISTRATION DETAILS</b></h3></center>
		<html:form action="/regdetails">
		<b>	VEHICLE NO&nbsp;&nbsp;&nbsp;&nbsp;  <html:text property="vno"/><html:errors property="vno"/><br/>
		
                   ENGINE NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="eno"/>
		<br>
	CHASIS NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="chasisno"/><html:errors property="chasisno"/><br/>
			VEHICLE TYPE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="vtype"/><html:errors property="vtype"/><br/>
		 VEHICLE MODEL<html:text property="vmodel"/><html:errors property="vmodel"/><br/>
MAKERS CLASSIFICATION<html:text property="makerclassification"/><html:errors property="makerclassification"/><br/>
			PURCHASE DATE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <html:text property="pdate"/><html:errors property="pdate"/><br/>
			FUEL&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="fuel"/><br>
OWNER NAME&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="oname"/><html:errors property="oname"/><br/>
			ADDRESS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="oaddress"/><html:errors property="oaddress"/><br/>
			ADDRESS PROOF&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="oaddressproof"/><html:errors property="oaddressproof"/><br/>
			CONTNO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="ocontno"/><html:errors property="ocontno"/><br/>
		    	EMAILID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="emailid"/><html:errors property="emailid"/><br/>
		    	PIN NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="pinno"/><html:errors property="pinno"/><br/>
			<br> <br>
            <html:submit/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="adminhomepage.jsp">home</a><br>        	</b>
		</html:form>
		
			</center>
	</body>
</html>
//////////////

<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 

	
	
	<center>
	<body  ><center>
		<center><h3>VEHICLE TECHNICAL DETAILS</b></h3></center>
		<html:form action="/techdetails">
		<b> VEHICLE NO&nbsp;&nbsp;&nbsp;&nbsp;  <html:text property="vno"/><html:errors property="vno"/><br/>
		 VEHICLE TYPE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="vtype"/><html:errors property="vtype"/><br/>
        ENGINE NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="eno"/>
		<br>
	
			
		 VEHICLE MODEL<html:text property="vmodel"/><html:errors property="vmodel"/><br/>
 BODY TYPE<html:text property="bodytype"/><html:errors property="bodytype"/><br/>
			WHEELS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <html:text property="wheels"/><html:errors property="wheels"/><br/>
			ENGINECAPACITY&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="enginecapacity"/><br>

	MILAGE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="milage"/><html:errors property="milage"/><br/>
		    
		    	UNLADEN WEIGHT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="unladenweight"/><html:errors property="unladenweight"/><br/>
			<br> <br>
            <html:submit/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="adminhomepage.jsp">home</a><br>        	</b>
		</html:form>
		
			</center>
	</body>
/////////////////////////////////////////////////////////
View Model Success
 
<%@ page language="java" import="java.util.*,com.nit.vehicle.*"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for viewmodelsuccessForm form</title>
	</head>
	<body>
		<%Collection cf=(Collection)request.getSession().getAttribute("cform");
		System.out.println("path "+cf);
		Iterator it=cf.iterator();
		while(it.hasNext())
		{
		ViewmodelsuccessForm vf=(ViewmodelsuccessForm)it.next();
		%>
    <TABLE>
    <tr>
    <td>Model</td><td><IMG src="<%=vf.getImg()%>" width="100" height="100"/></td></tr>
    <tr><td>vtype</td><td><INPUT type=text value="<%=vf.getVtype()%>" /> </td></tr>
    <tr><td>VModel</td><td><INPUT type=text value="<%=vf.getVmodel()%>" /> </td></tr>
    <tr><td>Vcolor</td><td><INPUT type=text value="<%=vf.getVcolor()%>" /> </td></tr>
    <tr><td>EngineCapacity</td><td><INPUT type=text value="<%=vf.getEngine()%>" /> </td></tr>
    <tr><td>EngineHP</td><td><INPUT type=text value="<%=vf.getEnginehp()%>" /> </td></tr>
    <tr><td>Engine Type</td><td><INPUT type=text value="<%=vf.getEngtype()%>" /> </td></tr>
    <tr><td>Gurranty</td><td><INPUT type=text value="<%=vf.getGurranty()%>" /> </td></tr>
    <tr><td>M_CLASSIFICATION</td><td><INPUT type=text value="<%=vf.getM_cls()%>" /> </td></tr>
<tr><td>MILAGE</td><td><INPUT type=text value="<%=vf.getMilage()%>" /> </td></tr>       
    </TABLE>
    <%
    }
		%>
	</body>
</html>////////////

<%@ page language="java"%>
<%@ page language="java" import="java.util.*,com.nit.vehicle.*" %>
<%@ page import="java.util.Iterator" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    
    <title>Home.jsp</title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
  
</head>    
  
  
 <BODY>
 
		<TABLE BORDER="0" WIDTH="100%" HEIGHT="100%">
			<TR>
				<TD COLSPAN="2" BGCOLOR="wheat" NOWRAP>
					<jsp:include page="vehicleheader.jsp"/>
				</TD>
			</TR>
			<TR>
				<TD WIDTH="25%" BGCOLOR="#CBB9F9" NOWRAP>
					<jsp:include page="adminstaffmenu.jsp"/>
				</TD>
				
				<TD WIDTH="82%" HEIGHT="81%" BGCOLOR="#cccfc" NOWRAP><!--#E4ECF6-->
					
					<html:errors/>
  <pre><font size="4"><strong><center>Choose Model</cenetr></strong></font></pre>
  
  
  <table width="51%" border="1" cellspacing="1" cellpadding="1" align="center">
  
  <html:form action="viewmodelsuccess.do">
<pre>
 <SELECT name="mname">
	Model  Name
     <%
	  Collection c=(Collection) request.getSession().getAttribute("modelname");
	  Iterator it=c.iterator();
	  while(it.hasNext())
	  {
	  ViewmodelForm vf=(ViewmodelForm)it.next();
	  System.out.println(vf.getModelname()+"with in the jsp");
	%>
	 <option value="<%=vf.getModelname()%>"><%=vf.getModelname()%></option><br/>
	<%
	}
	%>	
		<html:submit/></pre>
		</html:form>
		</SELECT></TD>
			</tr>
</table>


				
				
			</TR>
			<TR>
				<TD COLSPAN="2" HEIGHT="5%" BGCOLOR="wheat" NOWRAP>
					<jsp:include page="vehiclefooter.jsp"/>
				</TD>
			</TR>
		</TABLE>
	</BODY>
</html:html>
//////////////


