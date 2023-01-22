//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-28-2007
 * 
 * XDoclet definition:
 * @struts:form name="messagesForm"
 */
public class MessagesForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** user_type property */
	private String user_type;

	/** subject property */
	private String subject;

	/** to_id property */
	private String to_id;

	/** messgae property */
	private String messgae;
	/**
	 * @return Returns the mid.
	 */
	public String getMid() {
		return mid;
	}
	/**
	 * @param mid The mid to set.
	 */
	public void setMid(String mid) {
		this.mid = mid;
	}
	private String mid;
	/**
	 * @return Returns the date.
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date The date to set.
	 */
	public void setDate(String date) {
		this.date = date;
	}
	private String date;

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

		return  null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	
	/** 
	 * Returns the user_type.
	 * @return String
	 */
	public String getUser_type() {
		return user_type;
	}

	/** 
	 * Set the user_type.
	 * @param user_type The user_type to set
	 */
	public void setUser_type(String user_type) {
		this.user_type = user_type;
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

	/** 
	 * Returns the to_id.
	 * @return String
	 */
	public String getTo_id() {
		return to_id;
	}

	/** 
	 * Set the to_id.
	 * @param to_id The to_id to set
	 */
	public void setTo_id(String to_id) {
		this.to_id = to_id;
	}

	/** 
	 * Returns the messgae.
	 * @return String
	 */
	public String getMessgae() {
		return messgae;
	}

	/** 
	 * Set the messgae.
	 * @param messgae The messgae to set
	 */
	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}

}