
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 

	
	
	<center>
	<body >
		<center><h3>CRIME CHALANA</b></h3></center>
<html:form action="/gotopsuccess.do">

	<b>Date&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="cdate"/><html:errors property="cdate"/><br/>	
	  VehicleNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="vno"/><html:errors property="vno"/><br/>
			
			
			
			OwnerName&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="oname"/><html:errors property="oname"/><br/>
		  OwnerAddress<html:text   property="oaddress"/><html:errors property="oaddress"/><br/>
		  
			Crimetype&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="ctype"/><html:errors property="ctype"/><br/>
			Fine&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="fine"/><html:errors property="fine"/><br/>
			<br>
                     	</b>
	</center>
	<br><br>
	&nbsp;&nbsp;&nbsp;&nbsp;<B>Note:</B>you must pay the fine within 20 days 
				by the issue date otherwise you put
				into prison upto 6 months
			
			</html:form>
	</body>
</html>