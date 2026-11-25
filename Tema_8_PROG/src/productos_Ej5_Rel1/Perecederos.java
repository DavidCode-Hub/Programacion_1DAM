package productos_Ej5_Rel1;

public class Perecederos extends General_prodc {
	protected int caducidad;
	protected int dias;

	public Perecederos(String nombre, double precio, int caducidad) {
		super(nombre, precio);
		this.caducidad = caducidad;
	}

	/**
	 * @return the caducidad
	 */
	public int getCaducidad() {
		return caducidad;
	}

	/**
	 * @param caducidad the caducidad to set
	 */
	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}
	
	public void calcular(int cantidad) {
		super.calcular(cantidad);
		dias--;
	}

}
