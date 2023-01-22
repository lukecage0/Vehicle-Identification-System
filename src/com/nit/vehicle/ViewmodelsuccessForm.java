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
 * @struts:form name="viewmodelsuccessForm"
 */
public class ViewmodelsuccessForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	// --------------------------------------------------------- Methods
     private String img;
    private String vtype ;
    private String vmodel;                 
    private String vcolor;                 
    private String m_cls;       
    private String engine;         
    private String milage;                 
    private String enginehp;               
    private String engtype;             
    private String gurranty;
	 
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
	/**
	 * @return Returns the engine.
	 */
	public String getEngine() {
		return engine;
	}
	/**
	 * @param engine The engine to set.
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}
	/**
	 * @return Returns the enginehp.
	 */
	public String getEnginehp() {
		return enginehp;
	}
	/**
	 * @param enginehp The enginehp to set.
	 */
	public void setEnginehp(String enginehp) {
		this.enginehp = enginehp;
	}
	/**
	 * @return Returns the engtype.
	 */
	public String getEngtype() {
		return engtype;
	}
	/**
	 * @param engtype The engtype to set.
	 */
	public void setEngtype(String engtype) {
		this.engtype = engtype;
	}
	/**
	 * @return Returns the gurranty.
	 */
	public String getGurranty() {
		return gurranty;
	}
	/**
	 * @param gurranty The gurranty to set.
	 */
	public void setGurranty(String gurranty) {
		this.gurranty = gurranty;
	}
	/**
	 * @return Returns the m_cls.
	 */
	public String getM_cls() {
		return m_cls;
	}
	/**
	 * @param m_cls The m_cls to set.
	 */
	public void setM_cls(String m_cls) {
		this.m_cls = m_cls;
	}
	/**
	 * @return Returns the milage.
	 */
	public String getMilage() {
		return milage;
	}
	/**
	 * @param milage The milage to set.
	 */
	public void setMilage(String milage) {
		this.milage = milage;
	}
	/**
	 * @return Returns the vcolor.
	 */
	public String getVcolor() {
		return vcolor;
	}
	/**
	 * @param vcolor The vcolor to set.
	 */
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}
	/**
	 * @return Returns the vmodel.
	 */
	public String getVmodel() {
		return vmodel;
	}
	/**
	 * @param vmodel The vmodel to set.
	 */
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}
	/**
	 * @return Returns the vtype.
	 */
	public String getVtype() {
		return vtype;
	}
	/**
	 * @param vtype The vtype to set.
	 */
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
}