package pruebas;

import java.sql.*;

public class Update_Cod_complet {

	public static void main(String[] args) {
		Connection conection = null;

		try {
			String url = "jdbc:mysql://localhost:3306/circo";
			String user = "root";
			String pass = "Usuario0?";

			conection = DriverManager.getConnection(url, user, pass);

			Statement stmt = conection.createStatement(); 
			
			//Sentencia para SELECT
			
			ResultSet result = stmt.executeQuery("SELECT * FROM CIRCO.ANIMALES");
			while (result.next()) {
				
				//Variables para recoger
			}
			
			
			
			// Sentencia para UPDATE O INSERT DELETE en la base de datos
			String sql = "update circo.animales SET peso = peso+2 , estatura = estatura+ 2.0";
			stmt.executeUpdate(sql);
			conection.setAutoCommit(false);
			conection.commit();
			conection.setAutoCommit(true);

			conection.close();

			System.out.println("Se ha modificado");

		} catch (SQLTimeoutException e) {
			
		}catch (Exception e) {
			e.printStackTrace();
			try {
				conection.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				conection.close();
			} catch (Exception e2) {

			}
		}
	}

}
