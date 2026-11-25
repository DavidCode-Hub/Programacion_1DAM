package pruebas;

import java.sql.*;

public class SelectArtistas {

	public static void main(String[] args) {
		Connection connection;
		String nombre, nif;
		
		
		try {
			String url = "jdbc:mysql://localhost:3306/circo";
			String user="root";
			String pass ="Usuario0?";
			
			connection = DriverManager.getConnection(url, user, pass);
			
			//Necesitamos un Statement para ejecutar una sentencia
			Statement stmt= connection.createStatement();
			
			// Para que la ejecución de sentencias que devuelven algo, necesitamos el elemento ResulSet.
			ResultSet result=stmt.executeQuery("SELECT * FROM circo.animales_artistas where nif_artista ='11111111A'");
			
			while (result.next()) {
				nombre= result.getString("nombre_animal");
				nif= result.getString("nif_artista");
				
				System.out.println(nombre + "  "+ nif);
			}
			
			
			result.close();
			connection.close();
			
			
		}catch (SQLTimeoutException e) {
			System.out.println(e.getErrorCode());
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
