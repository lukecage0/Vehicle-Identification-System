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
 * @struts:form name="VehicleRegistrationForm"
 */
public class VehicleRegistrationForm extends ActionForm 
{

	// --------------------------------------------------------- Instance Variables

	/** chasisno property */
	private String chasisno;

	/** vno property */
	private String vno;

	/** pinno property */
	private int pinno;

	/** fuel property */
	private String fuel;

	/** emailid property */
	private String emailid;

	/** eno property */
	private String eno;

	/** oaddress property */
	private String oaddress;

	/** vtype property */
	private String vtype;

	/** oname property */
	private String oname;

	/** oaddressproof property */
	private String oaddressproof;

	/** pdate property */
	private String pdate;

	/** vmodel property */
	private String vmodel;

	/** makerclassification property */
	private String makerclassification;

	/** vcolor property */
	private String vcolor;

	/** ocontno property */
	private String ocontno;

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
	 * Returns the fuel.
	 * @return String
	 */
	public String getFuel() {
		return fuel;
	}

	/** 
	 * Set the fuel.
	 * @param fuel The fuel to set
	 */
	public void setFuel(String fuel) {
		this.fuel = fuel;
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
	 * @return String
	 */
	public String getEno() {
		return eno;
	}

	/** 
	 * Set the eno.
	 * @param eno The eno to set
	 */
	public void setEno(String eno) {
		this.eno = eno;
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
	 * Returns the oaddressproof.
	 * @return String
	 */
	public String getOaddressproof() {
		return oaddressproof;
	}

	/** 
	 * Set the oaddressproof.
	 * @param oaddressproof The oaddressproof to set
	 */
	public void setOaddressproof(String oaddressproof) {
		this.oaddressproof = oaddressproof;
	}

	/** 
	 * Returns the pdate.
	 * @return String
	 */
	public String getPdate() {
		return pdate;
	}

	/** 
	 * Set the pdate.
	 * @param pdate The pdate to set
	 */
	public void setPdate(String pdate) {
		this.pdate = pdate;
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
	 * Returns the makerclassification.
	 * @return String
	 */
	public String getMakerclassification() {
		return makerclassification;
	}

	/** 
	 * Set the makerclassification.
	 * @param makerclassification The makerclassification to set
	 */
	public void setMakerclassification(String makerclassification) {
		this.makerclassification = makerclassification;
	}

	/** 
	 * Returns the vcolor.
	 * @return String
	 */
	public String getVcolor() {
		return vcolor;
	}

	/** 
	 * Set the vcolor.
	 * @param vcolor The vcolor to set
	 */
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}

	/** 
	 * Returns the ocontno.
	 * @return int
	 */
	public String getOcontno() {
		return ocontno;
	}

	/** 
	 * Set the ocontno.
	 * @param ocontno The ocontno to set
	 */
	public void setOcontno(String ocontno) {
		this.ocontno = ocontno;
	}

}