



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
					<jsp:include page="vehiclemenu.jsp"/>
				</TD>
				
				<TD WIDTH="82%" HEIGHT="81%" BGCOLOR="#cccfc" NOWRAP><!--#E4ECF6-->
					<html:form action="/gotonb">
					<html:errors/>
  <pre><font size="4"><strong><center>Msgs To Noticeboard</center></strong></font>
 <table width="63%" border="1" cellspacing="1" cellpadding="1" align="center">
    <tr>
      <td width="43%"><label><strong><font color="#666633">MessageId:</font></strong></label> 
        <font color="#0000FF"><strong>&nbsp;</strong></font></td>
      <td width="57%"><html:text property="messageid"/></td>
    </tr>
    <tr>
      <td><label><font color="#666633"><strong>From:</strong></font></label> <font color="#666633">&nbsp;</font></td>
      <td><html:text   property="fromtype"/> 
      
    </tr>
    <tr>
      <td><label><strong><font color="#666633">Subject:</font></strong></label> 
        <font color="#666633"><strong>&nbsp;</strong></font></td>
      <td><html:text property="subject"/></td>
    </tr>
    <tr>
      <td><label><strong><font color="#666633">SendDate:</font></strong></label> 
        <font color="#666633"><strong>&nbsp;</strong></font></td>
      <td><html:text property="senddate"/></td>
    </tr>
    <tr>
      <td><label><strong><font color="#666633">MessageDesc:</font></strong></label> 
        &nbsp;</td>
      <td><html:textarea property="msgdes"/></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><html:submit/>
        &nbsp;</td>
     
    </tr>
  </table>
</pre>
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

