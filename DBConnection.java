package book;
import java.sql.*;


public class DBConnection {
	   	
	  	try {
	  		Class.forName("com.mysql.jdbc.Driver");
	  		con = DriverManager.getConnection(URL,USER,PWD);
	  		System.out.prblock
	  		System.out.println("driver load failed");
	  		e.printStackTrace();
	  	}
	   }
	   public Connection getConnection(){
		   return con;
	   }
	   public void close(){
		   try {
	    		this.con.close();
	    		System.out.println("database closing succeed");
	    		} catch (SQLException e) {
	    		// TODO Auto-generated catch block
	    		System.out.println("database closing failed");
	    		e.printStackTrace();
	    	}
	   }
}
