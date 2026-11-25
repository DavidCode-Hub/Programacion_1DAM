package relacion_1;

public class Persona {

	
	//Atributos
	
	private String nombre;
	private String apellidos;
	private int edad;
	private char sexo;
	
	//Constructor vacio
	
	public Persona() {
		
	}
	
	//Constructor relleno
	
	public Persona(String n, String a, int e, char s) {
		
		this.nombre=n;
		this.apellidos=a;
		this.edad=e;
		this.sexo=s;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
		this.sexo = sexo;
	}
	
	public void saludar(Persona p) {
		System.out.println("Hola "+this.nombre+" Que tal estás?"+p.getNombre());
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
}
