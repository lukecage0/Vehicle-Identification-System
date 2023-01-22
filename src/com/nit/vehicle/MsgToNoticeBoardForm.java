//Created by MyEclipse Struts
//XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import org.apache.struts.action.ActionForm;

/** 
* MyEclipse Struts
* Creation date: 02-20-2007
* 
* XDoclet definition:
* @struts:form name="NoticeBoardMsgForm"
*/
public class MsgToNoticeBoardForm extends ActionForm {

	// --------------------------------------------------------- Instance Variables

	/** senddate property */
	private String senddate;

	/** messageid property */
	private String messageid;

	/** msgdes property */
	private String msgdes;

	/** subject property */
	private String subject;

	/** fromtype property */
	private String fromtype;

	// --------------------------------------------------------- Methods

	/** 
	 * Returns the senddate.
	 * @return String
	 */
	public String getSenddate() {
		return senddate;
	}

	/** 
	 * Set the senddate.
	 * @param senddate The senddate to set
	 */
	public void setSenddate(String senddate) {
		this.senddate = senddate;
	}

	/** 
	 * Returns the messageid.
	 * @return String
	 */
	public String getMessageid() {
		return messageid;
	}

	/** 
	 * Set the messageid.
	 * @param messageid The messageid to set
	 */
	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}

	/** 
	 * Returns the msgdes.
	 * @return String
	 */
	public String getMsgdes() {
		return msgdes;
	}

	/** 
	 * Set the msgdes.
	 * @param msgdes The msgdes to set
	 */
	public void setMsgdes(String msgdes) {
		this.msgdes = msgdes;
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
	 * Returns the fromtype.
	 * @return String
	 */
	public String getFromtype() {
		return fromtype;
	}

	/** 
	 * Set the fromtype.
	 * @param fromtype The fromtype to set
	 */
	public void setFromtype(String fromtype) {
		this.fromtype = fromtype;
	}

}