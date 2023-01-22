 
<%@ page language="java" import="java.util.*,com.nit.vehicle.*" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for viewmessageForm form</title>
	</head>
	<body>
		<html:form action="/deletemsgs">
    Messages
     
    <table align="center" width="100%" border="0" cellspacing="1" cellpadding="1">
    
    
     <td></td><td>From</td><td>Sub</td><td>SentDate</td>
    <tr valigh="middle">
    <td width="39%"><br>
	<% Collection c=(Collection)session.getAttribute("MESSAGES");
	Iterator i=c.iterator();
	System.out.println("collection ob for messages");
	
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
<td><%=mf.getDate()%></td>

</tr>

	 
	<%
	}
	%>
	<tr><td><input type="submit" value="delete"/></td></tr>

  </html:form>
	</body>
</html>
