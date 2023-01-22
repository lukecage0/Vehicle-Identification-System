
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>

 
<html> 

	<body  background="C:\Program Files\Common Files\Microsoft Shared\Stationery\Network Blitz Bkgrd.gif"><center>
		<center><h3><b>BRANCH FORM</b></h3></center>
		<html:form action="/gotodelete">
		<b>	BID<html:text property="bid"/><html:errors property="bid"/><br/>
		<html:submit/>         	</b>
		</html:form>
		</center>
		</body>
	
</html>
