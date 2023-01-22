package com.nit.vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import javax.sql.DataSource;

import antlr.collections.impl.Vector;

import com.sun.rsasign.v;

/*
 * Created on Feb 28, 2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class messageDAO {
	 Connection con=null;
	 Statement stmt1;
	 ResultSet rs1,rs;
	PreparedStatement pstmt;
	Vector v=new Vector();
	 public messageDAO(DataSource ds){
    	try {
    		con=ds.getConnection();
    		System.out.println(".........coneection established........");
    	    }
    	catch(Exception e){}
    }
	public int insertMessage(MessagesForm mf,String uid) throws Exception
	{
		int mid=1001;
		stmt1=con.createStatement();
		
		System.out.println("with in the insertmessage"+stmt1);
		pstmt=con.prepareStatement("insert into messges values(?,?,?,?,?,?,?)");
		
		rs=con.createStatement().executeQuery("select to_char(sysdate,'dd-mon-yyyy') from dual");
		
		rs1=con.createStatement().executeQuery("select max(mid) from messges");
		
		rs1.next();
		mid=rs1.getInt(1);
		++mid;
		//mf.setMsgid(new Integer(mid).toString());
		pstmt.setInt(1,mid);
		pstmt.setString(2,uid);
		System.out.println(uid+ " uid value");
		pstmt.setString(3,mf.getTo_id());
		pstmt.setString(4,mf.getUser_type());
		rs.next();
		mf.setDate(rs.getString(1));
		System.out.println(rs.getString(1));
		pstmt.setString(5,mf.getDate());
		pstmt.setString(6,mf.getMessgae());
		pstmt.setString(7,mf.getSubject());
		int i=pstmt.executeUpdate();
         System.out.println(i+"the value of  i");
         
		return i;
	}
	public Collection getMessages(String userid){
		ArrayList al=new ArrayList();
		try{
			
			rs=con.createStatement().executeQuery("select * from messges where to_id='"+userid+"'");
			while(rs.next()){
				MessagesForm mf=new MessagesForm();
				
				mf.setMid(rs.getString(1));
				mf.setTo_id(rs.getString(2));
				mf.setUser_type(rs.getString(4));
				mf.setDate(rs.getString(5));
				mf.setMessgae(rs.getString(6));
				System.out.println(rs.getString(6));
				mf.setSubject(rs.getString(7));
				al.add(mf);
				}
		}catch(Exception e){}
		return al;
	}
	
	public int deleteMessages(String mid)
	{
		int i=0;
		try
		{
			 i=con.createStatement().executeUpdate("delete from  messges   where mid='"+mid+"'");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}

	
	/*public Collection viewnoticemessages(MsgToNoticeBoardForm mf)
	{
		
		
		try{
	           
		 Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from NOTICEBOARDMESSAGES");
		while(rs.next()){
		
		 mf=new MsgToNoticeBoardForm();
			System.out.println("--viewmessages rs.next()---");	
		//EmpmessagesDTO mf=new EmpmessagesDTO();
		mf.setMessageid(rs.getString(1));
		
		mf.setFromtype(rs.getString(2));
		mf.setSubject(rs.getString(3));
		mf.setSenddate(rs.getString(4));
		mf.setMsgdes(rs.getString(5));
		System.out.println("-- end of viewmessages---");
		v.add(mf);
		ArrayList al=new ArrayList();
al.add(mf);
		}
		System.out.println(v.size());
		return v;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return v;
}*/
	
	public Collection getMessages1(String userid){
		ArrayList al=new ArrayList();
		try{
			
			rs=con.createStatement().executeQuery("select * from messges where user_id='admin' and to_id='noticeboard'");
			while(rs.next()){
				MessagesForm mf=new MessagesForm();
				
				mf.setMid(rs.getString(1));
				mf.setTo_id(rs.getString(2));
				mf.setUser_type(rs.getString(4));
				mf.setDate(rs.getString(5));
				mf.setMessgae(rs.getString(6));
				System.out.println(rs.getString(6));
				mf.setSubject(rs.getString(7));
				al.add(mf);
				}
		}catch(Exception e){}
		return al;
	}
	
}

