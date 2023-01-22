
<%@ page language="java"%>
<%@ page import="java.util.*,com.nit.vehicle.*"%>

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
					<jsp:include page="insurancemenu.jsp"/>
				</TD>
				
				<TD WIDTH="82%" HEIGHT="81%" BGCOLOR="#cccfc" NOWRAP><!--#E4ECF6-->
					
					<html:form action="/deletemsgs">
  <pre><font size="4"><strong><center>Messages</center></strong></font>
 <table align="center" width="100%" border="0" cellspacing="1" cellpadding="1">
   <td></td><td>From</td><td>Sub</td><td>SentDate</td>
    <tr valign="middle">
    <td width="39%"><br>
	<% Collection c=(Collection)session.getAttribute("MESSAGES");
	Iterator i=c.iterator();
	  System.out.println ("collection ob for messages");
	while(i.hasNext())
	{
	System.out.println("with in the while");
	MessagesForm mf=(MessagesForm)i.next();
	System.out.println(mf.getMessgae());
	%>
<tr><td> <INPUT type="checkbox" name="mid" value="<%=mf.getMid()%>"/></td>
<td>
<a href="ViewMessagesuccess.jsp?from=<%=mf.getTo_id()%>&sub=<%=mf.getSubject()%>&date=<%=mf.getDate()%>&msg=<%=mf.getMessgae()%>"><%=mf.getTo_id()%></a></td>

<td><%=mf.getSubject()%></td>
<td><%=mf.getDate()%></td></tr>
<%
}
%>
<tr><td><input type="submit" value="delete"/></td></tr>
</table></pre>
</html:form></TD>
			</TR>
			<TR>
				<TD COLSPAN="2" HEIGHT="5%" BGCOLOR="wheat" NOWRAP>
					<jsp:include page="vehiclefooter.jsp"/>
				</TD>
			</TR>
		</TABLE>
	</BODY>
</html:html>

