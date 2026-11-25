package relacion_1;
import java.sql.*;

public class Funciones {

	public static void ejercicio2(Connection connection) {
		
		String actor_id, first_name, last_name, last_update;
		String apellido = "JOHANSSON";
		try {
			String url = "jdbc:mysql://localhost:3306/sakila";
			String user = "root";
			String pass = "Usuario0?";
			connection = DriverManager.getConnection(url, user, pass);
			

			// Necesitamos un Statement para ejecutar una sentencia

			Statement stmt = connection.createStatement();

			// Para la ejecución de sentencias que devuelven algo, necesitamos el elemento
			// ResulSet

			ResultSet result = stmt.executeQuery("SELECT * FROM sakila.actor WHERE upper(last_name) = '" + apellido + "'");
			while (result.next()) {
				actor_id = result.getString("actor_id");
				first_name = result.getString("first_name");
				last_name = result.getString("last_name");
				last_update = result.getString("last_update");
				System.out.println(actor_id + " " + first_name + " " + last_name + " " + last_update);
			}
			result.close();
			connection.close();
		} catch (SQLTimeoutException e) {
			System.err.println("El tiempo de conexión ha tardado en responder");
		} catch (SQLException e) {
			System.err.println("Se ha producido un error en la base de datos");
		}

		
		
		
	}
	

}
