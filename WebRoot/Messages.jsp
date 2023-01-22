 
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for messagesForm form</title>
	</head>
	<body>
		<html:form action="/messages">
			
			subject : <html:text property="subject"/><html:errors property="subject"/><br/>
			to_id : <html:text property="to_id"/><html:errors property="to_id"/><br/>
			user_type : <html:text property="user_type"/><html:errors property="user_type"/><br/>
			messgae : <html:textarea property="messgae"/><html:errors property="messgae"/><br/>
			
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>
