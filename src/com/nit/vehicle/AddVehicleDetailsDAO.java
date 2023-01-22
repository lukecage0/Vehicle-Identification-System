
/*
 * Created on Jan 10, 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nit.vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import javax.sql.DataSource;
/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AddVehicleDetailsDAO { 
	
    Connection con=null;
    
    
    public AddVehicleDetailsDAO(DataSource ds){
    	try{
    		con=ds.getConnection();
    		System.out.println("coneection established");
    	}
    	catch(Exception e){}
    }
    
	
	
	public String  insertvehicle(AddVehicleDetailsForm af)
	{
		try{
			
	
	

    PreparedStatement ps=con.prepareStatement("insert into addvehicle values(?,?,?,?,?,?,?,?,?,?,?)");

	//ps.setInt(1,fb.getBid());	
    ps.setString(1,af.getPdate());
    ps.setString(2,af.getVno());
    ps.setString(3,af.getVmodel());
    ps.setString(4,af.getVdetails());
    ps.setInt(5,af.getEno());
    ps.setString(6,af.getOname());
    ps.setString(7,af.getOaddress());
    ps.setInt(8,af.getContno());
    ps.setString(9,af.getEmailid());
    ps.setInt(10,af.getPinno());
    ps.setString(11,af.getInsurancedetails());
   
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

	
	
	public String  vehicleregdetails(VehicleRegistrationForm vf)
	{
		try{
			
	
	

    PreparedStatement ps=con.prepareStatement("insert into vehicle_reg_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

	//ps.setInt(1,fb.getBid());	
    ps.setString(1,vf.getVno());
    ps.setString(2,vf.getEno());
    ps.setString(3,vf.getChasisno());
    ps.setString(4,vf.getVtype());
    ps.setString(5,vf.getVcolor());
    ps.setString(6,vf.getVmodel());
    ps.setString(7,vf.getMakerclassification());
    ps.setString(8,vf.getPdate());
    ps.setString(9,vf.getFuel());
    ps.setString(10,vf.getOname());
    ps.setString(11,vf.getOaddress());
    ps.setString(12,vf.getOaddressproof());
    ps.setString(13,vf.getOcontno());
    ps.setString(14,vf.getEmailid());
    ps.setInt(15,vf.getPinno());
    
   
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

	
	public String  vehicletechdetails(VehicleTechnicalForm vtf)
	{
		try{
			
	
	

    PreparedStatement ps=con.prepareStatement("insert into vehicle_tech_details  values(?,?,?,?,?,?,?,?,?)");

	//ps.setInt(1,fb.getBid());	
    ps.setString(1,vtf.getVno());
    ps.setString(2,vtf.getVtype());
    ps.setString(3,vtf.getVmodel());
    ps.setString(4,vtf.getBodytype());
    ps.setString(5,vtf.getWheels());
    
    ps.setString(6,vtf.getEnginecapacity());
    ps.setString(7,vtf.getEnginehp());
    
    ps.setString(8,vtf.getMilage());
    ps.setString(9,vtf.getUnladenweight());
   
   
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
public String viewvehicle(VehicleRegistrationForm vvf) throws Exception
{
	try
	{
		ResultSet   rs=null;
		PreparedStatement	ps=con.prepareStatement("select * from vehicle_reg_details  where vno=?" );
	ps.setString(1,vvf.getVno());
	
	 rs=ps.executeQuery();
	System.out.println(".........in execute qry.......");
	if(rs.next())
	{
		
		System.out.println(".........in rs.next.......");
		//vf.setBname(rs.getString("bname"));
		
		vvf.setVno(rs.getString("vno"));
		System.out.println(rs.getString("vno"));
	    vvf.setEno(rs.getString("eno"));
	    vvf.setChasisno(rs.getString("chasisno"));
	    vvf.setVtype(rs.getString("vtype"));
	    vvf.setVcolor(rs.getString("vcolor"));
	    vvf.setVmodel(rs.getString("vmodel"));
	    vvf.setMakerclassification(rs.getString("makerclasification"));
	    vvf.setPdate(rs.getString("pdate"));
	    vvf.setFuel(rs.getString("fuel"));
	    vvf.setOname(rs.getString("oname"));
	    vvf.setOaddress(rs.getString("oaddress"));
	    vvf.setOaddressproof(rs.getString("oaddressproof"));
	    vvf.setOcontno(rs.getString("ocontno"));
	    vvf.setEmailid(rs.getString("emailid"));
	    vvf.setPinno(rs.getInt("pinno"));
	
	   
	    
	    return "true";
	}
return "fail";
}finally{
try
{
con.close();}catch(Exception e){}
}//finally
}

public String polinceview(VehicleRegistrationForm fv)
{
try
	{
		ResultSet   rs=null;
		PreparedStatement	ps=con.prepareStatement("select * from vehicle_reg_details  where vno=?" );
	ps.setString(1,fv.getVno());
	
	 rs=ps.executeQuery();
	System.out.println(".........in execute qry.......");
	if(rs.next())
	{
	
		System.out.println(".........in rs.next.......");
		//vf.setBname(rs.getString("bname"));
		
		fv.setVno(rs.getString("vno"));
		System.out.println(rs.getString("vno"));
	    fv.setEno(rs.getString("eno"));
	    fv.setChasisno(rs.getString("chasisno"));
	    fv.setVtype(rs.getString("vtype"));
	    fv.setVcolor(rs.getString("vcolor"));
	    fv.setVmodel(rs.getString("vmodel"));
	    fv.setMakerclassification(rs.getString("makerclasification"));
	    fv.setPdate(rs.getString("pdate"));
	    fv.setFuel(rs.getString("fuel"));
	    fv.setOname(rs.getString("oname"));
	    fv.setOaddress(rs.getString("oaddress"));
	    fv.setOaddressproof(rs.getString("oaddressproof"));
	    fv.setOcontno(rs.getString("ocontno"));
	    fv.setEmailid(rs.getString("emailid"));
	    fv.setPinno(rs.getInt("pinno"));
	
	   
	    
	    return "true";
	}

}

catch(Exception e)
{ e.printStackTrace();
	}
return "fail";
}//finally

public Collection getVehiclenos()throws Exception{  
	ArrayList al=new ArrayList();
	try{
		Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select vno from vehicle_reg_details");
	while(rs.next()){
		VehicleRegistrationForm lf=new VehicleRegistrationForm();
		lf.setVno(rs.getString("vno"));
		al.add(lf);
	}
	}catch(Exception e){}
	return al;
}

public String updateviewvehicle(VehicleRegistrationForm vf)
{
	 
	try{
		
		
PreparedStatement ps=con.prepareStatement("update   vehicle_reg_details set  vcolor='"+vf.getVcolor()+"',pdate='"+vf.getPdate()+"',oname='"+vf.getOname()+"',oaddress='"+vf.getOaddress()+"',oaddressproof='"+vf.getOaddressproof()+"',ocontno='"+vf.getOcontno()+"',emailid='"+vf.getEmailid()+"',pinno= '"+vf.getPinno()+"' where vno='"+vf.getVno()+"'");

		//ps.setInt(1,fb.getBid());	
	  /*  ps.setString(1,vf.getVno());
	    ps.setString(2,vf.getEno());
	    ps.setString(3,vf.getChasisno());
	    ps.setString(4,vf.getVtype());
	    ps.setString(5,vf.getVcolor());
	    ps.setString(6,vf.getVmodel());
	    ps.setString(7,vf.getMakerclassification());
	    ps.setString(8,vf.getPdate());
	    ps.setString(9,vf.getFuel());
	    ps.setString(10,vf.getOname());
	    ps.setString(11,vf.getOaddress());
	    ps.setString(12,vf.getOaddressproof());
	    ps.setString(13,vf.getOcontno());
	    ps.setString(14,vf.getEmailid());
	    ps.setInt(15,vf.getPinno());*/
	    
	   
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









	

	
