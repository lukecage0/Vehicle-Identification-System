//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


/** 
 * MyEclipse Struts
 * Creation date: 02-28-2007
 * 
 * XDoclet definition:
 * @struts:action path="/messages" name="messagesForm" input="Messages.jsp" scope="request" validate="true"
 * @struts:action-forward name="success" path="/success.jsp"
 */
public class MessagesAction extends Action {

	// --------------------------------------------------------- Instance Variables

	// --------------------------------------------------------- Methods

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 * @throws Exception
	 */
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		MessagesForm mf = (MessagesForm) form;
		String uid=(String)request.getSession().getAttribute("uid");
		System.out.println(mf.getSubject()+"subject");
		System.out.println(mf.getMessgae()+"message");
		System.out.println(mf.getUser_type()+"type");
		System.out.println(mf.getTo_id()+"toid");
	    int i=new messageDAO(getDataSource(request)).insertMessage(mf,uid);
		System.out.println("the value of i is  :"+i);
		 if(i==1)
		 	return mapping.findForward("success");
	return null;
	}

}