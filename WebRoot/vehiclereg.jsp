
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
					<html:form action="/regdetails">
					<html:errors/>
  <pre>                              <font size="4"><strong><center>Vehicle Registration</center></strong></font></pre>
  
  
  <table width="51%" border="0" cellspacing="1" cellpadding="1" align="center">
  
  
  
  <tr><td width="45%"><label>VehicleNo</label>&nbsp;</td>
      <td width="55%"><html:text property="vno"/></td></tr>
  <tr><td><label>EngineNo</label>&nbsp;</td>
       <td><html:text property="eno"/></td></tr>
  <tr><td><label>ChasisNo</label>&nbsp;</td>
       <td><html:text property="chasisno"/></td></tr>
  <tr><td><label>Vehicle Type</label>&nbsp;</td>
       <td><html:text property="vtype"/></td></tr>
  <tr><td><label>Color</label>&nbsp;</td>
       <td><html:text property="vcolor"/></td></tr>          
  <tr><td><label>Vehicle Model</label>&nbsp;</td>
       <td><html:text property="vmodel"/></td></tr>     
  <tr><td><label>MakersClassification</label>&nbsp;</td>
       <td><html:text property="makerclassification"/></td></tr>
  <tr><td><label>Purchase Date</label>&nbsp;</td>
       <td><html:text property="pdate"/></td></tr>
  <tr><td><label>Fuel</label>&nbsp;</td>
       <td><html:text property="fuel"/></td></tr>
  <tr><td><label>OwnerName</label>&nbsp;</td>
       <td><html:text property="oname"/></td></tr>
  <tr><td><label>Address</label>&nbsp;</td>
      <td><html:textarea property="oaddress"/></td></tr>
  <tr><td><label>AddressProof</label>&nbsp;</td>
      <td><html:text property="oaddressproof"/></td></tr>
  <tr><td><label>ContNo</label>&nbsp;</td>
      <td><html:text property="ocontno"/></td></tr>
  <tr><td><label>EmailId</label>&nbsp;</td>
      <td><html:text property="emailid"/></td></tr>
  <tr><td><label>PinNo</label>&nbsp;</td>
      <td><html:text property="pinno"/></td></tr>
      </pre>
      <tr>
    <td colspan="2"  align="center"><html:submit>Enter</html:submit>
	</td>
    
  </tr>
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
