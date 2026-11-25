package cartas_Ej5_Rel3;

public class Carta {

	protected String nombre;
	protected String palo;

	/**
	 * @param nombre
	 * @param palo
	 */
	public Carta(String nombre, String palo) {
		this.nombre = nombre;
		this.palo = palo;
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
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * @param palo the palo to set
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta: " + nombre + " de " + palo;
	}

}
