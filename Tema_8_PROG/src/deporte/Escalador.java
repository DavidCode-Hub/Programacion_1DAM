package deporte;

public class Escalador extends Ciclista{
	private double aceleraciónPromedio;
	private double gradoRampa;
	
	
	
	
	
	/**
	 * @param nombre
	 * @param pais
	 * @param identificador
	 * @param nombre2
	 * @param tiempoAcuulado
	 * @param aceleraciónPromedio
	 * @param gradoRampa
	 */
	public Escalador(String nombre, String pais, int identificador, int tiempoAcuulado,
			double aceleraciónPromedio, double gradoRampa) {
		
		super(nombre, pais, identificador, tiempoAcuulado);
		this.aceleraciónPromedio = aceleraciónPromedio;
		this.gradoRampa = gradoRampa;
	}
	
	public Escalador() {
		
	}
	
	
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Escalador [aceleraciónPromedio=" + aceleraciónPromedio + ", gradoRampa=" + gradoRampa + "]");;
	}

	public String imprimirTipo() {
		return "El deportista es: Escalador ";
	}

}
