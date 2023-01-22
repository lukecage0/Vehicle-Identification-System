/*
 * Created on Feb 21, 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nit.vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.sql.*;
import javax.sql.DataSource;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class NewAdminDAO {
	
	Connection con=null;
    
    
    public NewAdminDAO(DataSource ds){
    	try{
    		con=ds.getConnection();
    		System.out.println("coneection established");
    	}
    	catch(Exception e){}
    }
    
	
	
	public String  newadmincreation(NewAdminForm  nf)
	{
		try{
			
	
	

    PreparedStatement ps=con.prepareStatement("insert into newadmin values(?,?,?,?,?,?,?,?)");

	//ps.setInt(1,fb.getBid());	
    ps.setString(1,nf.getFname());
    ps.setString(2,nf.getLname());
    ps.setString(3,nf.getDesig());
    ps.setString(4,nf.getAddress());
    ps.setString(5,nf.getContactNo());
    ps.setString(6,nf.getWorkbrandet());
    ps.setString(7,nf.getUserid());
    ps.setString(8,nf.getPass());
    
   
   System.out.println("***********inexecuteupdate()**********");
    int i=ps.executeUpdate();
	if(i==1)
		
    return "true";
	return "false";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

	

}
