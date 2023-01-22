
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	
	
	<center>
	<body  ><center>
		<center><h3>REGISTRATION DETAILS</b></h3></center>
		<html:form action="/viewvehdetails">
		<pre><center><b>
 VEHICLE NO             <html:text property="vno"/><html:errors property="vno"/>
 ENGINE NO              <html:text property="eno"/>
 CHASIS NO              <html:text property="chasisno"/><html:errors property="chasisno"/>
 VEHICLE TYPE           <html:text property="vtype"/><html:errors property="vtype"/>
 VEHICLE COLOR          <html:text property="vcolor"/><html:errors property="vcolor"/>
 VEHICLE MODEL          <html:text property="vmodel"/><html:errors property="vmodel"/>
 MAKERS CLASSIFICATION  <html:text property="makerclassification"/><html:errors property="makerclassification"/>
 PURCHASE DATE          <html:text property="pdate"/><html:errors property="pdate"/>
 FUEL                   <html:text property="fuel"/>
  OWNER NAME             <html:text property="oname"/><html:errors property="oname"/> 
     ADDRESS                 <html:textarea property="oaddress"/><html:errors property="oaddress"/>
 ADDRESS PROOF          <html:text property="oaddressproof"/><html:errors property="oaddressproof"/>
 CONTNO                 <html:text property="ocontno"/><html:errors property="ocontno"/>
 EMAILID                <html:text property="emailid"/><html:errors property="emailid"/>
 PIN NO                 <html:text property="pinno"/><html:errors property="pinno"/>
			
            <html:submit/></b>
           </html:form></center>
		</pre>
			</center>
	</body>
</html>
