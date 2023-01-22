
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
    <html:form action="viewnoticeboardmsg">

  <pre>                          <font color="#669999" size="4"><strong>NoticeBoard</strong></font></pre>
  <table width="63%" border="1" cellspacing="1" cellpadding="1" align="center">
    <tr>
    <th><b>MsgID</b></th>
    <th><b>From</b></th>
    <th><b>Subject</b></th>
    <th><b>Date</h>
    
    </tr>
    
    <logic:iterate id="messages" name="messages">
    <tr>
    <td><bean:write name="messages" property="messageid"/></td>
    <td><bean:write name="messages" property="fromtype"/></td>
    <td><bean:write name="messages" property="subject"/></td>
    <td><bean:write name="messages" property="senddate"/></td>
      </logic:iterate>
  </tr>
  </table>
    </html:form>
    
  </body>
</html:html>
