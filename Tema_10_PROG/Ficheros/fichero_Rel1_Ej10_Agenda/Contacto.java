package fichero_Rel1_Ej10_Agenda;

public class Contacto {

	private String nombre;
	private int telefono;
	
	
	/**
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, int telefono) {
		
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Contacto() {
		
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
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	

}
