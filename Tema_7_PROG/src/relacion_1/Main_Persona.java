package relacion_1;

public class Main_Persona {

	public static void main(String[] args) {
		Persona persona1=new Persona();
		
		persona1.setNombre("David");
		persona1.setApellidos("Seva");
		persona1.setEdad(25);
		persona1.setSexo('H');
		
		System.out.println(persona1);
		
		Persona persona2=new Persona("Lucia","Espinosa",24,'M');
				
		persona1.saludar(persona2);
	}

}
