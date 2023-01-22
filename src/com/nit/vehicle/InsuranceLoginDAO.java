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
public class InsuranceLoginDAO {
	
    Connection con=null;
     public InsuranceLoginDAO(DataSource ds){
    	try {
    		con=ds.getConnection();
    		System.out.println(".........coneection established........");
    	    }
    	catch(Exception e){}
    }
   
	public boolean  insurancelogin(InsuranceLoginForm ilf)
	{
		try {
			Statement st=con.createStatement();
			System.out.println(ilf.getUsername());
			System.out.println(ilf.getPassword());
			ResultSet rs=st.executeQuery("select * from insurancelogintable where username='"+ilf.getUsername()+"' and password='"+ilf.getPassword()+"'");
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

	

	