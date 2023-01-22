
<%@ page language="java"%>
<%@ page language="java" import="java.util.*,com.nit.vehicle.*"%>
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
  <pre>                              <font size="4"><strong>New Models</strong></font></pre>
  
  <pre>
  <table width="51%" border="1" cellspacing="1" cellpadding="1" align="center">
  <%Collection cf=(Collection)request.getSession().getAttribute("cform");
		System.out.println("path "+cf);
		Iterator it=cf.iterator();
		while(it.hasNext())
		{
		ViewmodelsuccessForm vf=(ViewmodelsuccessForm)it.next();
		%>
   <center> <TABLE>
    <tr>
    <td>Model Image</td><td><IMG src="<%=vf.getImg()%>" width="120" height="120"/></td></tr>
    <tr><td>Vehicletype</td><td><INPUT type=text value="<%=vf.getVtype()%>" readonly="true"/> </td></tr>
    <tr><td>VehicleModel</td><td><INPUT type=text value="<%=vf.getVmodel()%>" readonly="true"/> </td></tr>
    <tr><td>Color</td><td><INPUT type=text value="<%=vf.getVcolor()%>" readonly="true"/> </td></tr>
    <tr><td>EngineCapacity</td><td><INPUT type=text value="<%=vf.getEngine()%>" readonly="true"/> </td></tr>
    <tr><td>EngineHP</td><td><INPUT type=text value="<%=vf.getEnginehp()%>" readonly="true"/> </td></tr>
    <tr><td>Engine Type</td><td><INPUT type=text value="<%=vf.getEngtype()%>" readonly="true"/> </td></tr>
    <tr><td>Gurranty On Spares</td><td><INPUT type=text value="<%=vf.getGurranty()%>" readonly="true"/> </td></tr>
    <tr><td>Makers Classification</td><td><INPUT type=text value="<%=vf.getM_cls()%>" readonly="true"/> </td></tr>
<tr><td>Milage</td><td><INPUT type=text value="<%=vf.getMilage()%>"readonly="true" /> </td></tr>       
    
    <%
    }
		%>
		</tr></center>
</table></pre>


					
				</TD>
			</TR>
			<TR>
				<TD COLSPAN="2" HEIGHT="5%" BGCOLOR="wheat" NOWRAP>
					<jsp:include page="vehiclefooter.jsp"/>
				</TD>
			</TR>
		</TABLE>
	</BODY>
</html:html>

