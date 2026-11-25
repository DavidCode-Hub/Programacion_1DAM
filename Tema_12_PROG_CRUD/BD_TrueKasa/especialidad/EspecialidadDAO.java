package especialidad;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class EspecialidadDAO {
	public Connection conn;

	/**
	 * @param conn
	 */
	public EspecialidadDAO(Connection conn) {
		
		this.conn = conn;
	}
	
	
	
	public void create(Especialidad espec) throws SQLException{
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO TRUEKASA.ESPECIALIDAD (CODIGO, NOMBRE) VALUES (? , ?) ");
			stmt.setInt(1, espec.getCodigo());
			stmt.setString(2, espec.getNombre());
			
			stmt.executeUpdate();
			conn.setAutoCommit(false);
			conn.commit();
			conn.setAutoCommit(true);
			
			
			
		} catch (SQLException e) {
			System.out.println("Error en insertar datos");
			e.printStackTrace();
			conn.rollback();
		}
	}
	
	public void read() throws SQLException{
		
		try {
			
			Statement stmt2= conn.createStatement();
			
			
			ResultSet rs1= stmt2.executeQuery("SELECT * FROM ESPECIAlIDAD");
			
			
			while (rs1.next()) {
				int codigo = rs1.getInt(1);
				String nombre= rs1.getString(2);
				System.out.println(codigo +" , "+nombre);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
