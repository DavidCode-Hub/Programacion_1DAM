package relacion_1;

public class Cuenta_Ej4 {

	//Atributo
	
	private String nombre;
	private double dinero;
	
	
	//Constructor Con titular si o si
	
	public Cuenta_Ej4(String a){
		this.nombre=a;
		this.dinero=0.0;
		
	}
	
	public Cuenta_Ej4(String b, double cant){
		this.nombre=b;
		
		if (cant<0) {
			this.dinero=0.0;
		}else {
			this.dinero=cant;
		}
		
	}
	
	
	
	//Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	
	
	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", dinero=" + dinero + "]";
	}	
	
	public void ingresar(double cantidad) {
		if (cantidad>0) {
			this.dinero=cantidad+this.dinero;
		}else {
			
		}
		
	}
	
	public void retirar(double cantidad) {
		this.dinero=cantidad-this.dinero;
		
		if (this.dinero<0) {
			this.dinero=0;
		}
	}
	
	
	
}
