package relacion_1;

public class Raices_Ej6 {

	private int a;
	private int b;
	private int c;
	
	// Constructor vacio
		public Raices_Ej6() {

		}

	// Constructor definido
	public Raices_Ej6(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Getters and Setters
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double getDiscriminante() {
		double res =( (Math.pow(b, 2) - (4 * a * c)));
		return res;
	}

	public boolean tieneRaices() {
		return getDiscriminante() >= 0; // Puede usarse de esta forma, evalua y devuelve en la misma linea, se puede
										// hacer tambien como el metodo tieneRaiz.

	}

	public boolean tieneRaiz() {
		boolean y;
		if (getDiscriminante() == 0) {
			y = true;
		} else {
			y = false;
		}
		return y;
	}

	/*
	 * public boolean obtenerRaices() { return getDiscriminante()>=0; //Puede usarse
	 * de esta forma, evalua y devuelve en la misma linea, se puede hacer tambien
	 * como el metodo tieneRaiz. }
	 */

	public void obtenerRaices() {
		double x1 = (-b * (Math.sqrt(getDiscriminante())) / (2 * a));
		double x2 = (-b * (-Math.sqrt(getDiscriminante())) / (2 * a));

		System.out.println("La solución es:");

		System.out.println("x1:" + x1);
		System.out.println("x2:" + x2);

	}

	public void obtenerRaiz() {
		double x1 = (-b * (Math.sqrt(getDiscriminante())) / (2 * a));

		System.out.println("Solo hay una solución posible:\n\n");
		System.out.println("La solución es:");
		System.out.println("x1:" + x1);

	}

	public void calcular() {

		if (tieneRaices()) {
			obtenerRaices();
			
		} else if (tieneRaiz()) {
			obtenerRaiz();
			
		}else {
			System.out.println(" Esta ecuación NO tiene solución ");
		}
		
	}

}
