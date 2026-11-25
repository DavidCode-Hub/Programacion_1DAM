package animal_Ej2_Rel1;

public class Caballo extends Animal{
	
	protected String Raza;
	
	public Caballo(String nombre, String tipo_alimentación, int edad, String raza) {
		super(nombre, tipo_alimentación, edad);
		this.Raza=raza;
		
	}

	public Caballo() {
		super();
		
	}
	
	
	public void hacerSonido() {
		super.hacerSonido();
		System.out.println("Brrr Anuel");
	}
}
