package simulacro_examen;

import java.util.ArrayList;

public class Factura {
	protected int idfactura;
	protected ArrayList<Producto> producto;
	
	
	/**
	 * @param idfactura
	 * @param producto
	 */
	public Factura(int idfactura) {
	
		this.idfactura = idfactura;
		this.producto = new ArrayList<Producto>();
		
	}
	
	
	
	
	
	

}
