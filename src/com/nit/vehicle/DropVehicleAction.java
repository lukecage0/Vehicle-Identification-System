//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpSession;


/** 
 * MyEclipse Struts
 * Creation date: 02-28-2007
 * 
 * XDoclet definition:
 * @struts:action path="/drop" name="VehicleRegistrationForm" scope="request" validate="true"
 * @struts:action-forward name="success" path="/VewSuccess.jsp"
 */
public class DropVehicleAction extends Action {

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
		HttpServletResponse response)throws Exception {
		VehicleRegistrationForm vf = (VehicleRegistrationForm) form;
		AddVehicleDetailsDAO ldao=new AddVehicleDetailsDAO(getDataSource(request));
		Collection c=ldao.getVehiclenos();
		HttpSession session=request.getSession();
		session.setAttribute("nos",c);
		return mapping.findForward("success");
		}
}

