/*
 * Created on Feb 5, 2007
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
public class NewUserDAO {
	Connection con=null;
	
	ResultSet rs=null;
	public NewUserDAO( DataSource ds) throws Exception
	{
		con=ds.getConnection();
		System.out.println(".....Connection craeted.....");
	
	}

	
	
	public String userregistration(NewUserForm nuf)
	
	{
		try {
	
		
		
		PreparedStatement ps=con.prepareStatement("insert into newuser values(?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1,nuf.getUname());
		ps.setString(2,nuf.getDesig());
		ps.setString(3,nuf.getUtype());
		ps.setString(4,nuf.getUaddress());
		ps.setString(5,nuf.getAddressproof());
		ps.setInt(6,nuf.getPin());
		ps.setInt(7,nuf.getContno());
		ps.setString(8,nuf.getPhotodetails());
		ps.setString(9,nuf.getOrgname());
		ps.setString(10,nuf.getUserid());
		ps.setString(11,nuf.getPass());
		int i=ps.executeUpdate();
		if(i==1){
		ps=con.prepareStatement("insert into logintable  values(?,?,?)");
		ps.setString(1,nuf.getUserid());
		ps.setString(2,nuf.getPass());
		ps.setString(3,nuf.getUtype());
		 i=ps.executeUpdate();
		/* ps=con.prepareStatement("insert into policelogintable  values(?,?)"); 
		 ps.setString(1,nuf.getUserid());
			ps.setString(2,nuf.getPass());
			 i=ps.executeUpdate();*/
		System.out.println("......in execute()......");
		

		
		if(i==1)
		{
			
			return "true";
		
				}
		}
		}
				catch(Exception e)
				{
					e.printStackTrace();
					return null;
				}
				
				return "false";
			}


	
	
public String changeprofile(NewUserForm nuf) throws Exception
	{
	try
	{
PreparedStatement 
ps=con.prepareStatement("update newuser set desig='"+nuf.getDesig()+"'"+"uaddress='"+nuf.getUaddress()+"'"+"pin='"+nuf.getPin()+"'"+"contno='"+nuf.getContno()+"'"+" where userid='"+nuf.getUserid()+"'");

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


public String viewprofile(NewUserForm nuf)


{

	try{
		
		
	
	
	
	PreparedStatement ps=con.prepareStatement("select * from vehicle_insurance_details where vno=?");
		System.out.println(nuf.getVno());
		ps.setString(1,af.getVno());
	ResultSet rs=ps.executeQuery();
	System.out.println(".........in execute qry.......");
	while(rs.next())
	{
		System.out.println(".........rs.next.......");
	nuf.setDt(rs.getString(""));
	nuf.setVno(rs.getString("vno"));
	nuf.setVtype(rs.getString("vtype"));
	nuf.setChasisno(rs.getString("chasisno"));
	nuf.setOname(rs.getString("oname"));
	nuf.setOaddress(rs.getString("oaddress"));
	nuf.setOcontno(rs.getString("ocontno"));
	nuf.setIcdetails(rs.getString("icdetails"));
	nuf.setItype(rs.getString("itype"));
	nuf.setIamount(rs.getString("iamount"));
    nuf.setExdate(rs.getString("exdate"));
    
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


