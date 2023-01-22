//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 03-12-2007
 * 
 * XDoclet definition:
 * @struts:action validate="true"
 */
public class ViewNBMsgsAction extends Action {

			/** 
			 * Method execute
			 * @param mapping
			 * @param form
			 * @param request
			 * @param response
			 * @return ActionForward
			 */
			public ActionForward execute(
				ActionMapping mapping,
				ActionForm form,
				HttpServletRequest request,
				HttpServletResponse response)throws Exception {
				MsgToNoticeBoardForm n = (MsgToNoticeBoardForm) form;
			
		MsgToNoticeBoardForm n = (MsgToNoticeBoardForm) form;
EmpPostMessagesDAO epmdao=new EmpPostMessagesDAO(getDataSource(request));
boolean type=epmdao.empviewmessages(epmf);
cc=epmdao.viewmessages(epmf);
System.out.println("--cc--");
request.setAttribute("viewmessages",cc);
System.out.println("--set Attribute--");
if(type==false)
{
	System.out.println("fail");
	return mapping.findForward("fail");
	
}
System.out.println("success");
return mapping.findForward("success");

}

}


