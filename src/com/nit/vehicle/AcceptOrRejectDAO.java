/*
 * Created on Feb 22, 2007
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
public class AcceptOrRejectDAO {
	Connection con=null;
	Statement st=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
    
    
    public AcceptOrRejectDAO(DataSource ds){
    	try{
    		con=ds.getConnection();
    		System.out.println("coneection established");
    	}
    	catch(Exception e){}
    }
    
	
	
	public String  createornot(AcceptOrRejectForm arf)
	{
		try{
			
			
			
	
	
     ps=con.prepareStatement("insert into  accept  values(?,?,?,?,?,?,?,?,?,?,?,?)");

   // String seq=userid.nextVal;
	//ps.setInt(1,fb.getBid());	
    ps.setString(1,arf.getFname());
    ps.setString(2,arf.getLname());
    ps.setString(3,arf.getUtype());
    ps.setString(4,arf.getDt());
    ps.setString(5,arf.getAge());
    ps.setString(6,arf.getPhno());
    ps.setString(7,arf.getAddress());
    ps.setString(8,arf.getAddressproof());
    ps.setString(9,arf.getWorkorgdet());
    ps.setString(10,arf.getDesignation());
    ps.setString(11,arf.getUserid());
    System.out.println(arf.getUserid());
    ps.setString(12,arf.getPassword());
   
   System.out.println("***********inexecuteupdate()**********");
     int i=ps.executeUpdate();
	if(i==1)
	{
		st=con.createStatement();
	ResultSet rs=st.executeQuery("select users.nextVal from dual");
	if(rs.next())
	{
		System.out.println(rs.getString(1));
		String user=rs.getString(1);
	}
	/*String user1="user";
	String username= "user".concat(rs.getString(1));
	System.out.println(username);
	arf.setUserid(username);*/
		PreparedStatement ps=con.prepareStatement("insert into logintable values(?,?,? )");

	 ps.setString(1,arf.getUserid());
	 ps.setString(2,arf.getPassword());
	 ps.setString(3,arf.getUtype());
	 i=ps.executeUpdate();
	 if(i==1)
	 	
	 	return "true";
		
    return "true";
	
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		
		return "false";
	}

	public String  blockuser(LoginPageForm af)throws Exception
	{
	    st=con.createStatement();
	    System.out.println("----in block employee method----");
	    rs=st.executeQuery("select * from logintable where userid='"+af.getUsername()+"'");
	    System.out.println("--execute Query--");
		
	    while(rs.next())
	    {
	    st=con.createStatement();
		System.out.println("--create Statement--");
		int i=st.executeUpdate("delete from logintable where userid='"+af.getUsername()+"'");
		System.out.println("--after delete query--");
		if(i==1){
		     	System.out.println("--Employee blocked successfully---");
			ps=con.prepareStatement("insert into block_user values(?,?,?)");
			ps.setString(1,rs.getString(1));
		    ps.setString(2,rs.getString(2));
		    ps.setString(3,rs.getString(3));
		    
		     i=ps.executeUpdate();
			if(i==1)
				
		    return "true";
			return "false";
				}
	    }
		return null;	
	    }
			
		
	
	public String unblock(LoginPageForm apf) throws Exception 
	{
		
		
		st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from block_user where userid='"+apf.getUsername()+"'");
		while(rs.next())
		{
			try{
				
			System.out.println(rs.getString(1));
			//apf.setUsername(rs.getString("username"));
			//apf.setPassword(rs.getString("password"));
			//apf.setType(rs.getString("type"));
			
			ps=con.prepareStatement("insert into logintable values(?,?,?)");
			ps.setString(1,rs.getString(1));
		    ps.setString(2,rs.getString(2));
		    ps.setString(3,rs.getString(3));
		    int i=ps.executeUpdate();
			if(i==1){
				st=con.createStatement();
				int k=st.executeUpdate("delete from block_user where userid='"+apf.getUsername()+"'");
				if(k>0){
					System.out.println("---record deleted from empblock details------");
				System.out.println("---record inserted successfully into empdetails--");
				}
				}
			return "true";	
		    
	}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return "false";
	    }
	
	
	
	/*public String unblockuser(String userid)throws Exception
	{
		System.out.println("---in the unblockemployee method----");
		st=con.createStatement();
		//System.out.println(erf.getEmpid()+"---in the unblockemployee method----");
		rs=st.executeQuery("select * from userblocked where userid='"+userid+"'");
		System.out.println(rs+"---in the unblockemployee method----");
		
		while(rs.next())
		{
			AcceptOrRejectForm arf=new AcceptOrRejectForm(); 
			System.out.println("---in the ts.next() method----");
			erf.setEmpid(rs.getString(1));
	    	erf.setPassword(rs.getString(2));
	    	erf.setFirstname(rs.getString(3));
	    	erf.setLastname(rs.getString(4));
	    	erf.setDob(rs.getString(5));
	    	erf.setAddress(rs.getString(6));
	    	erf.setDoj(rs.getString(7));
	    	erf.setPhno(rs.getString(8));
	    	erf.setEmail_id(rs.getString(9));
	    	erf.setDesig(rs.getString(10));
	    	
			ps=con.prepareStatement("insert into empdetails values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,arf.getFname());
		    ps.setString(2,arf.getLname());
		    ps.setString(3,arf.getUtype());
		    ps.setString(4,arf.getDt());
		    ps.setString(5,arf.getAge());
		    ps.setString(6,arf.getPhno());
		    ps.setString(7,arf.getAddress());
		    ps.setString(8,arf.getAddressproof());
		    ps.setString(9,arf.getWorkordet());
		    ps.setString(10,arf.getDesignation());
		    ps.setString(11,arf.getUserid());
		    ps.setString(12,arf.getPassword());
			int i=ps.executeUpdate();
			if(i==1){
				st=con.createStatement();
				int k=st.executeUpdate("delete from empblockdetails where empid='"+eid+"'");
				if(k>0){
					System.out.println("---record deleted from empblock details------");
				System.out.println("---record inserted successfully into empdetails--");
				}
				}
			return true;	
			}
		return false;
}
	
}*/
public String viewprofile(AcceptOrRejectForm arf) throws Exception 
{
	
	
try{
	PreparedStatement ps=con.prepareStatement("select * from accept where userid=?");
	ps.setString(1,arf.getUserid());
	ResultSet rs=ps.executeQuery();
	System.out.println(".........in execute qry.......");
	if(rs.next())
	{
		System.out.println(".........rs.next.......");
		arf.setFname(rs.getString("firstname"));
		arf.setLname(rs.getString("lastname"));
		arf.setUtype(rs.getString("usertype"));
		arf.setDt(rs.getString("dt"));
		arf.setAge(rs.getString("age"));
		arf.setPhno(rs.getString("phno"));
		arf.setAddress(rs.getString("address"));
		arf.setAddressproof(rs.getString("addressproof"));
		arf.setWorkorgdet(rs.getString("workorgdet"));
		arf.setDesignation(rs.getString("designation"));
		arf.setUserid(rs.getString("userid"));
	    arf.setPassword(rs.getString("password"));
	    
	    return "true";
	}
	
}
catch(Exception e)
{ 
	e.printStackTrace();
	
}
    
return "false";
    
	}



public String  updateprofile(AcceptOrRejectForm arf)
{
	try {
		
	
	PreparedStatement ps=con.prepareStatement("update   accept set  age='"+arf.getAge()+"',phno='"+arf.getPhno()+"',address='"+arf.getAddress()+"',addressproof='"+arf.getAddressproof()+"', workorgdet='"+ arf.getWorkorgdet()+"',designation='"+arf.getDesignation()+"',password='"+arf.getPassword()+"' where userid='"+arf.getUserid()+"'");

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
