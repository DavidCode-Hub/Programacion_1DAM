package ej_10_Rel_1;

public class Instrumentos {
	protected int id;
	protected double precio;
	enum tipoinstru{PERCUSION, VIENTO, CUERDA}
	protected tipoinstru tipoInstrumento;
	
	
	/**
	 * @param id
	 * @param precio
	 * @param tipoInstrumento
	 */
	public Instrumentos(int id, double precio, tipoinstru tipoInstrumento) {
		
		this.id = id;
		this.precio = precio;
		this.tipoInstrumento = tipoInstrumento;
	}


	@Override
	public String toString() {
		return "[id=" + id + ", precio=" + precio + ", tipoInstrumento=" + tipoInstrumento + "]";
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	/**
	 * @return the tipoInstrumento
	 */
	public tipoinstru getTipoInstrumento() {
		return tipoInstrumento;
	}


	/**
	 * @param tipoInstrumento the tipoInstrumento to set
	 */
	public void setTipoInstrumento(tipoinstru tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	} 
	
	
	
	
	
	
}
