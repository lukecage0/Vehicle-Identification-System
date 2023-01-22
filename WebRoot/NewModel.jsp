
<%@ page language="java"%>

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
 
		<TABLE BORDER="0" WIDTH="100%" HEIGHT="90%">
			<TR>
				<TD COLSPAN="2" BGCOLOR="wheat" NOWRAP>
					<jsp:include page="vehicleheader.jsp"/>
				</TD>
			</TR>
			<TR>
				<TD WIDTH="25%" BGCOLOR="#CBB9F9" NOWRAP>
					<jsp:include page="adminmenu.jsp"/>
				</TD>
				
				<TD WIDTH="82%" HEIGHT="81%" BGCOLOR="#cccfc" NOWRAP><!--#E4ECF6-->
					<html:form action="/gotonewmodel">
					<html:errors/>
<pre>
<font size="4"><strong><center>NewModel</center></strong></font>
<table width="51%" border="0" cellspacing="1" cellpadding="1" align="center">
<tr><td width="45%"><label>VehicleImage</label>&nbsp;</td>
      <td width="55%"><input type="file" name="img" property="img"/></td></tr>

  <tr><td width="45%"><label>VehicleType</label>&nbsp;</td>
      <td width="55%"><html:select property="vtype">
      <html:option value="2-wheeler"/>
      <html:option value="4-wheeler"/></html:select>
      </td></tr>
  <tr><td><label>VehicleColor</label>&nbsp;</td>
       <td><html:text property="vcolor"/></td></tr>
  <tr><td><label>VehicleModel</label>&nbsp;</td>
       <td><html:text property="vmodel"/></td></tr>
  <tr><td><label>MakersClassification</label>&nbsp;</td>
       <td><html:text property="makersclassification"/></td></tr>
  <tr><td><label>EngineCapacity</label>&nbsp;</td>
       <td><html:text property="enginecapacity"/></td></tr>
  <tr><td><label>Milage</label>&nbsp;</td>
       <td><html:text property="milage"/></td></tr>
  <tr><td><label>EngineHorsepower</label>&nbsp;</td>
       <td><html:text property="enginehp"/></td></tr>
  <tr><td><label>EngineType</label>&nbsp;</td>
      <td><html:text property="enginetype"/></td></tr>
  <tr><td><label>Guarrenty
                  OnSpares</label>&nbsp;</td>
      <td><html:textarea property="guarrentyonspares"/></td></tr>
  <tr><td colspan="2"  align="center"><html:submit>Enter</html:submit></td></tr>
  </pre>
</table>
</html:form>
					
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

