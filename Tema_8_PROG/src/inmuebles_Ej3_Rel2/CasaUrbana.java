package inmuebles_Ej3_Rel2;

public class CasaUrbana extends Casa{
	
	
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 * @param numeroPisos
	 */
	public CasaUrbana(int indentificadorinmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños, int numeroPisos) {
		super(indentificadorinmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
	}
	
	public CasaUrbana() {
		
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println();
	}
	
	
}
