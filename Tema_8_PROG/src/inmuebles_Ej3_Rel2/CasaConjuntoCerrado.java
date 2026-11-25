package inmuebles_Ej3_Rel2;

public class CasaConjuntoCerrado extends CasaUrbana {
	protected double valorArea;
	protected double valorAdministración;
	protected double tienePiscina;
	protected boolean tieneCmaposDeportivos;
	
	
	/**
	 * 
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 * @param numeroPisos
	 * @param valorArea
	 * @param valorAdministración
	 * @param tienePiscina
	 * @param tieneCmaposDeportivos
	 */
	public CasaConjuntoCerrado(int indentificadorinmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños, int numeroPisos, double valorArea, double valorAdministración, double tienePiscina,
			boolean tieneCmaposDeportivos) {
		
		
		super(indentificadorinmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
		
		this.valorArea = valorArea;
		this.valorAdministración = valorAdministración;
		this.tienePiscina = tienePiscina;
		this.tieneCmaposDeportivos = tieneCmaposDeportivos;
	}


	/**
	 * 
	 */
	public CasaConjuntoCerrado() {
		
	}


	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("CasaConjuntoCerrado [valorArea=" + valorArea + ", valorAdministración=" + valorAdministración
				+ ", tienePiscina=" + tienePiscina + ", tieneCmaposDeportivos=" + tieneCmaposDeportivos + "]");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
