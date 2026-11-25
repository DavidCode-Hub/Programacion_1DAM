package inmuebles_Ej3_Rel2;

public class CasaRural extends Casa{

	protected double valorArea;
	protected int distanciaCabera;
	protected int altitud;
	
	
	
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param numeroHabitaciones
	 * @param numeroBaños
	 * @param numeroPisos
	 * @param valorArea
	 * @param distanciaCabera
	 * @param altitud
	 */
	public CasaRural(int indentificadorinmobiliario, int area, String direccion, int numeroHabitaciones,
			int numeroBaños, int numeroPisos, double valorArea, int distanciaCabera, int altitud) {
		
		
		super(indentificadorinmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
		this.valorArea = valorArea;
		this.distanciaCabera = distanciaCabera;
		this.altitud = altitud;
	}
	
	public CasaRural() {
		
		
	}
	
	

	/**
	 * @return the valorArea
	 */
	public double getValorArea() {
		return valorArea;
	}

	/**
	 * @param valorArea the valorArea to set
	 */
	public void setValorArea(double valorArea) {
		this.valorArea = valorArea;
	}

	/**
	 * @return the distanciaCabera
	 */
	public int getDistanciaCabera() {
		return distanciaCabera;
	}

	/**
	 * @param distanciaCabera the distanciaCabera to set
	 */
	public void setDistanciaCabera(int distanciaCabera) {
		this.distanciaCabera = distanciaCabera;
	}

	/**
	 * @return the altitud
	 */
	public int getAltitud() {
		return altitud;
	}

	/**
	 * @param altitud the altitud to set
	 */
	public void setAltitud(int altitud) {
		this.altitud = altitud;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("CasaRural [valorArea=" + valorArea + ", distanciaCabera=" + distanciaCabera + ", altitud=" + altitud
				+ "]");;
	}
	
	
	

	
	

}
