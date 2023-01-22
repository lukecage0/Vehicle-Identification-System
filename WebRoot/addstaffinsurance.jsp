
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
					<html:form action="/gotoinsuranceform">
					<html:errors/>
  <pre><font size="4"><strong><center>Insuranece Form</center></strong></font></pre>
 <table width="51%" border="0" cellspacing="1" cellpadding="1" align="center">
  <tr><td width="45%"><label>Date</label>&nbsp;</td>
      <td width="55%"><html:text property="dt"/></td></tr>
  <tr><td><label>Vehicle No</label>&nbsp;</td>
       <td><html:text property="vno"/></td></tr>
  <tr><td><label>Vehicle Type</label>&nbsp;</td>
       <td><html:text property="vtype"/></td></tr>
  <tr><td><label>ChasisNo</label>&nbsp;</td>
       <td><html:text property="chasisno"/></td></tr>
  <tr><td><label>Owner Name</label>&nbsp;</td>
       <td><html:text property="oname"/></td></tr>
  <tr><td><label>Address</label>&nbsp;</td>
      <td><html:textarea property="oaddress"/></td></tr>
  <tr><td><label>ContNo</label>&nbsp;</td>
      <td><html:text property="ocontno"/></td></tr>
   <tr><td><label>Insurance Company details</label>&nbsp;</td>
      <td><html:textarea property="icdetails"/></td></tr>   
  <tr><td><label>InsuraceType</label>&nbsp;</td>
      <td><html:text property="itype"/></td></tr>
 <tr><td><label>InsuraceCharge</label>&nbsp;</td>
      <td><html:text property="iamount"/></td></tr>
 <tr><td><label>ExpireDate</label>&nbsp;</td>
      <td><html:text property="exdate"/></td></tr>
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
