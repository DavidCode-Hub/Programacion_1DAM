package animal;

public class Animal {
	private String nombre;
	private String tipo;
	private int edad;
	private float peso;
	private float estatura;
	private String nombre_atraccion;
	private String nombre_pista;
	
	
	/**
	 * 
	 * @param nombre
	 * @param tipo
	 * @param edad
	 * @param peso
	 * @param estatura
	 * @param nombre_atraccion
	 * @param nombre_pista
	 */
	public Animal(String nombre, String tipo, int edad, float peso, float estatura, String nombre_atraccion,
			String nombre_pista) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
		this.nombre_atraccion = nombre_atraccion;
		this.nombre_pista = nombre_pista;
	}
	
	
	public Animal() {
		
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}


	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}


	/**
	 * @return the estatura
	 */
	public float getEstatura() {
		return estatura;
	}


	/**
	 * @param estatura the estatura to set
	 */
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}


	/**
	 * @return the nombre_atraccion
	 */
	public String getNombre_atraccion() {
		return nombre_atraccion;
	}


	/**
	 * @param nombre_atraccion the nombre_atraccion to set
	 */
	public void setNombre_atraccion(String nombre_atraccion) {
		this.nombre_atraccion = nombre_atraccion;
	}


	/**
	 * @return the nombre_pista
	 */
	public String getNombre_pista() {
		return nombre_pista;
	}


	/**
	 * @param nombre_pista the nombre_pista to set
	 */
	public void setNombre_pista(String nombre_pista) {
		this.nombre_pista = nombre_pista;
	}
	
	
	
	
	
	
}
