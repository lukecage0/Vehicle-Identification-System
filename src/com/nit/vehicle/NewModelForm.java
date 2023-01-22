
//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-20-2007
 * 
 * XDoclet definition:
 * @struts:form name="NewModelForm"
 */
public class NewModelForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** enginehp property */
	private String enginehp;

	/** vtype property */
	private String vtype;

	/** enginecapacity property */
	private String enginecapacity;
	/**
	 * @return Returns the img.
	 */
	public String getImg() {
		return img;
	}
	/**
	 * @param img The img to set.
	 */
	public void setImg(String img) {
		this.img = img;
	}
	private String img;

	/** makersclassification property */
	private String makersclassification;

	/** vmodel property */
	private String vmodel;

	/** guarrentyonspares property */
	private String guarrentyonspares;

	/** enginetype property */
	private String enginetype;

	/** milage property */
	private String milage;
private String vcolor;
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
	 * Returns the makersclassification.
	 * @return String
	 */
	public String getMakersclassification() {
		return makersclassification;
	}

	/** 
	 * Set the makersclassification.
	 * @param makersclassification The makersclassification to set
	 */
	public void setMakersclassification(String makersclassification) {
		this.makersclassification = makersclassification;
	}

	/** 
	 * Returns the vmodel.
	 * @return String
	 */
	public String getVmodel() {
		return vmodel;
	}

	/** 
	 * Set the vmodel.
	 * @param vmodel The vmodel to set
	 */
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}

	/** 
	 * Returns the guarrentyonspares.
	 * @return String
	 */
	public String getGuarrentyonspares() {
		return guarrentyonspares;
	}

	/** 
	 * Set the guarrentyonspares.
	 * @param guarrentyonspares The guarrentyonspares to set
	 */
	public void setGuarrentyonspares(String guarrentyonspares) {
		this.guarrentyonspares = guarrentyonspares;
	}

	/** 
	 * Returns the enginetype.
	 * @return String
	 */
	public String getEnginetype() {
		return enginetype;
	}

	/** 
	 * Set the enginetype.
	 * @param enginetype The enginetype to set
	 */
	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
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

	
	
	
	public String getVcolor() {
		return vcolor;
	}

	/** 
	 * Set the milage.
	 * @param milage The milage to set
	 */
	public void setVcolor(String vcolor) {
		this.vcolor =vcolor;
	}
}