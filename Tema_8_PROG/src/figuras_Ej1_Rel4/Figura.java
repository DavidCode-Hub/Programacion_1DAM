package figuras_Ej1_Rel4;

public  abstract class Figura {

	protected double area;

	/**
	 * @param area
	 */
	public Figura(double area) {
		
		this.area = area;
	}
	
	public Figura() {
		
		
	}
	
	protected abstract double calcularArea();
	
	
}
