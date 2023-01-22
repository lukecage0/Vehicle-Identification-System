//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-21-2007
 * 
 * XDoclet definition:
 * @struts:form name="gotonewadminForm"
 */
public class NewAdminForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** workbrandet property */
	private String workbrandet;

	/** lname property */
	private String lname;

	/** userid property */
	private String userid;

	/** contactNo property */
	private String contactNo;

	/** fname property */
	private String fname;

	/** desig property */
	private String desig;

	/** pass property */
	private String pass;

	/** address property */
	private String address;

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
	 * Returns the workbrandet.
	 * @return String
	 */
	public String getWorkbrandet() {
		return workbrandet;
	}

	/** 
	 * Set the workbrandet.
	 * @param workbrandet The workbrandet to set
	 */
	public void setWorkbrandet(String workbrandet) {
		this.workbrandet = workbrandet;
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
	 * Returns the contactNo.
	 * @return String
	 */
	public String getContactNo() {
		return contactNo;
	}

	/** 
	 * Set the contactNo.
	 * @param contactNo The contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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

}