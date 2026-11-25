package inmuebles_Ej3_Rel2;

public class Apartaestudio extends Apartamento{
	protected double valorArea;

	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 * @param valorArea
	 */
	public Apartaestudio(int indentificadorinmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños, double valorArea) {
		super(indentificadorinmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
		this.valorArea = valorArea;
	}
	
	/**
	 * 
	 */
	public Apartaestudio() {
		
	}
	
	
	
	
}
