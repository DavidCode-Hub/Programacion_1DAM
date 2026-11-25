package persona_Ej_Clase;

import java.util.ArrayList;
import java.util.Iterator;

public class Main_Persona {

	public static void main(String[] args) {
		Persona persona1=new Persona("David", 43, "12234567A");
		Persona persona2=new Persona("Seva", 30, "9876543B");
		Persona persona3=new Persona("Juan", 10, "1939579D");
		Persona persona4=new Persona("David", 16, "7223153A");
		
		ArrayList<Persona> listapersonas=new ArrayList<>();
		
		listapersonas.add(persona1);

		listapersonas.add(persona2);

		listapersonas.add(persona3);

		listapersonas.add(persona4);
		
		Iterator<Persona> iterator=listapersonas.iterator();
		
		
		while (iterator.hasNext()) {
			Persona persona = (Persona) iterator.next();
			
			if (persona.getNombre().lastIndexOf("A")!=-1) {
				System.out.println(persona);
				
			}
		}
		iterator=listapersonas.iterator();
		
		while (iterator.hasNext()) {
			Persona persona = (Persona) iterator.next();
			if (persona.getDni().startsWith("7")) {
				System.out.println(persona);
			}
		}
		
		
		
		

	}

}
