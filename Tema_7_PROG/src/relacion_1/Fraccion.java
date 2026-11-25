package relacion_1;

public class Fraccion {
	
	
	//Atributos
	private int signo;
	private int numerador;
	private int denominador;
	public int getSigno() {
		return signo;
	}
	
	
	//Consutructor vacio
	public Fraccion() {
		
	}

	//Consturctor
	public Fraccion(int signo, int numerador, int denominador) {
		this.signo = signo;
		this.numerador = numerador;
		this.denominador = denominador;
		
		if (this.denominador==0) {
			System.out.println("El denominador debe ser 0");
		}
	}
	

	
	//Getters and setters
	public void setSigno(int signo) {
		this.signo = signo;
	}
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDominador() {
		return denominador;
	}
	public void setDenominador(int dominador) {
		this.denominador = dominador;
	}
	
	
	@Override
	public String toString() {
		return "Fraccion " + numerador + ", numerador=" + signo + ", dominador=" + denominador + "]";
	}
	
	
	
	
}
