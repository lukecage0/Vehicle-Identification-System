
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  ><center>
		<center><h3>VEHICLE DETAILS FORM</b></h3></center>
		<html:form action="/gotoaddvehicle">
		<b>	PurchaseDate&nbsp;&nbsp;&nbsp;&nbsp;  <html:text property="pdate"/><html:errors property="pdate"/><br/>
		

	
	VehicleNo&nbsp;&nbsp;<html:text property="vno"/><html:errors property="vno"/><br/>
			Vehiclemodel&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="vmodel"/><html:errors property="vmodel"/><br/>
		 VehicleDetails&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="vdetails"/><html:errors property="vdetails"/><br/>
			EngineNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="eno"/><html:errors property="eno"/><br/>
			OwnerName&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <html:text property="oname"/><html:errors property="oname"/><br/>
            			OwnerAddress&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <html:text property="oaddress"/><html:errors property="oaddress"/><br/>			
            			ContNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <html:text property="contno"/><html:errors property="contno"/><br/>			
			EmailId&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:text property="emailid"/><html:errors property="emailid"/><br/>
			PinNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="pinno"/><br>
			
InsuranceDetails&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="insurancedetails"/><html:errors property="insurancedetails"/><br/>



	
			<br> <br>
            <html:submit/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="adminhomepage.jsp">home</a><br>        	</b>
		</html:form>
		
			</center>
	</body>
</html>
