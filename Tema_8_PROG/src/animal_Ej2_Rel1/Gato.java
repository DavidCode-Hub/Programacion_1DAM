package animal_Ej2_Rel1;

public class Gato extends Animal{
	protected String Raza;
	
	public Gato(String nombre, String tipo_alimentación, int edad, String raza) {
		super(nombre, tipo_alimentación, edad);
		this.Raza=raza;
		
	}

	public Gato() {
		super();
		
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}
	
	protected void hacerSonido() {
		super.hacerSonido();
		System.out.println("Miau!!");
	}
	
	
	
	
}
