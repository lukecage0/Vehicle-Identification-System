/*
 * Created on Feb 1, 2007
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
public class WorkShopDAO {
	Connection con=null;
	PreparedStatement ps=null;
	 public WorkShopDAO(DataSource  ds) 
	 
	 {
	 	try{
	 	con=ds.getConnection();
	 	System.out.println(".....connection created......");
	 
}
	 catch(Exception e)
	 {
	 	e.printStackTrace();
	 	return null;
	 }
	  
	 
	 public  String insertservicedetails(WorkShopVehicleForm wsvf)
	 {
	 	
	 	try{
	 	  PreparedStatement ps=con.prepareStatement("insert into btable values(sone.nextVal,?,?,?,?,?,?)");

	 		//ps.setInt(1,fb.getBid());	
	 	    ps.setString(1,wsvf.getOname());
	 	    ps.setString(2,wsvf.getOaddress());
	 	   ps.setString(3,wsvf.getVno());
	 	    ps.setString(4,wsvf.getVpdate());
	 	    ps.setInt(5,wsvf.getOphno());
	 	    ps.setString(6,wsvf.getSevicestatus());
	 	    
	 	   System.out.println("***********inexecuteupdate()**********");
	 	    int i=ps.executeUpdate();
	 		if(i==1)
	 			
	 	    return "true";
	 	
	 	}
	 			catch(Exception e)
	 			{
	 				e.printStackTrace();
	 				
	 			}
	 			return "false";


	 	}


	 		

	 		
	 }

}
