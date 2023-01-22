//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-10-2007
 * 
 * XDoclet definition:
 * @struts:form name="AddVehicleDetailsForm"
 */
public class AddVehicleDetailsForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** insurancedetails property */
	private String insurancedetails;

	/** pdate property */
	private String pdate;
	
	/** vno property */
	private String vno;

	/** pinno property */
	private int pinno;

	/** emailid property */
	private String emailid;

	/** eno property */
	private int eno;

	/** vdetails property */
	private String vdetails;

	/** contno property */
	private int contno;

	/** oaddress property */
	private String oaddress;

	/** oname property */
	private String oname;

	/** vmodel property */
	private String vmodel;

	// --------------------------------------------------------- Methods

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
/*	public ActionErrors validate(
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
	 * Returns the insurancedetails.
	 * @return String
	 */
	public String getInsurancedetails() {
		return insurancedetails;
	}

	/** 
	 * Set the insurancedetails.
	 * @param insurancedetails The insurancedetails to set
	 */
	public void setInsurancedetails(String insurancedetails) {
		this.insurancedetails = insurancedetails;
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
	 * Returns the pinno.
	 * @return int
	 */
	public int getPinno() {
		return pinno;
	}

	/** 
	 * Set the pinno.
	 * @param pinno The pinno to set
	 */
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}

	/** 
	 * Returns the emailid.
	 * @return String
	 */
	public String getEmailid() {
		return emailid;
	}

	/** 
	 * Set the emailid.
	 * @param emailid The emailid to set
	 */
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	/** 
	 * Returns the eno.
	 * @return int
	 */
	public int getEno() {
		return eno;
	}

	/** 
	 * Set the eno.
	 * @param eno The eno to set
	 */
	public void setEno(int eno) {
		this.eno = eno;
	}

	/** 
	 * Returns the vdetails.
	 * @return String
	 */
	public String getVdetails() {
		return vdetails;
	}

	/** 
	 * Set the vdetails.
	 * @param vdetails The vdetails to set
	 */
	public void setVdetails(String vdetails) {
		this.vdetails = vdetails;
	}

	/** 
	 * Returns the contno.
	 * @return int
	 */
	public int getContno() {
		return contno;
	}

	/** 
	 * Set the contno.
	 * @param contno The contno to set
	 */
	public void setContno(int contno) {
		this.contno = contno;
	}

	/** 
	 * Returns the oaddress.
	 * @return String
	 */
	public String getOaddress() {
		return oaddress;
	}

	/** 
	 * Set the oaddress.
	 * @param oaddress The oaddress to set
	 */
	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}

	/** 
	 * Returns the oname.
	 * @return String
	 */
	public String getOname() {
		return oname;
	}

	/** 
	 * Set the oname.
	 * @param oname The oname to set
	 */
	public void setOname(String oname) {
		this.oname = oname;
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
	
	public String getPdate() {
		return pdate;
	}

	/** 
	 * Set the vmodel.
	 * @param vmodel The vmodel to set
	 */
	public void setPdate(String pdate) 
	{
		this.pdate = pdate;
	}

}