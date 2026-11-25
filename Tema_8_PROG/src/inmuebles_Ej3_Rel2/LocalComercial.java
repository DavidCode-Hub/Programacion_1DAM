package inmuebles_Ej3_Rel2;

public class LocalComercial extends Local{
	
	protected double valorArea;
	protected String centroComercial;
	
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param tipoLocal
	 * @param valorArea
	 * @param centroComercial
	 */
	public LocalComercial(int indentificadorinmobiliario, int area, String direccion, Tipo tipoLocal, double valorArea, String centroComercial) {
		super(indentificadorinmobiliario, area, direccion, tipoLocal);
		this.valorArea = valorArea;
		this.centroComercial = centroComercial;
	}
	
	
	public LocalComercial() {
		
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
	 * @return the centroComercial
	 */
	public String getCentroComercial() {
		return centroComercial;
	}


	/**
	 * @param centroComercial the centroComercial to set
	 */
	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}
	

}
