package pruebas;
import java.sql.*;


public class ResultSet_Nombre_peso {

	public static void main(String[] args) {
		Connection connect=null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/circo";
			String user = "root";
			String pass = "Usuario0?";
			
			connect= DriverManager.getConnection(url, user, pass);
			
			Statement stmt= connect.createStatement(ResultSet.TYPE_FORWARD_ONLY , ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs= stmt.executeQuery("SELECT NOMBRE, PESO FROM ANIMALES ORDER BY PESO DESC;");
			
			if (rs.next()) {
				System.out.println("Nombre: "+rs.getString("NOMBRE")+"Peso: "+rs.getInt("PESO"));
			}
			
			if (rs.last()) {
				System.out.println("Nombre: "+rs.getString("NOMBRE")+"Peso: "+rs.getInt("PESO"));
			}
			
			
			rs.close();
			connect.close();
			
		} catch (SQLTimeoutException e) {
			
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
