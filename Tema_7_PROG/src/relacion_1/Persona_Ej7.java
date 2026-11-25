package relacion_1;

public class Persona_Ej7 {

	// Constantes
	private final char SEXO_DEF = 'H';
	private final int INFRAPESO = -1;
	private final int PESOIDEAL = 0;
	private final int SOBREPESO = 1;

	// Atributos variables
	private String nombre;
	private int edad;
	private char sexo;
	private int peso;
	private double altura;

	// Constructor vacio

	public Persona_Ej7() {
		
		this("Sin Nombre", 0, 'X', 0, 0.0);
		
	}
	
	
	// Constructor nombre, sexo y altura

	public Persona_Ej7(String nombre, char sexo, double altura) {

		this(nombre, 0, sexo, 0, altura);
	}

	// Constructor Nombre, Edad, Sexo
	public Persona_Ej7(String nombre, int edad, char sexo) {

		this(nombre, edad, sexo, 0, 0.0);
	}

	// Constructor Nombre,Edad, Sexo, Peso, Altura
	public Persona_Ej7(String nombre, int edad, char sexo, int peso, double altura) {

		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.sexo = comprobarsexo(sexo);
		
		
		this.peso=peso;
		
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = comprobarsexo(sexo);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	/**
	 * Evalua y calcula el tipo de peso que tiene una persona
	 * @param peso Parametro pasado por constructor para calcular y evaluar
	 * @return int
	 */
	public int calcularIMC(int peso) {
		int a = 0;
		if ((peso / (Math.pow(altura, 2)) < 20)) {
			a = INFRAPESO;

		} else if ((peso / (Math.pow(altura, 2)) >= 20) && (peso / (Math.pow(altura, 2)) <= 25)) {
			a = PESOIDEAL;

		} else if ((peso / (Math.pow(altura, 2)) > 25)) {
			a = SOBREPESO;
		}
		return a;
	}

	/**
	 * Evalua si la edad introducida es mayor a 18.
	 * 
	 * @return boolean
	 */
	public boolean esMayorDeEdad() {

		return getEdad() >= 18; // Comprueba de manera resumida la edad.
	}

	/**
	 * 
	 * @param a Parametro asignado por constructor
	 * @return char
	 */
	public char comprobarsexo(char a) {
		if (a != 'H' && a != 'M') {
			return SEXO_DEF;
		}
		System.out.println("El sexo es " + a); // Comprobar sexo
		return a;
	}

	@Override
	public String toString() {
		return "Persona_Ej7 Nombre=" + nombre + "\nEdad=" + edad + "\nSexo=" + sexo + "\nPeso=" + peso + "\nAltura="
				+ altura;
	}

}
