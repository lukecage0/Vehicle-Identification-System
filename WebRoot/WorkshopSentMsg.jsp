

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
					<jsp:include page="servicemenu.jsp"/>
				</TD>
				
				<TD WIDTH="82%" HEIGHT="81%" BGCOLOR="#cccfc" NOWRAP><!--#E4ECF6-->
					<html:form action="/messageswork">
					<html:errors/>
  
  
  <pre><font size="4"><strong><center>Messages</strong></font>
  
		
		<table width="51%" border="0" cellspacing="1" cellpadding="1" align="center">
  <tr>
    <td width="45%"><label>Subject </label>&nbsp;</td>
    <td width="55%"><html:text property="subject"/></td>
  </tr>
  <tr>
    <td><label>To_Id</label>&nbsp;</td>
    <td><html:text property="to_id"/></td>
  </tr>
  <tr>
    <td><label>User_Type</label>&nbsp;</td>
    <td><html:text property="user_type"/></td>
  </tr>
  <tr>
    <td><label>Message</label>&nbsp;</td>
    <td><html:textarea property="messgae"/></td>
</tr>
<tr>
    <td colspan="2"  align="center"><html:submit>Send</html:submit>
	</td>
    
  </tr>

</pre></table>

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