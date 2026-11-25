package trabajdoras_Ej2_Rel4;

import java.util.ArrayList;

public class Main_Trabajadora {
	public static void main(String[] args) {
		Persona persona1= new Profesor(40, "Pepito Palote", 15);
		
		Persona persona2= new Administrativo(25, "Ana volez", 8);
		
		
		ArrayList<Persona> listaPersona=new ArrayList<Persona>();
		
		listaPersona.add(persona1);
		listaPersona.add(persona2);
		
		for (int i = 0; i < listaPersona.size(); i++) {
			System.out.println("Persona ["+(i+1)+"]"+listaPersona.get(i));
		}
		
	}
}
