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
public class OtherUserRegistrationDAO {
	Connection con=null;
	Connection con1=null;	
	ResultSet rs=null;
	public OtherUserRegistrationDAO( DataSource ds) throws Exception
	{
		con=ds.getConnection();
		con1=ds.getConnection();
		System.out.println(".....Connection craeted.....");
	
	}

	
	
/*	public String userregistration(OtherUserRegistrationForm of)
	
	{
		try {
	
		
		
	PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1,of.getUsername());
		ps.setString(2,of.getDesignation());
		ps.setString(3,of.getAddress());
		ps.setString(4,of.getAddressproof());
		
		ps.setInt(5,of.getPinno());
		ps.setInt(6,of.getContno());
		ps.setString(7,of.getEmailid());
		ps.setString(8,of.getPhotodetails());
		ps.setString(9,of.getOrgname());
		ps.setString(10,of.getUserid());
		ps.setString(11,of.getPassword());
		ps.setString(12,of.getUsertype());
		int i=ps.executeUpdate();
		ps=con.prepareStatement("insert into loginpagetable  values(?,?,?)");
		ps.setString(1,of.getUserid());
		ps.setString(2,of.getPassword());
		ps.setString(3,of.getUsertype());
		 i=ps.executeUpdate();
		/* ps=con.prepareStatement("insert into policelogintable  values(?,?)"); 
		 ps.setString(1,nuf.getUserid());
			ps.setString(2,nuf.getPass());
			 i=ps.executeUpdate();*/
		/*System.out.println("......in execute()......");
		

		
		if(i==1)
		{		
			return "true";
		
				}
		
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
				
				return "false";
	
	}*/	


	
/*	public boolean  blockuser(OtherUserRegistrationForm of)throws Exception
	{
		 //con=null;
	PreparedStatement ps=null;
		//Statement st;
		 //rs=null;
		 System.out.println("of.getUsername:"+of.getUsername());
		  ps=con.prepareStatement("select * from users where username='"+of.getUsername()+"'");
	   //ps=con.prepareStatement("select * from users where userid='"+of.getUsername()+"'");
	    System.out.println("----in block user method----");
	    //ps.setString(1,of.getUsername());
	    rs=ps.executeQuery();
	    System.out.println("--execute Query--");
		    while(rs.next())
	    {
	    	of.setUsername(rs.getString("username"));
			of.setDesignation(rs.getString("designation"));
			of.setAddress(rs.getString("address"));
			of.setAddressproof(rs.getString("addressproof"));
			of.setPinno(rs.getInt("pinno"));
			of.setContno(rs.getInt("contno"));
			of.setEmailid(rs.getString("emailid"));
			of.setPhotodetails(rs.getString("photodetails"));
			of.setOrgname(rs.getString("orgname"));
			of.setUserid(rs.getString("userid"));
			of.setPassword(rs.getString("password"));
			of.setUsertype(rs.getString("usertype"));
	    	}
		   ps.close();
		    PreparedStatement ps1=null;
		ps1=con.prepareStatement("delete from users where userid='"+of.getUsername()+"'");
		System.out.println("--create Statement--");
		//int i=st.executeUpdate("delete from users where userid='"+of.getUserid()+"'");
		System.out.println("--after delete query--");
		int i=0;
		if(i==1){
			System.out.println("--Employee blocked successfully---");
			ps=con.prepareStatement("insert into block1 values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,of.getUsername());
			ps.setString(2,of.getDesignation());
			ps.setString(3,of.getAddress());
			ps.setString(4,of.getAddressproof());
			
			ps.setInt(5,of.getPinno());
			ps.setInt(6,of.getContno());
			ps.setString(7,of.getEmailid());
			ps.setString(8,of.getPhotodetails());
			ps.setString(9,of.getOrgname());
			ps.setString(10,of.getUserid());
			ps.setString(11,of.getPassword());
			ps.setString(12,of.getUsertype());
            
            int j=ps.executeUpdate();
            if(j==1){
            	System.out.println("---record successfully inserted into empblockdetails---");
            	
            	return true;
            	}
            

		}
		return false;
	}
	
	
	}*/
	
public boolean  blockuser(OtherUserRegistrationForm of)
throws Exception
{
		PreparedStatement ps=null;
		Statement st;
		ResultSet rs=null;
	    st=con.createStatement();
	    System.out.println("select * from users where username='"+of.getUsername()+"'");
		   
	    rs=st.executeQuery("select * from users where username='"+of.getUsername()+"'");
	    
	   System.out.println("select * from users where username='"+of.getUsername()+"'");
	   System.out.println("----in block user method----");
	    System.out.println("--execute Query--");
	    ps=con1.prepareStatement("insert into block1 values(?,?,?,?,?,?,?,?,?,?,?,?)");
		
		System.out.println(1);
		System.out.println(2);
		boolean b=true;
				if(b)
	    {
					System.out.println(3);
					rs.next();
			System.out.println(""+rs.getString(1));
					ps.setString(1,rs.getString(1));
					System.out.println(""+rs.getString(2));
					
					ps.setString(2,rs.getString(2));
					System.out.println(""+rs.getString(3));
					
	    	ps.setString(3,rs.getString(3));
	    	System.out.println(""+rs.getString(4));
			
	    	ps.setString(4,rs.getString(4));
	    	System.out.println(""+rs.getString(5));
			
	    	ps.setInt(5,rs.getInt(5));
	    	System.out.println(""+rs.getString(6));
			
	    	ps.setInt(6,rs.getInt(6));
	    	System.out.println(""+rs.getString(7));
			
	    	ps.setString(7,rs.getString(7));
	    	System.out.println(""+rs.getString(8));
			
	    	ps.setString(8,rs.getString(8));
	    	System.out.println(""+rs.getString(9));
	    	
			
	    	ps.setString(9,rs.getString(9));
	    	System.out.println(""+rs.getString(10));
			
	    	ps.setString(10,rs.getString(10));
	    	System.out.println(""+rs.getString(11));
			
	    	ps.setString(11,rs.getString(11));
	    	System.out.println(""+rs.getString(12));
			
	    	ps.setString(12,rs.getString(12));
	    b=false;				
	    }
		//ps=con.prepareStatement("delete from users where userid='"+of.getUsername()+"'");
		System.out.println("--create Statement--");
		
		int  i=ps.executeUpdate();
		int j=st.executeUpdate("delete from users where username='"+of.getUsername()+"'");
		System.out.println("--after delete query--"+i);
		System.out.println("--after delete query--"+j);
		
            if(i==1){
            		System.out.println("---record successfully inserted into empblockdetails---");            
                    System.out.println("---record successfully deleted into empblockdetails---");          
            return true;	
            }
    		return false;

}	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	