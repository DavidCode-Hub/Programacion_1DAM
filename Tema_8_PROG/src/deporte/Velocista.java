package deporte;



public class Velocista extends Ciclista{
	private double potenciaPromedio;
	private double velocidadPromedio;
	
	
	
	/**
	 * @param nombre
	 * @param pais
	 * @param identificador
	 * @param nombre2
	 * @param tiempoAcuulado
	 * @param potenciaPromedio
	 * @param velocidadPromedio
	 */
	public Velocista(String nombre, String pais, int identificador, int tiempoAcumulado, double potenciaPromedio, double velocidadPromedio) {
		
		super(nombre, pais, identificador, tiempoAcumulado);
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}
	
	public Velocista(){
		
	}	

	

	/**
	 * @return the potenciaPromedio
	 */
	public double getPotenciaPromedio() {
		return potenciaPromedio;
	}

	/**
	 * @param potenciaPromedio the potenciaPromedio to set
	 */
	private void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}

	/**
	 * @return the velocidadPromedio
	 */
	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}

	/**
	 * @param velocidadPromedio the velocidadPromedio to set
	 */
	private void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}
	
	
	
	

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Velocista [potenciaPromedio=" + potenciaPromedio + ", velocidadPromedio=" + velocidadPromedio + "]");;
	}

	public String imprimirTipo() {
		return "El deportista es: Velocista";
	}
}
