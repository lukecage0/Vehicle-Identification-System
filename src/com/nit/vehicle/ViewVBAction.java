//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 03-14-2007
 * 
 * XDoclet definition:
 * @struts:action validate="true"
 */
public class ViewVBAction extends Action {

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
			Collection c=new messageDAO(getDataSource(request)).getMessages1(uid);
			request.getSession().setAttribute("MESSAGES",c);
			return mapping.findForward("success");
			
		}

	}