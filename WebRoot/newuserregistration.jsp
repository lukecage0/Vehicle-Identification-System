
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  ><center>
		<center><h3>USER  FORM</b></h3></center>
		<html:form action="/gotonewuser">
		<b>	USERNAME&nbsp;&nbsp;&nbsp;&nbsp;  <html:text property="uname"/><html:errors property="uname"/><br/>
		
                   USER TYPE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="orgname"/>
		<br>
	DESIGNATION&nbsp;&nbsp;<html:text property="desig"/><html:errors property="desig"/><br/>
			ADDRESS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="uaddress"/><html:errors property="uaddress"/><br/>
		 ADDRESS PROOF&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="addressproof"/><html:errors property="addressproof"/><br/>
			PIN NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="pin"/><html:errors property="pin"/><br/>
			CONT NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <html:text property="contno"/><html:errors property="contno"/><br/>
			PHOTODETAILS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="photodetails"/><br>
COMPANYNAME&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="utype"/><html:errors property="utype"/><br/>
			USERID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="userid"/><html:errors property="userid"/><br/>
			PASSWORD&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="pass"/><html:errors property="pass"/><br/>
			<br> <br>
            <html:submit/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="adminhomepage.jsp">home</a><br>        	</b>
		</html:form>
		
			</center>
	</body>
</html>
