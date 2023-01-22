/*
 * Created on Mar 3, 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nit.vehicle;
import javax.sql.*;
import java.sql.*;


/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AddInsuranceDAO {
	Connection con=null;
	public AddInsuranceDAO(DataSource ds)
	{
		try{
			
	
		con=ds.getConnection();
		System.out.println("Connection Established");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String addinsurance(AddInsuranceForm af)
	{
		
		try{
			PreparedStatement ps=con.prepareStatement("insert into vehicle_insurance_details values(?,?,?,?,?,?,?,?,?,?,?)");
		
		 ps.setString(1,af.getDt());
		    ps.setString(2,af.getVno());
		   ps.setString(3,af.getVtype());
		   ps.setString(4,af.getChasisno());
		   ps.setString(5,af.getOname());
		   ps.setString(6,af.getOaddress());
		   ps.setString(7,af.getOcontno());
		   ps.setString(8,af.getIcdetails());
		   ps.setString(9,af.getItype());
		   ps.setString(10,af.getIamount());
		   ps.setString(11,af.getExdate());
		   int i=ps.executeUpdate();
		   if(i==1)
		   	return "true";
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		   return "false";
		   
		   
	}
	
	public String viewinsurance(AddInsuranceForm af) 
	
	{
	
		try{
			
			
		
		
		
		PreparedStatement ps=con.prepareStatement("select * from vehicle_insurance_details where vno=?");
			System.out.println(af.getVno());
			ps.setString(1,af.getVno());
		ResultSet rs=ps.executeQuery();
		System.out.println(".........in execute qry.......");
		while(rs.next())
		{
			System.out.println(".........rs.next.......");
		af.setDt(rs.getString("dt"));
		af.setVno(rs.getString("vno"));
		af.setVtype(rs.getString("vtype"));
		af.setChasisno(rs.getString("chasisno"));
		af.setOname(rs.getString("oname"));
		af.setOaddress(rs.getString("oaddress"));
		af.setOcontno(rs.getString("ocontno"));
		af.setIcdetails(rs.getString("icdetails"));
		af.setItype(rs.getString("itype"));
		af.setIamount(rs.getString("iamount"));
        af.setExdate(rs.getString("exdate"));
        
	return "true";	
	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "false";

}
}