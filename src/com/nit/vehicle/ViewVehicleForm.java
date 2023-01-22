//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-02-2007
 * 
 * XDoclet definition:
 * @struts:form name="ViewVehicleForm"
 */
public class ViewVehicleForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables
     private String cdate;    
	/** vno property */
	private String vno;
	/** ctype property */
	private String ctype;
	
	private String fine;

	/** vdetails property */
	private String vdetails;

	/** oaddress property */
	private String oaddress;

	/** vtype property */
	private String vtype;

	/** oname property */
	private String oname;

	/** ophno property */
	private String ophno;

	/** vcolor property */
	private String vcolor;

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


public String getCtype() {
	return ctype;
}

/** 
 * Set the vcolor.
 * @param vcolor The vcolor to set
 */
public  void setCtype(String ctype) {
	this.ctype = ctype;
}
public String getFine() {
	return fine;
}

/** 
 * Set the vcolor.
 * @param vcolor The vcolor to set
 */
public  void setFine(String fine) {
	this.fine = fine;
}
public String getCdate() {
	return cdate;
}

/** 
 * Set the vcolor.
 * @param vcolor The vcolor to set
 */
public  void setCdate(String fine) {
	this.cdate = cdate;
}







}

