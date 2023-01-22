
<%@ page language="java"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    
    <title>NoticeBoardMsg.jsp</title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <html:form action="/gotonb">

  <pre>                          <font color="#669999" size="4"><strong>Msgs</strong></font></pre>
  <table width="63%" border="1" cellspacing="1" cellpadding="1" align="center">
    <tr>
      
      
    
    <tr>
      <td><label><strong>To<font color="#666633"></font></strong></label> 
        <font color="#666633"><strong>&nbsp;</strong></font></td>
      <td><html:text property="senddate"/></td>
    </tr>
   
    <tr>
      <td><label><strong><font color="#666633">Subject:</font></strong></label> 
        <font color="#666633"><strong>&nbsp;</strong></font></td>
      <td><html:text property="subject"/></td>
    </tr>
     <tr>
      <td><label><strong><font color="#666633">MessageDesc:</font></strong></label> 
        &nbsp;</td>
      <td><html:textarea property="msgdes"/></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><html:submit/>
        &nbsp;</td>
     
    </tr>
  </table>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
</html:form>
    
  </body>
</html:html>
