package persona_ordenacion_Ej_Clase;

public class Persona implements Comparable<Persona>{
	protected String nombre;
	protected String dNI;
	
	
	
	
	public Persona() {
		
		
	}
	
	
	/**
	 * @param nombre
	 * @param dNI
	 */
	public Persona(String nombre, String dNI) {
		
		this.nombre = nombre;
		this.dNI = dNI;
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
	 * @return the dNI
	 */
	public String getdNI() {
		return dNI;
	}


	/**
	 * @param dNI the dNI to set
	 */
	public void setdNI(String dNI) {
		this.dNI = dNI;
	}


	public int compareTo(Persona p) {
		return (this.nombre).compareTo(p.getNombre());
	}
	

}
