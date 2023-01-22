
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  ><center>
		<center><h3>USER  FORM</b></h3></center>
		<html:form action="/gotoother">
		<b>	USERNAME&nbsp;&nbsp;&nbsp;&nbsp;  <html:text property="username"/><html:errors property="username"/><br/>
		

	
	DESIGNATION&nbsp;&nbsp;<html:text property="designation"/><html:errors property="designation"/><br/>
			ADDRESS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="address"/><html:errors property="address"/><br/>
		 ADDRESS PROOF&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="addressproof"/><html:errors property="addressproof"/><br/>
			PIN NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="pinno"/><html:errors property="pinno"/><br/>
			CONT NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <html:text property="contno"/><html:errors property="contno"/><br/>
			EMAILID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="emailid"/><html:errors property="emailid"/><br/>
			PHOTODETAILS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="photodetails"/><br>
			
COMPANYNAME&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="orgname"/><html:errors property="orgname"/><br/>

			USERID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="userid"/><html:errors property="userid"/><br/>
			PASSWORD&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="password"/><html:errors property="password"/><br/>
	 USER TYPE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="usertype"/>
			<br> <br>
            <html:submit/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="adminhomepage.jsp">home</a><br>        	</b>
		</html:form>
		
			</center>
	</body>
</html>
