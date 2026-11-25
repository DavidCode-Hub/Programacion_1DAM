package animal;

import java.sql.*;

import connection.ConnectBD;

public class AnimalDAO {
	private Connection connect;

	/**
	 * @param connect
	 */
	public AnimalDAO(Connection connect) {
		this.connect = connect;
	}

	

	
	/**
	 * 
	 * @param anim
	 * @throws SQLException
	 */
	public void create(Animal anim) throws SQLException {
		

		System.out.println("Conexion exitosa");

		try {

			String sql = "INSERT INTO CIRCO.ANIMALES (NOMBRE, TIPO, ANHOS, PESO, ESTATURA, NOMBRE_ATRACCION, NOMBRE_PISTA) VALUES"
												+ "(? , ? , ? , ? , ? , ?, ?) ";
			

			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setString(1, anim.getNombre());
			ps.setString(2, anim.getTipo());
			ps.setInt(3, anim.getEdad());
			ps.setFloat(4, anim.getPeso());
			ps.setFloat(5, anim.getEstatura());
			ps.setString(6, anim.getNombre_pista());
			ps.setString(7, anim.getNombre());

			ps.executeUpdate();

			connect.setAutoCommit(false);
			connect.commit();
			connect.setAutoCommit(true);

			ps.close();
			
		}catch (SQLTimeoutException e) {
			System.out.println("Error en la conexion");
			
			
		
		} catch (SQLException e) {
			System.out.println("Error en el insertar los datos");
			e.printStackTrace();
			connect.rollback();
			

		}  finally {
			connect.close();
			System.out.println("Finalizado");
		}

	}

	/**
	 * 
	 * @param nombre
	 * @throws SQLException
	 */
	public void read() throws SQLException {
		connect = ConnectBD.conectar();
		
		
		
		System.out.println("Conexion exitosa");

		try {

			String sql = "SELECT * FROM ANIMALES";
			
			
			
			Statement stmt = connect.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
			
			ResultSet rs1 = stmt.executeQuery(sql);
			
			while (rs1.next()) {
				String nombre1= rs1.getString("nombre");
				String tipo=rs1.getString("tipo");
				int anos = rs1.getInt("anhos");
				double peso= rs1.getDouble(4);
				double estatura = rs1.getDouble(5);
				String atraccion= rs1.getString(6);
				String pista= rs1.getString(7);
				
				System.out.println("nombre : "+nombre1+" tipo: "+tipo+" años "+anos+" peso "+peso+" estatura "+estatura+" atraccion "+atraccion+" pista "+pista);
				
			}
			

		} catch (SQLException e) {
			
			System.out.println("Error en el insertar los datos");

		} finally {

			connect.close();
			 
		}
	}
	
	public void update(String nombre, String nombreActualizado, Connection connect) throws SQLException {
		
		
		try {
			
			
			connect.setAutoCommit(false);
			
			PreparedStatement stmt =  connect.prepareStatement("UPDATE ANIMALES SET NOMBRE = ? WHERE UPPER(NOMBRE) = ?");
			stmt.setString(1, nombre);
			stmt.setString(2, nombreActualizado);
			stmt.executeUpdate();
			
			connect.commit();
			read();
			
			
			
			
			
			System.out.println("Una vez comprobado se va a ejecutar un rollback");
			
			
			
			read();
			
			System.out.println("Rollback efectuado" );
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			connect.rollback();
		}finally {
			connect.close();
		}
	
		
	}
	
	public void delete(String nombre) throws SQLException {
		connect= ConnectBD.conectar();
		
		try {
			
			String sql=" DELETE FROM ANIMALES WHERE UPPER(NOMBRE) = ?; ";
			
			PreparedStatement stmt = connect.prepareStatement(sql);
			stmt.setString(1, nombre);
			
			stmt.executeUpdate();
			
			
			read();
			
			connect.setAutoCommit(false);
			connect.commit();
			connect.setAutoCommit(true);
			
			System.out.println("Una vez comprobado se va a ejecutar un rollback");
			
			connect.rollback();
			
			System.out.println("Rollback efectuado" );
			
		} catch (SQLException e) {
			connect.rollback();
			System.out.println("Error en el borrar los datos");
		}finally {
			connect.close();
			System.out.println("Borrado efectuado");
		}
	}
	

}
