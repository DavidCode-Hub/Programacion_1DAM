package animal_Ej2_Rel1;

import java.util.ArrayList;

public class Animal {
	protected String Nombre,tipo_alimentación;
	protected int edad;
	
	
	
	
	public Animal(String nombre, String tipo_alimentación, int edad) {
		this.Nombre = nombre;
		this.tipo_alimentación = tipo_alimentación;
		this.edad = edad;
	}
	
	public Animal(){
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo_alimentación() {
		return tipo_alimentación;
	}

	public void setTipo_alimentación(String tipo_alimentación) {
		this.tipo_alimentación = tipo_alimentación;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	protected void hacerSonido() {
		
	}
	
	
	
	
	
}
