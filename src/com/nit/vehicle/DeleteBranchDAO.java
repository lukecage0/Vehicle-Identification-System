/*
 * Created on Jan 19, 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nit.vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DeleteBranchDAO {
	
	  Connection con=null;
	    
	    
	    public DeleteBranchDAO(DataSource ds){
	    	try{
	    		con=ds.getConnection();
	    		System.out.println("coneection established");
	    	}
	    	catch(Exception e){}
	    }
	    
		
		
		public String  deletebranch(BranchBeanForm  fb)
		{
			try{
				
		
		
					int bid=0;
	    PreparedStatement ps=con.prepareStatement("delete from btable where bid="+bid);

		ps.setInt(1,fb.getBid());	
	    ps.setString(1,fb.getBname());
	    ps.setString(2,fb.getBloc());
	    ps.setString(3,fb.getBaddress());
	    ps.setInt(4,fb.getPin());
	    ps.setString(5,fb.getOname());
	    ps.setInt(6,fb.getContno());
	   System.out.println("***********inexecuteupdate()**********");
	    int i=ps.executeUpdate();
		if(i==1)
			//return (new Integer(fb.getBid()).toString());
			
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


		

		


