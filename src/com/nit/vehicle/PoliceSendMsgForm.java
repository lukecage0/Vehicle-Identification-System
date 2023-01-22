//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-26-2007
 * 
 * XDoclet definition:
 * @struts:form name="PoliceSendMsgForm"
 */
public class PoliceSendMsgForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** to property */
	private String to;

	/** from  property */
	private String from;

	/** description property */
	private String description;

	/** dt property */
	private String dt;

	/** subject property */
	private String subject;

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
	 * Returns the to.
	 * @return String
	 */
	public String getTo() {
		return to;
	}

	/** 
	 * Set the to.
	 * @param to The to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/** 
	 * Returns the from .
	 * @return String
	 */
	public String getFrom() {
		return from;
	}

	/** 
	 * Set the from .
	 * @param from  The from  to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/** 
	 * Returns the description.
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/** 
	 * Set the description.
	 * @param description The description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * Returns the subject.
	 * @return String
	 */
	public String getSubject() {
		return subject;
	}

	/** 
	 * Set the subject.
	 * @param subject The subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

}