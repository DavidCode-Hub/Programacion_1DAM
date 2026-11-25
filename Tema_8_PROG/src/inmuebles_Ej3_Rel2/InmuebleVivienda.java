package inmuebles_Ej3_Rel2;

public class InmuebleVivienda extends Inmueble{
	/**
	 * Atributos
	 */
	protected int numeroHabitaciones;
	protected int numeroBaños;
	
	

	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 */
	public InmuebleVivienda(int indentificadorinmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
		super(indentificadorinmobiliario, area, direccion);
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBaños = numeroBaños;
	}

	public InmuebleVivienda() {
		
	}
	
	
	/**
	 * @return the numeroHabitaciones
	 */
	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	/**
	 * @param numeroHabitaciones the numeroHabitaciones to set
	 */
	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	/**
	 * @return the numeroBaños
	 */
	public int getNumeroBaños() {
		return numeroBaños;
	}

	/**
	 * @param numeroBaños the numeroBaños to set
	 */
	public void setNumeroBaños(int numeroBaños) {
		this.numeroBaños = numeroBaños;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("InmuebleVivienda [numeroHabitaciones=" + numeroHabitaciones + ", numeroBaños=" + numeroBaños + "]");;
	}
	
	
}
