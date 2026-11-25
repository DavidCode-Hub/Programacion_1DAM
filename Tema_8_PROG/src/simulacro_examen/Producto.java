package simulacro_examen;

public abstract class Producto {
	
	protected String nombre;
	protected int anoedicion;
	protected double precio_base;
	protected int calificacion_edad;
	
	
	public Producto() {
		
		this.nombre ="";
		this.anoedicion = 0;
		this.precio_base = 0;
		this.calificacion_edad = 0;
		
	}


	/**
	 * @param nombre
	 * @param anoedicion
	 * @param precio_base
	 * @param calificacion_edad
	 */
	public Producto(String nombre, int anoedicion, double precio_base, int calificacion_edad) {
		this.nombre = nombre;
		this.anoedicion = anoedicion;
		this.precio_base = precio_base;
		this.calificacion_edad = calificacion_edad;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the anoedicion
	 */
	public int getAnoedicion() {
		return anoedicion;
	}


	/**
	 * @param anoedicion the anoedicion to set
	 */
	public void setAnoedicion(int anoedicion) {
		this.anoedicion = anoedicion;
	}


	/**
	 * @return the precio_base
	 */
	public double getPrecio_base() {
		return precio_base;
	}


	/**
	 * @param precio_base the precio_base to set
	 */
	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}


	/**
	 * @return the calificacion_edad
	 */
	public int getCalificacion_edad() {
		return calificacion_edad;
	}


	/**
	 * @param calificacion_edad the calificacion_edad to set
	 */
	public void setCalificacion_edad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}
	
	
	public abstract void calcularPrecio();


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", anoedicion=" + anoedicion + ", precio_base=" + precio_base
				+ ", calificacion_edad=" + calificacion_edad + "]";
	}
	
	
	
	
}
