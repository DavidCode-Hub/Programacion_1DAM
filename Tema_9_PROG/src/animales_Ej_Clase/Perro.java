package animales_Ej_Clase;

import animales_Ej_Clase.Animal.tipo;

public class Perro extends Animal{
	protected tipo tipo1;
	
	

	/**
	 * Contructor para rellenar
	 * @param nombre
	 * @param raza
	 * @param edad
	 */
	public Perro(String nombre, String raza, int edad, tipo tipo) {
		super(nombre, raza, edad);
		
		this.tipo1=tipo;
		
		
	}



	/**
	 * Constructor vacio
	 */
	public Perro() {
		
		
	}
	
}
