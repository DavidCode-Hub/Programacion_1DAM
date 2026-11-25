package simulacroExamen_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner consola= new Scanner (System.in);
		HashMap<String, String> idioma= new HashMap<String, String>();
		ArrayList<String>espanol= new ArrayList<String>();
		ArrayList<String> frances= new ArrayList<String>();
		
		idioma.put("es-examen", "Hora y media de estrés");
		idioma.put("es-hola", "Saludo");
		idioma.put("es-adios", "Despedida");
		idioma.put("fr-quiz", "unechose très amusante");
		idioma.put("fr-bonjour", "Buenos días");
		
		String keyespanol="es-", keyfrancesa="fr-", sigES, sigFR;
		
		
		System.out.println("Introduce una palabra en español");
		keyespanol+=consola.nextLine();
		
		System.out.println("Introduce la traduccion de la palabra en español");
		sigES=consola.nextLine();
		
		
		System.out.println("Introduce una palabra en frances");
		keyfrancesa+=consola.nextLine();
		
		System.out.println("Introduce la traduccion de la palabra en francés");
		sigFR=consola.nextLine();
		
		idioma.put(keyespanol, sigES);
		idioma.put(keyfrancesa, sigFR);
		
		
		Iterator<Map.Entry<String, String>> iterator= idioma.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			
			if (entry.getKey().startsWith("es-")) {
				espanol.add(entry.getValue());
				
			}else if (entry.getKey().startsWith("fr-")) {
				frances.add(entry.getValue());
			}
			
		}
		
		System.out.println("Palabras en español"+espanol);
		
		System.out.println("Palabra en frances"+frances);
		
		
		
		
		
		

	}

}
