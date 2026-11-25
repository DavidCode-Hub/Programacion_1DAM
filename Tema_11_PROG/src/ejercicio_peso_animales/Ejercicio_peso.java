package ejercicio_peso_animales;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio_peso {

	public static void main(String[] args) {
		// Sacar el peso (evaluar) y de nombre de una persona pedida por parametros
		// referente a consultas parametrizadas.
		
		Connection connect = null;
		Scanner consola= new Scanner (System.in);
		try {
			
			String url = "jdbc:mysql://localhost:3306/circo";
			String user = "root";
			String pass = "Usuario0?";
			
			connect = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Introduce el nombre del animal a evaluar");
			String nombre=consola.nextLine().toUpperCase();
			
			PreparedStatement stmt=connect.prepareStatement(" SELECT NOMBRE, PESO FROM ANIMALES WHERE UPPER(NOMBRE) = ? ;");
			stmt.setString(1, nombre);
			
			ResultSet rs1 = stmt.executeQuery();
			
			while (rs1.next()) {
				int peso = rs1.getInt("PESO");
				String nombre2 =rs1.getString("nombre");
				
				if (peso<30) {
					System.out.println(nombre+ " tiene peso bajo");
				}else if (peso >=30 && peso < 70) {
					System.out.println(nombre+ " tiene peso ideal");
				}else if (peso >=70) {
					System.out.println(nombre+ " tiene sobrepeso");
				}
			}
			
			
			
		} catch (SQLTimeoutException e) {
			System.err.println("Error, no se ha podido resolver la consulta");
		} catch (Exception e) {
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
