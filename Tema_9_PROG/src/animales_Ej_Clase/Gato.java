package animales_Ej_Clase;

public class Gato extends Animal{
	protected tipo tipo1;

	/**
	 * @param nombre
	 * @param raza
	 * @param edad
	 */
	public Gato(String nombre, String raza, int edad, tipo tipo) {
		super(nombre, raza, edad);
		
		this.tipo1=tipo;
		
		
	}
	
}
