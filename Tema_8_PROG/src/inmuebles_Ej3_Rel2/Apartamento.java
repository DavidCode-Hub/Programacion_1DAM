package inmuebles_Ej3_Rel2;

public class Apartamento extends InmuebleVivienda{
	
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 */
	public Apartamento(int indentificadorinmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños) {
		super(indentificadorinmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
	}
	
	public Apartamento() {

	}
	
	
	@Override
	public void imprimir() {
		super.imprimir();
	}
	
	

}
