package pruebas;

import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class Insert_pistas {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		Connection connection = null;

		try {
			String url = "jdbc:mysql://localhost:3306/circo";
			String user = "root";
			String pass = "Usuario0?";

			connection = DriverManager.getConnection(url, user, pass);

			System.out.println("Nombre de pista");
			String nombre = consola.nextLine();
			System.out.println("Aforo");
			int aforo = Integer.parseInt(consola.nextLine());

			

			// Necesitamos un Statement para ejecutar una sentencia
			Statement stmt = connection.createStatement();
			
			String codSql = "INSERT INTO CIRCO.PISTAS(nombre,aforo) VALUES ('" + nombre + "'," + aforo + ")";
			
			stmt.executeUpdate(codSql); 
			
			ResultSet result = stmt.executeQuery("SELECT * FROM PISTAS");

			connection.setAutoCommit(false);
			connection.commit();
			connection.setAutoCommit(true);

			connection.close();

		} catch (SQLTimeoutException e) {
			System.out.println("Error de conexion en la base de datos");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			try {
			
				connection.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
				
			}
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		consola.close();
	}
	
}
