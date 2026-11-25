package pruebas;

import java.sql.*;

public class SelectAnimales {

	public static void main(String[] args) {
		Connection connection;
		String nombre, tipo;
		
		try {
			String url = "jdbc:mysql://localhost:3306/circo";
			String user="root";
			String pass ="Usuario0?";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			//Necesitamos un Statement para ejecutar una sentencia
			Statement stmt= connection.createStatement();
			
			// Para que la ejecución de sentencias que devuelven algo, necesitamos el elemento ResulSet.
			ResultSet result=stmt.executeQuery("SELECT * FROM circo.animales");
			
			while (result.next()) {
				nombre= result.getString("nombre");
				tipo= result.getString("tipo");
				
				System.out.println(nombre + "  "+ tipo);
			}
			
			result.close();
			connection.close();
			
			
		}catch (SQLTimeoutException e) {
			// TODO: handle exception
		}catch (SQLException e) {
			// TODO: handle exception
		}
		

	}

}
