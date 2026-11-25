package simulacro_Exam_1;

import java.sql.*;

public class Metodos_Ej1 {

	public static void ciudades(Connection connect) {
		String sql="SELECT * FROM sakila.city WHERE UPPER(CITY) LIKE '%S';";
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/circo";
			String user="root";
			String pass ="Usuario0?";
			
			connect= DriverManager.getConnection(url, user, pass);
			
			Statement stmt= connect.createStatement();
			
			ResultSet result = stmt.executeQuery(sql);
			
			System.out.print("Ciudad: ");
			// Ejercicio 1.1.A
			while (result.next()) {
				String ciudad= result.getString("CITY");
				
				System.out.print(ciudad + " , ");
				
			}
			
			
			//Ejercicio 1.1.B
			stmt= connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			ResultSet result2 = stmt.executeQuery(sql);
			
			result2.afterLast();
			
			System.out.println("-------DESCENDENTE-------");
			System.out.print("Ciudad: ");
			
			while (result2.previous()) {
				String ciudad2=result2.getString("city");
				System.out.print(ciudad2 + " , ");
			}
			
			
			
			ResultSet rest3 = stmt.executeQuery(sql);
			
			if (rest3.isLast()) {
				rest3.absolute(2);
				String ciudad=rest3.getString("city");
			}
			
			
			
		}  catch (SQLTimeoutException e) {
			System.err.println("Error de conexion, tiempo terminado");
		}catch (Exception e) {
			e.printStackTrace();
			try {
				connect.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				connect.close();
			} catch (Exception e2) {

			}
		}
	}

}
