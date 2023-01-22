//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 01-10-2007
 * 
 * XDoclet definition:
 * @struts:form name="BranchBeanForm1"
 */
public class BranchBeanForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** pin property */
	private int pin;

	/** baddress property */
	private String baddress;

	/** bid property */
	private int bid;

	/** contno property */
	private int contno;

	/** bloc property */
	private String bloc;

	/** bname property */
	private String bname;

	/** oname property */
	private String oname;

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

		
		ActionErrors ae = new ActionErrors();
		
		if(getBname()==null||getBname().equals("")){
		ae.add("formerror",new ActionError("bname.notnull.error"));
		return ae;
	}//if
		
		
		if (getOname()==null||getOname().equals("")){
		ae.add("formerror",new ActionError("bloc.notnull.error"));
		}
		return ae;
		
		}//if
			
		
	
		
		
		
	

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
	 * Returns the baddress.
	 * @return String
	 */
	public String getBaddress() {
		return baddress;
	}

	/** 
	 * Set the baddress.
	 * @param baddress The baddress to set
	 */
	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}

	/** 
	 * Returns the bid.
	 * @return int
	 */
	public int getBid() {
		return bid;
	}

	/** 
	 * Set the bid.
	 * @param bid The bid to set
	 */
	public void setBid(int bid) {
		this.bid = bid;
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
	 * Returns the bloc.
	 * @return String
	 */
	public String getBloc() {
		return bloc;
	}

	/** 
	 * Set the bloc.
	 * @param bloc The bloc to set
	 */
	public void setBloc(String bloc) {
		this.bloc = bloc;
	}

	/** 
	 * Returns the bname.
	 * @return String
	 */
	public String getBname() {
		return bname;
	}

	/** 
	 * Set the bname.
	 * @param bname The bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
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
}