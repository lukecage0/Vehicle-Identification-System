//Created by MyEclipse Struts
//XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;
import javax.sql.*;
import java.util.*;

/** 
* MyEclipse Struts
* Creation date: 02-21-2007
* 
* XDoclet definition:
* @struts:action path="/viewnoticeboardmsg" name="NoticeBoardMsgForm" scope="request" validate="true"
* @struts:action-forward name="success" path="/ViewNoticeBoardMsgResponse.jsp"
*/
public class ViewNoticeBoardMsgAction extends Action {

	// --------------------------------------------------------- Instance Variables

	// --------------------------------------------------------- Methods

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)throws Exception {
		System.out.println(1);
		MsgToNoticeBoardForm mf= (MsgToNoticeBoardForm) form;
		System.out.println(2);
		
		messageDAO mdao=new messageDAO(getDataSource(request));
		
		Collection v=mdao.viewnoticemessages(mf);
	
	//	String query="select * from noticeboardmessages";
		//Statement st=con.createSta;;tement();
		//ResultSet rs=st.executeQuery(query);
		/*while(rs.next()){
			MsgToNoticeBoardForm nbmf1=new MsgToNoticeBoardForm();
			nbmf1.setMessageid(rs.getString(1));
			nbmf1.setFromtype(rs.getString(2));
			nbmf1.setSubject(rs.getString(3));
			nbmf1.setSenddate(rs.getString(4));
			nbmf1.setMsgdes(rs.getString(5));
			v.add(nbmf1);
			}*/
		System.out.println(v.size());
		request.setAttribute("messages",v);
		return mapping.findForward("success");
		}
	}