package animales_Ej_Clase;

public class Animal {
	protected String nombre;
	protected String raza;
	protected int edad;
	public enum tipo{GATO,PERRO}
	
	/**
	 * @param nombre
	 * @param raza
	 * @param edad
	 */
	public Animal(String nombre, String raza, int edad) {
		
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	public Animal() {
		
		
	}
	
	
	
}
