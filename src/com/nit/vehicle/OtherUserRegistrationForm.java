//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-09-2007
 * 
 * XDoclet definition:
 * @struts:form name="OtherUserRegistrationForm"
 */
public class OtherUserRegistrationForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** password property */
	private String password;

	/** orgname property */
	private String orgname;

	/** userid property */
	private String userid;

	/** pinno property */
	private int pinno;

	/** emailid property */
	private String emailid;

	/** contno property */
	private int contno;

	/** designation property */
	private String designation;

	/** address property */
	private String address;

	/** username property */
	private String username;

	/** addressproof property */
	private String addressproof;

	/** photodetails property */
	private String photodetails;

	/** usertype property */
	private String usertype;

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
	 * Returns the username.
	 * @return String
	 */
	public String getUsername() {
		return username;
	}

	/** 
	 * Set the username.
	 * @param username The username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * Returns the usertype.
	 * @return String
	 */
	public String getUsertype() {
		return usertype;
	}

	/** 
	 * Set the usertype.
	 * @param usertype The usertype to set
	 */
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

}