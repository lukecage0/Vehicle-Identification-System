
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  background="C:\Program Files\Common Files\Microsoft Shared\Stationery\Network Blitz Bkgrd.gif"><center>
		<center><h3><b>USER  FORM</b></h3></center>
		<html:form action="/gotoaction">
		
			PIN NO<html:text property="vno"/><html:errors property="pin"/><br/>
			
			
			
			
            <html:submit/>         	</b>
		</html:form>
		
			</center>
	</body>
</html>
