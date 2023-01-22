/*
 * Created on Jan 10, 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nit.vehicle;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;
/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class WorkshopLoginDAO {
	
    Connection con=null;
     public WorkshopLoginDAO(DataSource ds){
    	try {
    		con=ds.getConnection();
    		System.out.println(".........coneection established........");
    	    }
    	catch(Exception e){}
    }
   
	public boolean  workshoplogin(WorkshopLoginForm wlf)
	{
		try{
			Statement st=con.createStatement();
			System.out.println(wlf.getUsername());
			System.out.println(wlf.getPassword());
			ResultSet rs=st.executeQuery("select * from workshoplogin where username='"+wlf.getUsername()+"' and password='"+wlf.getPassword()+"'");
			 if(rs.next())
			 {
			 	System.out.println("***********inexecuteQuery()**********");
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

	

	