package compra_Ej6_Rel1;

public class Elemento {
	protected String producto;
	protected double precio;
	protected int cantidad;
	
	
	public Elemento() {
		
	}
	
	/**
	 * @param producto
	 * @param precio
	 * @param cantidad
	 */
	public Elemento(String producto, double precio, int cantidad) {
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	/**
	 * @return the producto
	 */
	public String getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(String producto) {
		this.producto = producto;
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
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Elemento [Producto=" + producto + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
