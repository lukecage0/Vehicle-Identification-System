//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-05-2007
 * 
 * XDoclet definition:
 * @struts:form name="NewUserForm"
 */
public class NewUserForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** orgname property */
	private String orgname;
	
	/** orgname property */
	private String utype;

	/** userid property */
	private String userid;

	/** pin property */
	private int pin;

	/** contno property */
	private int contno;

	/** desig property */
	private String desig;

	/** pass property */
	private String pass;

	/** addressproof property */
	private String addressproof;

	/** uaddress property */
	private String uaddress;

	/** photodetails property */
	private String photodetails;

	/** uname property */
	private String uname;

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
/*	public void reset(ActionMapping mapping, HttpServletRequest request) {

		throw new UnsupportedOperationException(
			"Generated method 'reset(...)' not implemented.");
	}*/

	/** 
	 * Returns the orgname.
	 * @return String
	 */
	public String getOrgname() {
		return orgname;
	}

	/** 
	 * Set the orgname.
	 * @param orgname The orgname to set
	 */
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	

	
	public String getUtype() {
		return orgname;
	}

	/** 
	 * Set the orgname.
	 * @param orgname The orgname to set
	 */
	public void setUtype(String utype) {
		this.utype = utype;
	}

	
	
	
	
	
	/** 
	 * Returns the userid.
	 * @return String
	 */
	public String getUserid() {
		return userid;
	}

	/** 
	 * Set the userid.
	 * @param userid The userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/** 
	 * Returns the pin.
	 * @return int
	 */
	public int getPin() {
		return pin;
	}

	/** 
	 * Set the pin.
	 * @param pin The pin to set
	 */
	public void setPin(int pin) {
		this.pin = pin;
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
	 * Returns the desig.
	 * @return String
	 */
	public String getDesig() {
		return desig;
	}

	/** 
	 * Set the desig.
	 * @param desig The desig to set
	 */
	public void setDesig(String desig) {
		this.desig = desig;
	}

	/** 
	 * Returns the pass.
	 * @return String
	 */
	public String getPass() {
		return pass;
	}

	/** 
	 * Set the pass.
	 * @param pass The pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/** 
	 * Returns the addressproof.
	 * @return String
	 */
	public String getAddressproof() {
		return addressproof;
	}

	/** 
	 * Set the addressproof.
	 * @param addressproof The addressproof to set
	 */
	public void setAddressproof(String addressproof) {
		this.addressproof = addressproof;
	}

	/** 
	 * Returns the uaddress.
	 * @return String
	 */
	public String getUaddress() {
		return uaddress;
	}

	/** 
	 * Set the uaddress.
	 * @param uaddress The uaddress to set
	 */
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	/** 
	 * Returns the photodetails.
	 * @return String
	 */
	public String getPhotodetails() {
		return photodetails;
	}

	/** 
	 * Set the photodetails.
	 * @param photodetails The photodetails to set
	 */
	public void setPhotodetails(String photodetails) {
		this.photodetails = photodetails;
	}

	/** 
	 * Returns the uname.
	 * @return String
	 */
	public String getUname() {
		return uname;
	}

	/** 
	 * Set the uname.
	 * @param uname The uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

}