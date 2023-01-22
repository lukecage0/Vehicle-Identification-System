
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
					<html:form action="/updateprofile" >
  <pre>                          <font color="#663333" size="4"><strong><center>View Profile</center></strong></font>
  <table width="63%" border="0" cellspacing="1" cellpadding="1" align="center">
    <tr>
      <td><label><font color="#666633"><strong>FirstName:</strong></font></label> 
        <font color="#666633"><strong>&nbsp;</strong></font></td>
      <td><html:text property="fname"/></td>
    </tr>
    <tr>
      <td><label><strong><font color="#666633">LastName:</font></strong></label> 
        <font color="#666633"><strong>&nbsp;</strong></font></td>
      <td><html:text property="lname"/>
    </tr>
    <tr>
      <td><label><strong><font color="#666633">UserType:</font></strong></label> 
        <font color="#666633"><strong>&nbsp;</strong></font></td>
      <td><html:text property="utype"/>
    </tr>
    
    <tr>
      <td><strong><font color="#666633">Date:</font></strong></td>
      <td><html:text property="dt"/></td>
    </tr>
    <tr>
      <td><strong><font color="#666633">Age:</font></strong></td>
      <td><html:text property="age"/></td>
    </tr>
    <tr>
      <td><strong><font color="#666633">PhoneNumber:</font></strong></td>
      <td><html:text property="phno"/></td>
    </tr>
    <tr>
      <td><strong><font color="#666633">Address:</font></strong></td>
      <td><html:textarea property="address"/></textarea></td>
    </tr>
    <tr>
      <td><strong><font color="#666633">AddressProof:</font></strong></td>
      <td><html:text property="addressproof"/></td>
    </tr>
    <tr>
      <td><strong><font color="#666633">WorkingOrgDetails:</font></strong></td>
      <td><html:textarea property="workorgdet"/></textarea></td>
    </tr>
    <tr>
      <td><label><strong><font color="#666633">Designation:</font></strong></label> 
        <strong><font color="#666633">&nbsp;</font></strong></td>
      <td><html:text property="designation"/></td>
    </tr>
    <tr>
      <td><label><strong><font color="#666633">UserId</font></strong></label> 
        <font color="#666633"><strong>&nbsp;</strong></font></td>
      <td><html:text property="userid"/></td>
    </tr>
    
    <tr>
      <td><label><strong><font color="#666633">Password:</font></strong></label> 
        <font color="#666633"><strong>&nbsp;</strong></font></td>
      <td><html:text property="password"/></td>
    </tr>
    
    
  </table>
  </pre></center><html:submit  property="method" value="Change"></html:submit>
    </html:form>
</TD></TR><TR><TD COLSPAN="2" HEIGHT="5%" BGCOLOR="wheat" NOWRAP>
					<jsp:include page="vehiclefooter.jsp"/>
				</TD>
			</TR>
		</TABLE>
	</BODY>
</html:html>


