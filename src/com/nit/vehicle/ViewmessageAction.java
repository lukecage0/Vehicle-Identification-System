//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.nit.vehicle.*;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-28-2007
 * 
 * XDoclet definition:
 * @struts:action path="/viewmessage" name="viewmessageForm" input="/Viewmessage.jsp" scope="request" validate="true"
 * @struts:action-forward name="success" path="/Viewmessages.jsp"
 */
public class ViewmessageAction extends Action {

	// --------------------------------------------------------- Instance Variables

	// --------------------------------------------------------- Methods

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
		HttpServletResponse response) {
		ViewmessageForm vf= (ViewmessageForm) form;
		String uid=(String)request.getSession().getAttribute("uid");
		System.out.println(uid+"this is userid");
		Collection c=new messageDAO(getDataSource(request)).getMessages(uid);
		request.getSession().setAttribute("MESSAGES",c);
		return mapping.findForward("success");
		
	}

}