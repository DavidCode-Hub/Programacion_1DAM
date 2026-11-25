package persona_ordenacion_Ej_Clase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main_Persona_ordenacion {

	public static void main(String[] args) {
		ArrayList<Persona> persona= new ArrayList<Persona>();
		
		persona.add(new Persona("David", "47312045"));
		
		persona.add(new Persona("Ana", "17311234"));
		persona.add(new Persona("David", "27312045"));
		persona.add(new Persona("David", "7312045"));
		persona.add(new Persona("David", "97312045"));
		
		Collections.sort(persona);		

	}

}
