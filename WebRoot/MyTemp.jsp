<%@ page language="java"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    <title>Relationship Manager</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
  </head>
  <body>
  <table align="center" width="100%" border="0" cellspacing="0">
    <tr>
      <td colspan="2" align="center"><CENTER>HONDA MOTORS</CENTER></td>
    </tr>
    <tr> 
      <td><table  width="100%"><tr><td>&nbsp;</td></tr></table></td>
      <td><%@include file="/Top.html"%></td>
    </tr>
    <tr> 
      <td valign="top" width="25%"><tiles:insert attribute="menu"/></td>      
      <td valign="top"><tiles:insert attribute="body"/></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><i>@Copyrights</i></td>
    </tr>
    </table>
  </body>
</html:html>
