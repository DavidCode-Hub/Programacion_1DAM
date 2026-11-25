package inmuebles_Ej3_Rel2;

public class Oficina extends Local{
	protected double valorArea;
	protected boolean esGobierno;
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param tipoLocal
	 * @param valorArea
	 * @param esGobierno
	 */
	public Oficina(int indentificadorinmobiliario, int area, String direccion, Tipo tipoLocal, double valorArea,
			boolean esGobierno) {
		super(indentificadorinmobiliario, area, direccion, tipoLocal);
		this.valorArea = valorArea;
		this.esGobierno = esGobierno;
	}

	public Oficina() {
	
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
	 * @return the esGobierno
	 */
	public boolean isEsGobierno() {
		return esGobierno;
	}

	/**
	 * @param esGobierno the esGobierno to set
	 */
	public void setEsGobierno(boolean esGobierno) {
		this.esGobierno = esGobierno;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Oficina [valorArea=" + valorArea + ", esGobierno=" + esGobierno + "]");;
	}
	
	
	
	
	
}
