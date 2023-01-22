/*
 * Created on Jan 10, 2007
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
public class UpdateBranchActionDAO {
	
    Connection con=null;
    
    
    public UpdateBranchActionDAO(DataSource ds){
    	try{
    		con=ds.getConnection();
    		System.out.println("coneection established");
    	}
    	catch(Exception e){}
    }
    
	
	
	public String  updatebranch(BranchBeanForm  fb)
	{
		try{
			
	
	int bid=0;

    PreparedStatement ps=con.prepareStatement
	       ("update btable set  bname='"+fb.getBname()+"',bloc='"+fb.getBloc()+"',baddress='"+fb.getBaddress()+"',pin= "+fb.getPin()+",oname='"+fb.getOname()+"',contno="+fb.getContno()+" where bid= "+fb.getBid()); 

	/*ps.setInt(1,fb.getBid());	
    ps.setString(1,fb.getBname());
    ps.setString(2,fb.getBloc());
    ps.setString(3,fb.getBaddress());
    ps.setInt(4,fb.getPin());
    ps.setString(5,fb.getOname());
    ps.setInt(6,fb.getContno());*/
   
    int i=ps.executeUpdate();
    System.out.println("***********inexecuteupdate()**********");
	if(i>=1)
		
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


	

	