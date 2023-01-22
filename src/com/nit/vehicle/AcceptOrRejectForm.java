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
 * Creation date: 02-22-2007
 * 
 * XDoclet definition:
 * @struts:form name="AcceptOrRejectForm"
 */
public class AcceptOrRejectForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** password property */
	private String password;

	private String workorggdet;
	/** phno property */
	private String phno;

	/** lname property */
	private String lname;

	/** userid property */
	private String userid;

	/** age property */
	private String age;

	/** utype property */
	private String utype;

	/** fname property */
	private String fname;

	/** designation property */
	private String designation;

	/** address property */
	private String address;

	/** addressproof property */
	private String addressproof;

	/** dt property */
	private String dt;

	private String workorgdet;

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
		ActionErrors  ae=new ActionErrors();
		if(getFname()==null || getFname().equals(""))
		ae.add("formerror",new ActionError("fname.notnull"));
		if(getDt()==null||getDt().equals(""))
			ae.add("formerror",new ActionError("dt.notnull"));
		
		
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
	 * Returns the password.
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Set the password.
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	 * Returns the phno.
	 * @return int
	 */
	public String getPhno() {
		return phno;
	}

	/** 
	 * Set the phno.
	 * @param phno The phno to set
	 */
	public void setPhno(String phno) {
		this.phno = phno;
	}

	/** 
	 * Returns the lname.
	 * @return String
	 */
	public String getLname() {
		return lname;
	}

	/** 
	 * Set the lname.
	 * @param lname The lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
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
	 * Returns the age.
	 * @return String
	 */
	public String getAge() {
		return age;
	}

	/** 
	 * Set the age.
	 * @param age The age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/** 
	 * Returns the utype.
	 * @return String
	 */
	public String getUtype() {
		return utype;
	}

	/** 
	 * Set the   utype.
	 * @param utype The utype to set
	 */
	public void setUtype(String utype) {
		this.utype = utype;
	}

	/** 
	 * Returns the fname.
	 * @return String
	 */
	public String getFname() {
		return fname;
	}

	/** 
	 * Set the fname.
	 * @param fname The fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/** 
	 * Returns the designation.
	 * @return String
	 */
	public String getDesignation() {
		return designation;
	}

	/** 
	 * Set the designation.
	 * @param designation The designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/** 
	 * Returns the address.
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/** 
	 * Set the address.
	 * @param address The address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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

	
	public String getWorkorgdet() {
		return workorgdet;
	}

	/** 
	 * Set the dt.
	 * @param dt The dt to set
	 */
	public void setWorkorgdet(String workorgdet) {
		this.workorgdet = workorgdet;
	}

}