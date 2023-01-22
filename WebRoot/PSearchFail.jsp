<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  ><center>
		<center><h3>VEHICLE REGISTRATION DETAILS</b></h3></center>
		<html:form action="/regdetails">
		<b>	VEHICLE NO&nbsp;&nbsp;&nbsp;&nbsp;  <html:text property="vno"/><html:errors property="vno"/><br/>
		
                   ENGINE NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="eno"/>
		<br>
	CHASIS NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="chasisno"/><html:errors property="chasisno"/><br/>
			VEHICLE TYPE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="vtype"/><html:errors property="vtype"/><br/>
		 VEHICLE MODEL<html:text property="vmodel"/><html:errors property="vmodel"/><br/>
MAKERS CLASSIFICATION<html:text property="makerclassification"/><html:errors property="makerclassification"/><br/>
			PURCHASE DATE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <html:text property="pdate"/><html:errors property="pdate"/><br/>
			FUEL&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="fuel"/><br>
OWNER NAME&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="oname"/><html:errors property="oname"/><br/>
			ADDRESS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="oaddress"/><html:errors property="oaddress"/><br/>
			ADDRESS PROOF&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="oaddressproof"/><html:errors property="oaddressproof"/><br/>
			CONTNO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="ocontno"/><html:errors property="ocontno"/><br/>
		    	EMAILID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="emailid"/><html:errors property="emailid"/><br/>
		    	PIN NO&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="pinno"/><html:errors property="pinno"/><br/>
			<br> <br>
            <html:submit/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="adminhomepage.jsp">home</a><br>        	</b>
		</html:form>
		
			</center>
	</body>
</html>
