package supermercado_Ej6_Rel3;

public class Producto {
	protected String nombre;
	protected int cantidad;
	
	/**
	 * @param nombre
	 * @param cantidad
	 */
	public Producto(String nombre, int cantidad) {

		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public Producto() {
		
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	
}
