package inmuebles_Ej3_Rel2;

public class CasaIndependiente extends CasaUrbana {
	protected double valorArea;

	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 * @param numeroPisos
	 * @param valorArea
	 */
	public CasaIndependiente(int indentificadorinmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños, int numeroPisos, double valorArea) {
		super(indentificadorinmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
		this.valorArea = valorArea;
	}

	
	public CasaIndependiente() {
	
	}


	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("CasaIndependiente [valorArea=" + valorArea + "]");
	}
	
	
	
	
	
	
}
