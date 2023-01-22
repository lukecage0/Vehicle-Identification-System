
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	
	<body background="D:\Oracle\Ora81\classes\oracle\sysman\ocmhelp\bluepaper01.jpg">
			<center>
			<center><b>VEHICLE IDENTIFICATION </b></center>
			<br><br>
			<br><br>
		<html:form action="/gotologinpage">
		<b>	Username   <html:text property="username"/><html:errors property="username"/><br/>
			Password    &nbsp;<html:password property="password"/><html:errors property="password"/><br/>
			<br><br>
			<html:submit/>         	</b>
		</html:form>
		<html:html/>
	