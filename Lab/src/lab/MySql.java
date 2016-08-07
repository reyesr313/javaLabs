package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	// set the db url,username, and password
	String url = "jdbc:mysql://localhost:3306/music";
	String username = "root";
	String password = "sesame";
	
	//get and return connection
	Connection connection = DriverManager.getConnection(url, username, password);
	System.out.println ("Connection Success!!!");
	
	//error (part 1)
}catch(SQLException e){
	for (Throwable t:e){
		System.out.println(t);
	}
	
}
	}

}
