
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  background="C:\Program Files\Common Files\Microsoft Shared\Stationery\Maize Bkgrd.jpg"><center>
		<center><h3>BRANCH FORM</b></h3></center>
		<html:form action="/gotoedit" >
		<b>	BID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          <html:text property="bid"/><html:errors property="bid"/><br/>
			<br/>
			
            <html:submit/>         	</b>
		</html:form>
		
			</center>
	</body>
</html>
