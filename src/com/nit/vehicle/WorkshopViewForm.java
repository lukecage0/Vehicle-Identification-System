//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-07-2007
 * 
 * XDoclet definition:
 * @struts:form name="WorkshopViewForm"
 */
public class WorkshopViewForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** vpdate property */
	private String vpdate;

	/** vdetails property */
	private String vdetails;

	/** oaddress property */
	private String oaddress;

	/** oname property */
	private String oname;

	/** ophno property */
	private String ophno;

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

		throw new UnsupportedOperationException(
			"Generated method 'validate(...)' not implemented.");
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		throw new UnsupportedOperationException(
			"Generated method 'reset(...)' not implemented.");
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
	 * Returns the ophno.
	 * @return String
	 */
	public String getOphno() {
		return ophno;
	}

	/** 
	 * Set the ophno.
	 * @param ophno The ophno to set
	 */
	public void setOphno(String ophno) {
		this.ophno = ophno;
	}

}