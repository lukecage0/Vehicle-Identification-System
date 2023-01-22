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
/** 
* MyEclipse Struts
* Creation date: 02-20-2007
* 
* XDoclet definition:
* @struts:action path="/noticeboardmsg" name="NoticeBoardMsgForm" scope="request" validate="true"
* @struts:action-forward name="success" path="/NoticeBoardMsgSuccess.jsp"
* @struts:action-forward name="fail" path="/NoticeBoardMsgFail.jsp"
*/
public class MsgToNoticeBoardAction extends Action {

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
		MsgToNoticeBoardForm nbmf = (MsgToNoticeBoardForm) form;
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@server:1521:server","vehicle1","vehicle");
		DataSource ds=getDataSource(request);
		Connection con=ds.getConnection();
		System.out.println("---connection established---");
		PreparedStatement ps=con.prepareStatement("insert into noticeboardmessages values(noticeboardmsgseq.nextVal,?,?,?,?)");
		
		ps.setString(1,nbmf.getFromtype());
		ps.setString(2,nbmf.getSubject());
		ps.setString(3,nbmf.getSenddate());
		ps.setString(4,nbmf.getMsgdes());
		int i=ps.executeUpdate();
		if(i>0){
			System.out.println("record successfully inserted");
			return mapping.findForward("success");
		}
		return mapping.findForward("fail");
		
	}

}