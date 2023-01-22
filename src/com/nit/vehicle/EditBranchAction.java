//Created by MyEclipse Struts
//XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/** 
* MyEclipse Struts
* Creation date: 01-11-2007
* 
* XDoclet definition:
* @struts:action path="/login" name="StudentDetailsForm" scope="request" validate="true"
* @struts:action-forward name="success" path="/updateStudentDetails.jsp"
* @struts:action-forward name="fail" path="/EditStudentDetails.jsp"
*/
public class EditBranchAction extends Action {

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
		BranchBeanForm fb = (BranchBeanForm) form;
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
				try
				{	Class.forName("oracle.jdbc.driver.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@server:1521:server","scott","tiger");
					ps=con.prepareStatement("select * from btable where bid=?" );
					ps.setInt(1,fb.getBid());
					 rs=ps.executeQuery();
					if(rs.next())
					{
						fb.setBname(rs.getString("bname"));
						fb.setBloc(rs.getString("baddress"));
						fb.setBaddress(rs.getString("bloc"));
						fb.setPin(rs.getInt("pin"));
						fb.setOname(rs.getString("oname"));
						fb.setContno(rs.getInt("contno"));
					
					return mapping.findForward("success");
					}
			else{return mapping.findForward("fail");}
				}finally{
			try
			{
			con.close();}catch(Exception e){}
				}//finally
			}
}


