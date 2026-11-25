package inmuebles_Ej3_Rel2;

public class Local extends Inmueble{
	/**
	 * 
	 */
	protected Tipo tipoLocal;

	
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 * @param tipoLocal
	 */
	public Local(int indentificadorinmobiliario, int area, String direccion, Tipo tipoLocal) {
		super(indentificadorinmobiliario, area, direccion);
		this.tipoLocal = tipoLocal;
	}
	
	
	public Local() {
		
	}


	/**
	 * @return the tipoLocal
	 */
	public Tipo getTipoLocal() {
		return tipoLocal;
	}


	/**
	 * @param tipoLocal the tipoLocal to set
	 */
	public void setTipoLocal(Tipo tipoLocal) {
		this.tipoLocal = tipoLocal;
	}
	
	
	
	
	
	
	

}
