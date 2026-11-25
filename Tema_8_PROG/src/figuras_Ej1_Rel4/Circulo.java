package figuras_Ej1_Rel4;

public class Circulo extends Figura{
	private final double PI=3.1416;
	private double radio;
	
	
	/**
	 * @param area
	 * @param radio
	 */
	public Circulo(double area, double radio) {
		super(area);
		this.radio = radio;
	}
	
	
	public Circulo() {
		
	}
	@Override
	public double calcularArea() {
		return super.area=PI*Math.pow(radio, 2);
	}
	
	
}
