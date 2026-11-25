package instalacion_deportiva_Ej4_Rel5;

public class Polideportivo extends Edificio implements Interfaz_deportiva, Edificio_cubierto {

	protected int superficie;
	protected String nombre;

	/**
	 * @param superficie
	 * @param nombre
	 */
	public Polideportivo(int superficie, String nombre) {

		this.superficie = superficie;
		this.nombre = nombre;
	}

	/**
	 * @param superficie
	 * @param nombre
	 */
	public Polideportivo() {
	}
	
	
	

	/**
	 * @return the superficie
	 */
	public int getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
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

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Polideportivo [superficie=" + superficie + ", nombre=" + nombre + "]";
	}
	
	

}
