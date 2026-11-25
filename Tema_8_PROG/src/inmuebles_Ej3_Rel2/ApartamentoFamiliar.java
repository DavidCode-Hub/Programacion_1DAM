package inmuebles_Ej3_Rel2;

public class ApartamentoFamiliar extends Apartamento {

	
	protected double valorArea;
	protected int valorAdministracion;
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 * @param valorArea
	 * @param valorAdministracion
	 */
	public ApartamentoFamiliar(int indentificadorinmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños, double valorArea, int valorAdministracion) {
		super(indentificadorinmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
		this.valorArea = valorArea;
		this.valorAdministracion = valorAdministracion;
	}
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 */
	public ApartamentoFamiliar() {
		
	}
	
	
	
	
	
}
