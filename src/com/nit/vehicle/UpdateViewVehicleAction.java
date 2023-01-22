//Created by MyEclipse Struts
//XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.8.4/xslt/JavaClass.xsl

package com.nit.vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
* @struts:action path="/update" name="StudentDetailsForm" scope="request" validate="true"
* @struts:action-forward name="success" path="/Updatesuccess.jsp"
* @struts:action-forward name="fail" path="/updateStudentDetails.jsp"
*/
public class UpdateViewVehicleAction extends Action {

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
		HttpServletResponse response) {
		System.out.println(".......inexecute()....");
		VehicleRegistrationForm vf = (VehicleRegistrationForm) form;
		
		AddVehicleDetailsDAO udao=new AddVehicleDetailsDAO(getDataSource(request));
		
		String result= udao.updateviewvehicle(vf);
		System.out.println(".......inupadatemethod()....");
		
	    if(result.equals("true"))
	    return  mapping.findForward("success");
    return  mapping.findForward("fail");
		
	}
}
		
		/*Connection con=null;
		PreparedStatement ps=null;
				try
				{	Class.forName("oracle.jdbc.driver.OracleDriver");
					con=DriverManager.getConnection("jdbc:oracle:thin:@server:@1521:server","scott","tiger");
					System.out.println(".....connnection  in update().........");
					int n=fb.getBid();
					System.out.println(n);
					ps=con.prepareStatement("update btable set bname=?,bloc=?,baddress=?,pin=?,oname=?,contno=? where bid="+n);
					ps.setInt(1,fb.getBid());
					ps.setString(2,fb.getBname());
					ps.setString(3,fb.getBloc());
					ps.setString(4,fb.getBaddress());
					ps.setInt(5,fb.getPin());
					ps.setString(6,fb.getOname());
					ps.setInt(7,fb.getContno());
					 int i=ps.executeUpdate();
					 if(i>=1)
					 	System.out.println(".......record insretred suc'fully.......");
					 return mapping.findForward("success");
				}
				catch(Exception e){}
			return mapping.findForward("fail");
	}

}*/