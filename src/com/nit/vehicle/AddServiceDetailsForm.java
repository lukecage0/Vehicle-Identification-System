//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 03-04-2007
 * 
 * XDoclet definition:
 * @struts:form name="AddServiceDetailsForm"
 */
public class AddServiceDetailsForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** chasisno property */
	private String chasisno;

	/** vno property */
	private String vno;

	/** other property */
	private String other;

	/** vpdate property */
	private String vpdate;

	/** ownerdetails property */
	private String ownerdetails;

	private String vtype;
	/** osstatus property */
	private String osstatus;

	/** wsstatus property */
	private String wsstatus;

	/** dt property */
	private String dt;

	private String   newservicedet;
	private String   servicevenue;
	private  String  servicedate;
	private  String  serviceduration;
	
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

		ActionErrors ae=new ActionErrors();
		if(getDt()==null||getDt().equals(""))
		ae.add("formerror",new ActionError("dt.notnull"));
		if(getServicevenue()==null||getServicevenue().equals(""));
		
		return ae;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
/*	public void reset(ActionMapping mapping, HttpServletRequest request) {

		throw new UnsupportedOperationException(
			"Generated method 'reset(...)' not implemented.");
	}*/

	/** 
	 * Returns the chasisno.
	 * @return String
	 */
	public String getChasisno() {
		return chasisno;
	}

	/** 
	 * Set the chasisno.
	 * @param chasisno The chasisno to set
	 */
	public void setChasisno(String chasisno) {
		this.chasisno = chasisno;
	}

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
	 * Returns the other.
	 * @return String
	 */
	public String getOther() {
		return other;
	}

	/** 
	 * Set the other.
	 * @param other The other to set
	 */
	public void setOther(String other) {
		this.other = other;
	}

	/** 
	 * Returns the vpdate.
	 * @return String
	 */
	public String getVpdate() {
		return vpdate;
	}

	/** 
	 * Set the vpdate.
	 * @param vpdate The vpdate to set
	 */
	public void setVpdate(String vpdate) {
		this.vpdate = vpdate;
	}

	/** 
	 * Returns the ownerdetails.
	 * @return String
	 */
	public String getOwnerdetails() {
		return ownerdetails;
	}

	/** 
	 * Set the ownerdetails.
	 * @param ownerdetails The ownerdetails to set
	 */
	public void setOwnerdetails(String ownerdetails) {
		this.ownerdetails = ownerdetails;
	}

	/** 
	 * Returns the osstatus.
	 * @return String
	 */
	public String getOsstatus() {
		return osstatus;
	}

	/** 
	 * Set the osstatus.
	 * @param osstatus The osstatus to set
	 */
	public void setOsstatus(String osstatus) {
		this.osstatus = osstatus;
	}

	/** 
	 * Returns the wsstatus.
	 * @return String
	 */
	public String getWsstatus() {
		return wsstatus;
	}

	/** 
	 * Set the wsstatus.
	 * @param wsstatus The wsstatus to set
	 */
	public void setWsstatus(String wsstatus) {
		this.wsstatus = wsstatus;
	}

	/** 
	 * Returns the dt.
	 * @return String
	 */
	public String getDt() {
		return dt;
	}

	/** 
	 * Set the dt.
	 * @param dt The dt to set
	 */
	public void setDt(String dt) {
		this.dt = dt;
	}

	
	public String getVtype() {
		return vtype;
	}

	/** 
	 * Set the dt.
	 * @param dt The dt to set
	 */
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	
	
	public String getNewservicedet() {
		return newservicedet;
	}

	/** 
	 * Set the dt.
	 * @param dt The dt to set
	 */
	public void setNewservicedet(String newservicedet) {
		this.newservicedet =newservicedet;
	}
	
	
	public String getServicevenue() {
		return servicevenue;
	}

	/** 
	 * Set the dt.
	 * @param dt The dt to set
	 */
	public void setServicevenue(String servicevenue) {
		this.servicevenue = servicevenue;
	}
	public String getServicedate() {
		return servicedate;
	}

	/** 
	 * Set the dt.
	 * @param dt The dt to set
	 */
	public void setServicedate(String servicedate) {
		this.servicedate = servicedate;
	}
	public String getServiceduration() {
		return serviceduration;
	}

	/** 
	 * Set the dt.
	 * @param dt The dt to set
	 */
	public void setServiceduration(String serviceduration) {
		this.serviceduration = serviceduration;
	}

	
	

}