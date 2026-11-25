package simulacro_examen;

public class Comic extends Producto {

	protected String tematica;
	protected String autor;
	protected int numeropag;
	protected double preciofinal;

	// Constructor por defecto

	public Comic() {
		super();
		this.tematica = "";
		this.autor = "";
		this.numeropag = 0;
	}

	/**
	 * @param nombre
	 * @param anoedicion
	 * @param precio_base
	 * @param calificacion_edad
	 * @param tematica
	 * @param autor
	 * @param numeropag
	 */
	public Comic(String nombre, int anoedicion, double precio_base, int calificacion_edad, String tematica,
			String autor, int numeropag) {
		super(nombre, anoedicion, precio_base, calificacion_edad);
		this.tematica = tematica;
		this.autor = autor;
		this.numeropag = numeropag;
	}

	public void calcularPrecio() {

		if (this.numeropag > 100 && this.numeropag <= 200) {

			this.preciofinal = super.precio_base * 1.05;

		} else if (this.numeropag > 200) {
			this.preciofinal = super.precio_base * 1.1;
		}
		
		System.out.println("El precio del comic es de: "+this.preciofinal);
	}

}
