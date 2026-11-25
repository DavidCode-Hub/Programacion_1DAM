package pizzeria;

public abstract class Producto {

	public enum Estado {PEDIDA, SERVIDA}
	
	protected Estado estado;
	
	public Producto() {
		this.estado=Estado.PEDIDA;
	}
	
	public abstract void servir();
	
	
}
