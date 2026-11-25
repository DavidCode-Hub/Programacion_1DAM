package connectionBD;

import java.sql.*;


public class ConnectionBD {
	
	
	
	public static String url="jdbc:mysql://localhost:3306/TRUEKASA";
	public static String pass="Usuario0?";
	public static String user="root";
	
	public static Connection connect;
	
	public static Connection conectarBD() {
		
		try {
			
			connect= DriverManager.getConnection(url, user, pass);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connect;
	}

}
