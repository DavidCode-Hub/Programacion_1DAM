package productos_Ej5_Rel1;

public class General_prodc {
	protected String Nombre;
	protected double Precio;
	
	public General_prodc(String nombre, double precio) {
		Nombre = nombre;
		Precio = precio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return Precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	public void calcular(int cantidad) {
		System.out.println("Resultado es: "+cantidad*Precio);
	}
	
}
