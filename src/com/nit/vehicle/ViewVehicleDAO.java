/*
 * Created on Jan 31, 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nit.vehicle;
import java.sql.*;
import javax.sql.*;
/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ViewVehicleDAO {
	
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	public ViewVehicleDAO()
	{
	}
	public boolean viewdetails(ViewVehicleForm vvf) throws Exception
	{
		try {
			
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@server:1521:server","vehicle1","vehicle");
		System.out.println("......connection created.......");
		  
		ps=con.prepareStatement("select * from vehicledetailsp where vno=?");
		
		ps.setString(1,vvf.getVno());
		
		 rs=ps.executeQuery();
		 System.out.println("..........inexecuteqryy....");
		if(rs.next())
		{
			 System.out.println("..........innext...");
			vvf.setVno(rs.getString("vno"));
			vvf.setVtype(rs.getString("vtype"));
			vvf.setVdetails(rs.getString("vdetails"));
	
			vvf.setVcolor(rs.getString("vcolor"));
			vvf.setOname(rs.getString("oname"));
			vvf.setOaddress(rs.getString("oaddress"));
			vvf.setOphno(rs.getString("ophno"));
		
			return true;
		}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
		
		
	}
}
	