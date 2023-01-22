

<%@ page language="java"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    
    <title>Home.jsp</title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
  
</head>    
  
  
  <body >
<pre>&nbsp;</pre>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse:collapse" 
    bordercolor="#111111" width="100%" height="100%" >
  <tr> 
    <td width="176" height="100" rowspan="2" border="1" bgcolor="#c0c0c0"><pre>&nbsp;</pre> 
    <p>&nbsp;<a href="viewvehicle.jsp">View Vehicle Details</a> </p>
            <p>&nbsp;<a href="DeleteBranch.jsp">CrimeReports</a> </p>
            <p>&nbsp;<a href="EditBranch.jsp">UpdateBranchDetails</a> </p>
    
           <pre>&nbsp;</pre> <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p></td>
    <td width="600" height="60" valign="top" bgcolor="gray" bordercolor="#7665876"><blockquote> 
        		<centet><align="center"/>	
        		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3><u> VEHICLE IDENTIFICATION</u></h3>
      </blockquote></td>
  </tr>
  
  
  <tr> 
    <td width="567" height="235"/>
    
<html> 
	
	
	<center>
	<body bgcolor="lightyellow">
	<center>
		<center><h5>VIEW VEHICLE DETAILS</h5></center>
		<html:form action="/gotoviewedit">
		<b>	
			<BR>
			VehicleNumber  <html:text property="vehicleno"/><html:errors property="vehicleno"/><br/>
			
			
			  
			
			<br>
            <html:submit/>         	</b>
		</html:form>
		
			</center>
	</body>
</html>
						
    
    <pre>
   
   
</pre></td>
  </tr>
  <tr> 
    <td bgcolor="#99cccc" colspan="2" height="24" > <pre>                                &copy;copyrightsNit2006-07</pre></td>
  </tr>
</table>
</body>
</html:html>

