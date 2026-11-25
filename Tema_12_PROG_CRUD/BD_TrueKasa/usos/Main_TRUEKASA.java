package usos;

import java.sql.*;

import connectionBD.ConnectionBD;
import especialidad.Especialidad;
import especialidad.EspecialidadDAO;

public class Main_TRUEKASA {

	public static void main(String[] args) {
		Connection conn= ConnectionBD.conectarBD();
		EspecialidadDAO espec_funciones = new EspecialidadDAO(conn);
		
		try {
			
			Especialidad espec= new Especialidad(77, "Mamporrero");
//			espec_funciones.create(espec);
			espec_funciones.read();
			
			
		}catch (SQLTimeoutException e) {
			System.err.println("Error en la conexion");
		}catch (SQLException e) {
			e.printStackTrace();
			
		}

	}

}
