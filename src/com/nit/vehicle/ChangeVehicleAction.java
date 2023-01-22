
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
						public class ChangeVehicleAction extends Action {

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
								VehicleRegistrationForm vvf = (VehicleRegistrationForm) form;
								Connection con=null;
								PreparedStatement pst=null;
										try
										{	Class.forName("oracle.jdbc.driver.OracleDriver");
										con=DriverManager.getConnection("jdbc:oracle:thin:@server:1521:server","scott","tiger");
											String n=vvf.getVno();
											System.out.println(n);
pst=con.prepareStatement("update vehicle_reg_details set vno=?,eno=?,chasisno=?,vtype=?,vcolor=?,vmodel=?,makerclasification=?,pdate=?,fuel=?,oname=?,oaddress=?,oaddressproof=? +ocontno=?,emailid=?,pinno=? where vno="+n);
													
													 
pst.getString("vno")
vvf.setVno();
System.out.println(pst.getString("vno"));
vvf.setEno(pst.getString("eno"));
			   vvf.setChasisno(pst.getString("chasisno"));
			   vvf.setVtype(2,pst.getString());
	   vvf.setVcolor(pst.getString("vcolor"));
		   vvf.setVmodel(pst.getString("vmodel"));
		   vvf.setMakerclassification(pst.getString("makerclasification"));
		  vvf.setPdate(pst.getString("pdate"));
		  vvf.setFuel(pst.getString("fuel"));
		  vvf.setOname(pst.getString("oname"));
	vvf.setOaddress(pst.getString("oaddress"));
	  vvf.setOaddressproof(pst.getString("oaddressproof"));
	    vvf.setOcontno(pst.getString("ocontno"));
	    vvf.setEmailid(pst.getString("emailid"));
	    vvf.setPinno(pst.getInt("pinno"));
		 int i=pst.executeUpdate();
		 if(i>=1)
		 return mapping.findForward("success");
	}catch(Exception e){}
return mapping.findForward("fail");
}

} 									  