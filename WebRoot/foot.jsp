
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

            <p>&nbsp;<a href="newuserregistration.jsp">New User</a> </p>
            <p>&nbsp;<a href="EditBranch.jsp">View Vehicle Details</a> </p>
            <p>&nbsp;<a href="EditBranch.jsp">Add Vehicle Details</a> </p>
            <p>&nbsp;<a href="EditBranch.jsp">Update Vehicle Details</a> </p>
           <pre>&nbsp;</pre> <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p>&nbsp;</p></td>
    <td width="600" height="38" valign="top" bgcolor="gray" bordercolor="#7665876"><blockquote> 
        		<centet><align="center"/>	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3><u> VEHICLE IDENTIFICATION</u></h3>
      </blockquote></td>
  </tr>
  
  
  <tr> 
    <td width="567" height="235" bgcolor="white">
    



<%@ page language="java"%>

 
<html> 
	
	
	<center>
	<body >
		<center><h3>VEHICLE DETAILS</b></h3></center>
<html:form action="/gotopsuccess.do">
		<b>	  VehicleNo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="vno"/><html:errors property="vno"/><br/>
			VehicleType&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="vtype"/><html:errors property="vtype"/><br/>
			VehicleDetails&nbsp;&nbsp;<html:text property="vdetails"/><html:errors property="vdetails"/><br/>
			VehicleColor&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="vcolor"/><html:errors property="vcolor"/><br/>
			OwnerName&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:text property="oname"/><html:errors property="oname"/><br/>
			OwnerAddress&nbsp;&nbsp;<html:text property="oaddress"/><html:errors property="oaddress"/><br/>
			OwnerPhoneNo&nbsp;&nbsp;<html:text property="ophno"/><html:errors property="ophno"/><br/>
			<br>
                     	</b>
	
		<br><html:submit/>
			</center>
			</html:form>
			
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
</html:html>//////////////
new model view submit code
 
<%@ page language="java" import="java.util.*,com.nit.vehicle.*" %>
<%@ page import="java.util.Iterator" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for viewmodelForm form</title>
	</head>
	<body>
   
	
	<html:form action="viewmodelsuccess.do">

 <SELECT name="mname">
	Model Name
   
	
	<%
	  Collection c=(Collection) request.getSession().getAttribute("modelname");
	  Iterator it=c.iterator();
	  while(it.hasNext())
	  {
	  ViewmodelForm vf=(ViewmodelForm)it.next();
	  System.out.println(vf.getModelname()+"with in the jsp");
	%>
	 <option value="<%=vf.getModelname()%>"><%=vf.getModelname()%></option><br/>
	<%
	}
	%>	
		<html:submit/>
		</html:form>
		</SELECT>
			</body>
</html>
/
