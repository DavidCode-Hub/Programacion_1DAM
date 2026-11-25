package inmuebles_Ej3_Rel2;
/**
 * 
 */
public class Inmueble {
	/**
	 * 
	 */
	protected int indentificadorinmobiliario;
	protected int area;
	protected String direccion;
	protected double precioventa;
	
	
	/**
	 * @param indentificadorinmobiliario
	 * @param area
	 * @param direccion
	 */
	public Inmueble(int indentificadorinmobiliario, int area, String direccion) {
		this.indentificadorinmobiliario = indentificadorinmobiliario;
		this.area = area;
		this.direccion = direccion;
	}
	
	public Inmueble() {
		
	}
	
	
	
	/**
	 * @return the indentificadorinmobiliario
	 */
	public int getIndentificadorinmobiliario() {
		return indentificadorinmobiliario;
	}

	/**
	 * @param indentificadorinmobiliario the indentificadorinmobiliario to set
	 */
	public void setIndentificadorinmobiliario(int indentificadorinmobiliario) {
		this.indentificadorinmobiliario = indentificadorinmobiliario;
	}

	/**
	 * @return the area
	 */
	public int getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(int area) {
		this.area = area;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the precioventa
	 */
	public double getPrecioventa() {
		return precioventa;
	}

	/**
	 * @param precioventa the precioventa to set
	 */
	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}

	/**
	 * 
	 * @param valorArea
	 * @return
	 */
	public double calcularPrecioVenta(double valorArea) {
		
		return this.area*valorArea;
	}

	
	public void imprimir() {
		System.out.println("Inmueble [indentificadorinmobiliario=" + indentificadorinmobiliario + ", area=" + area + ", direccion="
				+ direccion + ", precioventa=" + precioventa + "]");;
	}
	
	
	
	
	
	
}
