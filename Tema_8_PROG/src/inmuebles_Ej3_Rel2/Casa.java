package inmuebles_Ej3_Rel2;

public class Casa extends InmuebleVivienda{
	protected int numeroPisos;

	
	


	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 * @param numeroPisos
	 */
	public Casa(int indentificadorinmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños,
			int numeroPisos) {
		super(indentificadorinmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
		this.numeroPisos = numeroPisos;
	}
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 * @param numeroPisos
	 */
	public Casa() {
		
	}
		

	/**
	 * @return the numeroPisos
	 */
	public int getNumeroPisos() {
		return numeroPisos;
	}
	/**
	 * @param numeroPisos the numeroPisos to set
	 */
	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Casa [numeroPisos=" + numeroPisos + "]");;
	}
	
	
	
	
	
}
