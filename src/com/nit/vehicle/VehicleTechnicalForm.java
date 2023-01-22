//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-16-2007
 * 
 * XDoclet definition:
 * @struts:form name="VehicleTechnicalForm"
 */
public class VehicleTechnicalForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** vno property */
	private String vno;
	private String eno;

	/** enginehp property */
	private String enginehp;

	/** vtype property */
	private String vtype;

	/** bodytype property */
	private String bodytype;

	/** unladenweight property */
	private String unladenweight;

	/** enginecapacity property */
	private String enginecapacity;

	/** wheels property */
	private String wheels;

	/** milage property */
	private String milage;
	private String vmodel;

	// --------------------------------------------------------- Methods

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	/*public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {

		throw new UnsupportedOperationException(
			"Generated method 'validate(...)' not implemented.");
	}*/

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	/*public void reset(ActionMapping mapping, HttpServletRequest request) {

		throw new UnsupportedOperationException(
			"Generated method 'reset(...)' not implemented.");
	}*/

	/** 
	 * Returns the vno.
	 * @return String
	 */
	public String getVno() {
		return vno;
	}

	/** 
	 * Set the vno.
	 * @param vno The vno to set
	 */
	public void setVno(String vno) {
		this.vno = vno;
	}

	/** 
	 * Returns the enginehp.
	 * @return String
	 */
	public String getEnginehp() {
		return enginehp;
	}

	/** 
	 * Set the enginehp.
	 * @param enginehp The enginehp to set
	 */
	public void setEnginehp(String enginehp) {
		this.enginehp = enginehp;
	}

	/** 
	 * Returns the vtype.
	 * @return String
	 */
	public String getVtype() {
		return vtype;
	}

	/** 
	 * Set the vtype.
	 * @param vtype The vtype to set
	 */
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	/** 
	 * Returns the bodytype.
	 * @return String
	 */
	public String getBodytype() {
		return bodytype;
	}

	/** 
	 * Set the bodytype.
	 * @param bodytype The bodytype to set
	 */
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}

	/** 
	 * Returns the unladenweight.
	 * @return String
	 */
	public String getUnladenweight() {
		return unladenweight;
	}

	/** 
	 * Set the unladenweight.
	 * @param unladenweight The unladenweight to set
	 */
	public void setUnladenweight(String unladenweight) {
		this.unladenweight = unladenweight;
	}

	/** 
	 * Returns the enginecapacity.
	 * @return String
	 */
	public String getEnginecapacity() {
		return enginecapacity;
	}

	/** 
	 * Set the enginecapacity.
	 * @param enginecapacity The enginecapacity to set
	 */
	public void setEnginecapacity(String enginecapacity) {
		this.enginecapacity = enginecapacity;
	}

	/** 
	 * Returns the wheels.
	 * @return String
	 */
	public String getWheels() {
		return wheels;
	}

	/** 
	 * Set the wheels.
	 * @param wheels The wheels to set
	 */
	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	/** 
	 * Returns the milage.
	 * @return String
	 */
	public String getMilage() {
		return milage;
	}

	/** 
	 * Set the milage.
	 * @param milage The milage to set
	 */
	public void setMilage(String milage) {
		this.milage = milage;
	}

	
	
	
	public String getVmodel() {
		return vmodel;
	}

	/** 
	 * Set the milage.
	 * @param milage The milage to set
	 */
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}
	
	public String getEno() {
		return eno;
	}

	/** 
	 * Set the milage.
	 * @param milage The milage to set
	 */
	public void setEno(String eno) {
		this.eno = eno;
	}
}