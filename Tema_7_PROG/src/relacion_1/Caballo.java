package relacion_1;

public class Caballo {
	
	//Atributos 
	private String nombre;
	private String raza;
	private String color;
	private int edad;
	private int carrerasGanadas;
	
	//Constructor vacio
	
	public Caballo() {
		
	}

	//Constructor para rellenar
	
	public Caballo(String nombre, String raza, String color, int edad, int carrerasGanadas) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.edad = edad;
		this.carrerasGanadas = carrerasGanadas;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCarrerasGanadas() {
		return carrerasGanadas;
	}

	public void setCarrerasGanadas(int carrerasGanadas) {
		this.carrerasGanadas = carrerasGanadas;
	}

	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad
				+ ", carrerasGanadas=" + carrerasGanadas + "]";
	}
	
	public void accciones() {
		System.out.println("\n\n"+this.nombre+": relincha ");
		System.out.println("Rumia");
		System.out.println("Trota");
		System.out.println("Cabalga");
	}
	
	
	
	
	
}
