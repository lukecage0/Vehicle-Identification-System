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
public class UpdateVehicleDAO {
	
    Connection con=null;
    
    
    public UpdateVehicleDAO (DataSource ds){
    	try{
    		con=ds.getConnection();
    		System.out.println("coneection established");
    	}
    	catch(Exception e){}
    }
    
	
	
	public String  updatevehicle(ViewVehicleForm  vvf)
	{
		try{
			
	
	int vno=0;

    PreparedStatement ps=con.prepareStatement
	       ("update pplicelogintables set  vno='"+vvf.getVno()+"',vtype='"+vvf.getVtype()+"',vdetails='"+fb.getVdetails()+"',vcolor= "+vvf.getVcolor()+",oname='"+vvf.getOname()+"',oaddress="+vvf.getOaddress()+" where vno= "+vvf.getVno()); 

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


	

	