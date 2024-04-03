package AtmProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class DbHandel {
	
	Connection con ;
	Statement st ;
	PreparedStatement ps;
	static String str1=null;
	//static String str2=null;
	static String str3=null;
	static String str4=null;
	static String str5=null;
	static int bal;
	
	void connectDB()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATM","root","");
			System.out.println("Datebase Connected...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	void createDB()
	{
		connectDB();
		String sql = "create database ATM";
		try
		{
		
			 st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Database Created...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void createTable()
	{
		connectDB();
		String sql = "create table User2(Account varchar(14) not null primary key,"
		              + "Name varchar(30),Card varchar(16) not null,password varchar(15) not null ,pin varchar(6) not null, balance int(15) not null )";
		try
		{
			st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Table is created");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	int insertData(String acc,String name,String card,String pass, String pin,int bal)
	{
		int flag = 1;
		connectDB();
		String sql = "insert into User2 values (?, ?, ?, ?, ?,?)";
	try
	{
		 ps = con.prepareStatement(sql);
		ps.setString(1, acc);
		ps.setString(2, name);
		ps.setString(3, card);
		ps.setString(4, pass);
		ps.setString(5, pin);
		ps.setInt(6,bal);
		
		int res = ps.executeUpdate();
		
		if(res == 1)
		{
			System.out.println("Date Inserted Successfully..");
			flag = 0;
		}
		else
		{
			System.out.println("Data Not Successully Inserted..");
		
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return flag;

	}
	//String acc2;

	int readData(String account,String pass)// to READ a the specific data in the database .
	{
		int flag = 0;
		connectDB();
				
		
		
		String sql="SELECT * FROM User2 WHERE Account = "+account;
		try
		{
			
			st = con.createStatement();
			ResultSet rs =st.executeQuery(sql);
		      while(rs.next())
		      {

		    	  
		        str1 = rs.getString(1);
		       // str2 = rs.getString(2);
		       // str3 = rs.getString(3);
		        str4 = rs.getString(4);
		       // str5 = rs.getString(5);
		       // bal = rs.getInt(6);

		    	 //System.out.println(rs.getString(1)+"\t"+rs.getString(4));
		    	  if(account.equals(rs.getString(1)) && pass.equals( rs.getString(4))) 
		    		  
				     {
				    	 flag = 1;
				    	 System.out.println("true" );
				    	 
				     }

		      }
		     
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}


   	 	System.out.println("str : "+str1);
		return flag; 
	}
	int upadateOne(String acc ,int bal )  // Update one data in the database.
	{
		int flag =1;
		
		String sql = "UPDATE User2 SET balance = ? where Account = ?";
		try
		{

			System.out.println(acc+""+bal);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,bal);
			ps.setString(2, acc);
			
	
			
			int res = ps.executeUpdate();
		
         	if(res == 1)
         	{
         		System.out.println("Upadated Successfully");
         		flag =0;
         	}
         	else
         	{
         		System.out.println("Not Upadated Successfully");
         	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	int upadatePIN(String acc ,String pin )  // Update one data in the database.
	{
		int flag =1;
		
		String sql = "UPDATE User2 SET pin = ? where Account = ?";
		try
		{

			//System.out.println(acc+""+bal);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,pin);
			ps.setString(2, acc);
			
	
			
			int res = ps.executeUpdate();
		
         	if(res == 1)
         	{
         		System.out.println("Upadated Successfully");
         		flag =0;
         	}
         	else
         	{
         		System.out.println("Not Upadated Successfully");
         	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}

	String readData2(String account,String pin)// to READ a the specific data in the database .
	{
		int flag = 0;
		connectDB();
				
		String pin2=null;
		
		String sql="SELECT * FROM User2 WHERE Account = "+account;
		try
		{
			
			st = con.createStatement();
			ResultSet rs =st.executeQuery(sql);
		      while(rs.next())
		      {  
		        str1 = rs.getString(1);
		         pin2 = rs.getString(5);
		        int bal = rs.getInt(6);

		      }
		     
		}
		catch(Exception e )
		{
			e.printStackTrace();
			
			
		}


   	 	//System.out.println("str : "+str1);
		return pin2; 

	}
		int readbal(String account,String pin)// to READ a the specific data in the database .
		{
			int flag = 0;
			
					
			int bal =0;
			
			//String bal2 = ""+bal;
			
			String sql="SELECT * FROM User2 WHERE Account = "+account;
			try
			{
				
				st = con.createStatement();
				ResultSet rs =st.executeQuery(sql);
			      while(rs.next())
			      {  
			        str1 = rs.getString(1);
			       //  pin2 = rs.getString(5);
			         bal = rs.getInt(6);

			      }
			     
			}
			catch(Exception e )
			{
				e.printStackTrace();
				
				
			}


	   	 	//System.out.println("str : "+str1);
			return bal; 


	/*public static void main(String[] args)
	{
		DbHandel obj = new DbHandel();
		obj.createTable();
	}
	*/
}
}
