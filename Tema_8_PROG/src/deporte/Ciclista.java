package deporte;

public abstract class Ciclista{
	private int identificador;
	private String nombre;
	private int tiempoAcumulado=0;
	
	
	/**
	 * @param nombre
	 * @param pais
	 * @param identificador
	 * @param nombre2
	 * @param tiempoAcuulado
	 */
	public Ciclista(String nombre, String pais, int identificador, int tiempoAcumulado) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.tiempoAcumulado = tiempoAcumulado;
	}
	
	public Ciclista() {
		
	}
	
	
	
	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	private void setIdentificador(int identificador) {
		this.identificador = identificador;
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
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the tiempoAcuulado
	 */
	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	/**
	 * @param tiempoAcuulado the tiempoAcuulado to set
	 */
	private void setTiempoAcumulado(int tiempoAcuulado) {
		this.tiempoAcumulado = tiempoAcuulado;
	}

	
	
	protected abstract String imprimirTipo();

	
	public void imprimir() {
		System.out.println("Ciclista [identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcuulado=" + tiempoAcumulado
				+ "]");;
	}

	
	
	
	
	
	
	
	
	
	
	
}
