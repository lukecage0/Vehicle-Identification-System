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
 * Creation date: 03-02-2007
 * 
 * XDoclet definition:
 * @struts:action path="/viewmodel" name="viewmodelForm" input="/Viewmodel.jsp" scope="request" validate="true"
 * @struts:action-forward name="success" path="/success.jsp"
 */
public class ViewmodelAction extends Action {

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
		ViewmodelForm vf= (ViewmodelForm) form;
		NewModelDAO ndao=new NewModelDAO(getDataSource(request));
		Collection c=ndao.modeltypes();
		request.getSession().setAttribute("modelname",c);
		System.out.println(c+"collection ob");
		return mapping.findForward("success");
	}

}