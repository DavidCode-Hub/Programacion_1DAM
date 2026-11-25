package connection;
import java.sql.*;


public class ConnectBD {
	public static String url = "jdbc:mysql://localhost:3306/CIRCO";
	public static String user = "root";
	public static String pass = "Usuario0?";
	public static Connection con;
	
	public static Connection conectar() {
		
		try {
			
			
			con = DriverManager.getConnection(url, user, pass);
			
		} catch (SQLException e) {
			System.out.println("Error algo fallo");
		}
		return con;
	}
	
	
	
}
