package simulacro_examen;

public class JuegoMesa extends Producto {

	private MaterialJuego material;
	private double precioFinal;

	/**
	 * @param material
	 */
	public JuegoMesa() {
		super();
		this.material = new MaterialJuego();
	}

	/**
	 * @param nombre
	 * @param anoedicion
	 * @param precio_base
	 * @param calificacion_edad
	 * @param material
	 */
	public JuegoMesa(String nombre, int anoedicion, double precio_base, int calificacion_edad, MaterialJuego material) {

		super(nombre, anoedicion, precio_base, calificacion_edad);
		this.material = material;
	}

	/**
	 * @return the material
	 */
	public MaterialJuego getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(MaterialJuego material) {
		this.material = material;
	}

	public void calcularPrecio() {
		this.precioFinal = super.precio_base + material.costeJuego();

	}

	@Override
	public String toString() {
		return "JuegoMesa [material=" + material + ", precioFinal=" + precioFinal + "]";
	}
	
	

}
