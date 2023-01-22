
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  background="C:\Program Files\Common Files\Microsoft Shared\Stationery\Network Blitz Bkgrd.gif"><center>
		<center><h3>BRANCH FORM</b></h3></center>
		<html:form action="/gotoaction">
		<b>	BID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          <html:text property="bid"/><html:errors property="bid"/><br/>
			BR NAME &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     <html:text property="bname"/><html:errors property="bname"/><br/>
			BR LOCATION  <html:text property="bloc"/><html:errors property="bloc"/><br/>
			BR ADDRESS  &nbsp;&nbsp; <html:text property="baddress"/><html:errors property="baddress"/><br/>
			PIN NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;       <html:text property="pin"/><html:errors property="pin"/><br/>
			OWNERNAME  <html:text property="oname"/><html:errors property="oname"/><br/>
			CONT NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      <html:text property="contno"/><html:errors property="contno"/><br/>
			
            <html:submit/>         	</b>
		</html:form>
		
			</center>
	</body>
</html>
