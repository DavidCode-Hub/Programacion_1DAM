package animal_Ej2_Rel1;

public class Perro extends Animal{
	
	protected String Raza;

	public Perro() {
		super();
		
	}

	public Perro(String nombre, String tipo_alimentación, int edad, String raza) {
		super(nombre, tipo_alimentación, edad);
		this.Raza=raza;
		
	}
	
	protected void hacerSonido() {
		super.hacerSonido();
		System.out.println("Guau! ");
	}
	
	
	

}
