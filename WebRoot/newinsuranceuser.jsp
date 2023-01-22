
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  background="C:\Program Files\Common Files\Microsoft Shared\Stationery\Network Blitz Bkgrd.gif"><center>
		<center><h3><b>USER  FORM</b></h3></center>
		<html:form action="/gotoaction">
		<b>	USERNAME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          <html:text property="uname"/><html:errors property="uname"/><br/>
			DESIGNATION &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     <html:text property="desig"/><html:errors property="desig"/><br/>
			ADDRESS  <html:text property="address"/><html:errors property="address"/><br/>
		 ADDRESS PROOF  &nbsp;&nbsp; <html:text property="addressproof"/><html:errors property="addressproof"/><br/>
			PIN NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;       <html:text property="pin"/><html:errors property="pin"/><br/>
			CONT NO <html:text property="contno"/><html:errors property="contno"/><br/>
			
			ORGANISATION NAME&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      <html:text property="orgname"/><html:errors property="orgname"/><br/>
			
            <html:submit/>         	</b>
		</html:form>
		
			</center>
	</body>
</html>
