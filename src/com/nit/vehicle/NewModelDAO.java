/*
 * Created on Feb 20, 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nit.vehicle;
import javax.sql.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;


/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

public class NewModelDAO {
	
    Connection con=null;
    
    
    public NewModelDAO(DataSource ds){
    	try{
    		con=ds.getConnection();
    		System.out.println("coneection established");
    	}
    	catch(Exception e){}
    }
    
	
	
	public String  addnewmodel(NewModelForm  nf)
	{  int j;
		try{
			
			
			 String s1=nf.getImg();
			   System.out.println("s1======"+s1);
			   char ch[]=s1.toCharArray();
			   for(int i=0;i<ch.length;i++)
				   {
				   if(ch[i]=='\\'
				   )
					   ch[i]='/';
				   }	
				   String s2=new String(ch);
				   System.out.println(s2);
				   File f1=new File(s2);
				   String imgname=f1.getName();
				   System.out.println(imgname);
				 
				   String pic="D:/projects/vehicleIdentification/WebRoot/IMAGE/"+imgname;
				  String name1=nf.getVmodel();
				  System.out.println(name1);
				  FileInputStream fis=new FileInputStream(f1);
				   FileOutputStream  fos=new FileOutputStream("D:/projects/vehicleIdentification/WebRoot/IMAGE/"+imgname);
				    PreparedStatement ps=con.prepareStatement("insert into newmodel values(?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,nf.getVtype());
    ps.setString(3,nf.getVcolor());
    ps.setString(2,nf.getVmodel());
    ps.setString(4,nf.getMakersclassification());
    ps.setString(5,nf.getEnginecapacity());
    ps.setString(6,nf.getMilage());
    ps.setString(7,nf.getEnginehp());
    ps.setString(8,nf.getEnginetype());
    ps.setString(9,nf.getGuarrentyonspares());
    ps.setString(10,pic);
   System.out.println("***********inexecuteupdate()**********");
    int i=ps.executeUpdate();
	if(i==1)
	{
		System.out.println(i+ "the value of i is");
		   System.out.println("inserted");
		   for(  j=0;j<f1.length();j++)
			   {	   int k=fis.read();
						fos.write(k);
			   }
			   System.out.println(j);
			   return "true";
	}

	return "false";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Collection modeltypes()
	{ ArrayList a=new ArrayList();
		try
		{ Statement st=con.createStatement();
		System.out.println("statement is created");
	      ResultSet rs=st.executeQuery("select vmodel from newmodel");
	     System.out.println("rs is created");
	      while( rs.next())
	      {
	      	System.out.println("with in the while");
	      	System.out.println(rs.getString(1));
	      	ViewmodelForm vf=new ViewmodelForm ();
	      	System.out.println("vf is created");
	      	vf.setModelname(rs.getString(1));
	      	System.out.println(vf.getModelname());
	      	a.add(vf);
	      	System.out.println(a+"a value");
	      	
	      }
	     return a;   
		}catch(Exception e){}
		return null;
	}
   public Collection displaymodeldetails(String name)
   {
   	String imgname=null;
   	ArrayList aa=new ArrayList();
	try
	{ Statement st=con.createStatement();
	System.out.println("statement is created");
	
	ViewmodelsuccessForm vsf=new ViewmodelsuccessForm();
      ResultSet rs=st.executeQuery("select * from newmodel where vmodel='"+name+"'");
     System.out.println("rs is created");
     if(rs.next())
     { 
     	
       System.out.println("with in the if in dao");
       vsf.setVtype(rs.getString(1));
       System.out.println(rs.getString(1));
       vsf.setVmodel(rs.getString(2));
       System.out.println(rs.getString(2));
       vsf.setVcolor(rs.getString(3));
       System.out.println(rs.getString(3));
       vsf.setM_cls(rs.getString(4));
       System.out.println(rs.getString(4));
       vsf.setMilage(rs.getString(6));
       vsf.setEngine(rs.getString(5));
       System.out.println(rs.getString(5));
       vsf.setEnginehp(rs.getString(7));
       System.out.println(rs.getString(7));
       vsf.setEngtype(rs.getString(8));
       System.out.println(rs.getString(8));
       vsf.setGurranty(rs.getString(9));
       System.out.println(rs.getString(9));
       vsf.setImg(rs.getString(10));
       System.out.println(rs.getString(10));
       
     aa.add(vsf);
     return aa;
     }
     
     }catch(Exception e){}
     return aa;
   }
}
