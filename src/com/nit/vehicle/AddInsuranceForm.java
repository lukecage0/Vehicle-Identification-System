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
 * Creation date: 03-03-2007
 * 
 * XDoclet definition:
 * @struts:form name="AddInsuranceForm"
 */
public class AddInsuranceForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** chasisno property */
	private String chasisno;

	/** vno property */
	private String vno;

	/** itype property */
	private String itype;

	/** exdate property */
	private String exdate;
	private String icdetails;

	/** oaddress property */
	private String oaddress;

	/** iamount property */
	private String iamount;

	/** vtype property */
	private String vtype;

	/** oname property */
	private String oname;

	/** dt property */
	private String dt;

	/** ocontno property */
	private String ocontno;

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
		if(getVno()==null||getVno().equals(""))
			ae.add("formerror",new ActionError("vno.notnull"));
		return ae;

	}
	


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
	 * Returns the itype.
	 * @return String
	 */
	public String getItype() {
		return itype;
	}

	/** 
	 * Set the itype.
	 * @param itype The itype to set
	 */
	public void setItype(String itype) {
		this.itype = itype;
	}

	/** 
	 * Returns the exdate.
	 * @return String
	 */
	public String getExdate() {
		return exdate;
	}

	/** 
	 * Set the exdate.
	 * @param exdate The exdate to set
	 */
	public void setExdate(String exdate) {
		this.exdate = exdate;
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
	 * Returns the iamount.
	 * @return String
	 */
	public String getIamount() {
		return iamount;
	}

	/** 
	 * Set the iamount.
	 * @param iamount The iamount to set
	 */
	public void setIamount(String iamount) {
		this.iamount = iamount;
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

	/** 
	 * Returns the ocontno.
	 * @return String
	 */
	public String getOcontno() {
		return ocontno;
	}

	/** 
	 * Set the ocontno.
	 * @param ocontno The ocontno to set
	 */
	public void setIcdetails(String icdetails) {
		this.icdetails = icdetails;
	}
	
	public String getIcdetails() {
		return icdetails;
	}

	/** 
	 * Set the ocontno.
	 * @param ocontno The ocontno to set
	 */
	public void setOcontno(String ocontno) {
		this.ocontno = ocontno;
	}

}