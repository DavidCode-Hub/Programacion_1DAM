package pizzeria;

public class Pizza extends Producto{

	public enum Tamano{
		MEDIANA,FAMILIAR
	}
	
	public enum Ingredientes{
		CUATRO_QUESOS, MARGARITA, FUNGHI
	}
	
	protected Tamano tamano;
	protected Ingredientes ingredientes;
	
	public static int totalPedidas=0;
	public static int totalServidas=0;
	
	
	
	/**
	 * @param tamano
	 * @param ingredientes
	 */
	public Pizza(Tamano tamano, Ingredientes ingredientes) {
		super();
		this.tamano = tamano;
		this.ingredientes = ingredientes;
		totalPedidas++;
		
	}
	
	@Override
	public void servir() {
		if (this.estado==Estado.PEDIDA) {
			this.estado=Estado.SERVIDA;
		} else {
			System.out.println("La pizza ya ha sido servida.");
		}
	}
	
	
	
	
	
	
}
