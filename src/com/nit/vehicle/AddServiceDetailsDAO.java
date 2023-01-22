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
public class AddServiceDetailsDAO {
	Connection con=null;
	ResultSet rs=null;
	public AddServiceDetailsDAO(DataSource ds)
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
	public String addservice(AddServiceDetailsForm af)
	{
		
		try{
			PreparedStatement ps=con.prepareStatement("insert into service_details values(?,?,?,?,?,?,?,?,?)");
		
		 ps.setString(1,af.getDt());
		    ps.setString(2,af.getWsstatus());
		   ps.setString(3,af.getOsstatus());
		   ps.setString(4,af.getOther());
		   ps.setString(5,af.getVpdate());
		   ps.setString(6,af.getVno());
		   ps.setString(7,af.getVtype());
		   ps.setString(8,af.getChasisno());
		   ps.setString(9,af.getOwnerdetails());
		   
		   
		   int i=ps.executeUpdate();
		   if(i==1)
		   	return "true";
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		   return "false";
		   
		   
	}
	
	public String viewservice(AddServiceDetailsForm af) 
	
	{
		try{
			
			
		
		
		
		PreparedStatement ps=con.prepareStatement("select * from service_details  where vno=?");
		ps.setString(1,af.getVno());
		
		 rs=ps.executeQuery();
		System.out.println(".........in execute qry.......");
		if(rs.next())
		{
		
		af.setDt(rs.getString("dt"));
		af.setWsstatus(rs.getString("wsstatus"));
		af.setOsstatus(rs.getString("osstatus"));
		af.setOther(rs.getString("other"));
		af.setVpdate(rs.getString("vpdate"));
		af.setVno(rs.getString("vno"));
		af.setVtype(rs.getString("vtype"));
		af.setChasisno(rs.getString("chasisno"));
		af.setOwnerdetails(rs.getString("ownerdetails"));
		
        
	return "true";	
	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "false";

}
	
	public String updateservice(AddServiceDetailsForm af)
	{
		try{
			
		
		PreparedStatement ps=con.prepareStatement("update service_details set  dt='"+af.getDt()+"',wsstatus='"+af.getWsstatus()+"',osstatus='"+af.getOsstatus()+"',other='"+af.getOther()+"',ownerdetails='"+af.getOwnerdetails()+"'where vno='"+af.getVno()+"'");
		int i=ps.executeUpdate();
		if(i==1)
			return "true";
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		  return "false";
		  
		  
		  
	}
	
public String   addNewservice(AddServiceDetailsForm af)	
{
	
	try{
		PreparedStatement ps=con.prepareStatement("insert into newservice_details values(?,?,?,?,?,?,?)");
		ps.setString(1,af.getDt());
	    ps.setString(2,af.getWsstatus());
	   ps.setString(3,af.getOsstatus());
	   ps.setString(4,af.getNewservicedet());
	   ps.setString(5,af.getServicevenue());
	   ps.setString(6,af.getServicedate());
	   ps.setString(7,af.getServiceduration());
	   
	   int i=ps.executeUpdate();
	   if(i==1)
	   	return "true";
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	   return "false";
	   
	}
}
