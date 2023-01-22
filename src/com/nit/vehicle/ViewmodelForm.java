//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 03-02-2007
 * 
 * XDoclet definition:
 * @struts:form name="viewmodelForm"
 */
public class ViewmodelForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** modelname property */
	private String modelname;

	// --------------------------------------------------------- Methods

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {

		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	/** 
	 * Returns the modelname.
	 * @return String
	 */
	public String getModelname() {
		return modelname;
	}

	/** 
	 * Set the modelname.
	 * @param modelname The modelname to set
	 */
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

}