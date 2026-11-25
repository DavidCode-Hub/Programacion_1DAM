package agenda_Ej8_Rel1;

public class Contacto {

	
	private int id;
	private String nombre;
	private String numerotlf;
	
	
	//Constructors
	public Contacto(int id, String nombre, String telefono) {
		this.id=id;
		this.nombre=nombre;
		this.numerotlf=telefono;
		
	}
	
	//Constructors
	public Contacto(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumerotlf() {
		return numerotlf;
	}

	public void setNumerotlf(String numerotlf) {
		this.numerotlf = numerotlf;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", numerotlf=" + numerotlf + "]";
	}
	
	//Getters and setters
	
	
}
