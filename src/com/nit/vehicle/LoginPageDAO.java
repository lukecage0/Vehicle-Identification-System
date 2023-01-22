
/*
 * Created on Jan 10, 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nit.vehicle;
import javax.servlet.http.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

import javax.sql.*;
/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LoginPageDAO {
	
    Connection con=null;
     public LoginPageDAO(DataSource ds){
    	try {
    		con=ds.getConnection();
    		System.out.println(".........coneection established........");
    	    }
    	catch(Exception e){}
    }

   
	public String  login(LoginPageForm lpf)
	{
		try{
			Statement st=con.createStatement();
			System.out.println(lpf.getUsername());
			System.out.println(lpf.getPassword());
			ResultSet rs=st.executeQuery("select type  from logintable where userid='"+lpf.getUsername()+"' and password='"+lpf.getPassword()+"'");
			 if(rs.next())
			 {
			 	System.out.println("***********inexecuteQuery()**********");
    		 return   rs.getString(1);
			 }
         }
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		return "null";


}
	

	/*public Collection changepassword(LoginPageForm lf)
	{
	   ArrayList a=new ArrayList();
			try{
				Statement st=con.createStatement();
				System.out.println(lf.getUsername());
				System.out.println(lf.getPassword());
				ResultSet rs=st.executeQuery("select * from loginpagetable where username='"+lf.getUsername()+"'");
				
		//rs=st.executeQuery();
				System.out.println(".........in execute qry.......");
				if(rs.next())
				{
				//String 	type="false";
					System.out.println(".........in rs.next.......");
					//vf.setBname(rs.getString("bname"));
					
					lf.setUsername(rs.getString("username"));
					System.out.println(rs.getString("password"));
				    lf.setPassword(rs.getString("password"));
				    lf.setType(rs.getString("type"));
				   // System.out.println(type);
				    a.add(lf);
				    return a;
				    
				    	}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
                  return a;
                  

		
			}*/

	
	public String updatepassword(LoginPageForm lf)
	{
		
		
			try{
				
		
		//int bid=0;

	    PreparedStatement ps=con.prepareStatement
		       ("update logintable set  password='"+lf.getPassword()+"',type='"+lf.getType()+"' where userid='"+lf.getUsername()+"'"); 

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
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return null;
			}
		
			return "false";
		}

	
	
	public String  changepassword(LoginPageForm lf)
	{
	   
			try{
				Statement st=con.createStatement();
				System.out.println(lf.getUsername());
				System.out.println(lf.getPassword());
				
				//ResultSet rs=st.executeQuery("select * from loginpagetable where username='"+lf.getUsername()+"'");
				 PreparedStatement ps=con.prepareStatement("select * from logintable where userid=? and type='customer'" );
				 		//"and type='"+lf.getType()+"'");
		 //ResultSet rs=st.executeQuery();
				 ps.setString(1,lf.getUsername());
				System.out.println(".........in execute qry.......");
				//ps.setString(1,lf.getUsername());
				/*lf.setUsername(1,ps.getUsername());
				lf.set(1,ps.getUsername());
				lf.setUsername(1,ps.getUsername());
				ps.setString(2,lf.getPassword());
				ps.setString(3,lf.getType());*/
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
				//String 	type="false";
					System.out.println(".........in rs.next.......");
					//vf.setBname(rs.getString("bname"));
					
					lf.setUsername(rs.getString("userid"));
					System.out.println(rs.getString("password"));
				    lf.setPassword(rs.getString("password"));
				    lf.setType(rs.getString("type"));
				   // System.out.println(type);
				    //a.add(lf);
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
	

	