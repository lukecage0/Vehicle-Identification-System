
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	
	<body>
			<center>
			<center>
		<html:form action="/gotoworkshoplogin">
		<b>	Username  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          <html:text property="username"/><html:errors property="username"/><br/>
			Password   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     <html:password property="password"/><html:errors property="password"/><br/>
			<br><br>
			<html:submit/>         	</b>
		</html:form>
		
			</center>
	</body>
	
</html>
