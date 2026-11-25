package ejercicios_HashMap_Rel1;

import java.util.HashMap;
import java.util.Scanner;

public class Diccinario_Ej3_Rel3 {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<>();
        
        
        // 20 palabras español - inglés
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        
   
        System.out.print("Introduce una palabra en español: ");
        String palabra = consola.nextLine().toLowerCase();

        if (diccionario.containsKey(palabra)) {
            System.out.println("Traducción: " + diccionario.get(palabra));
        } else {
            System.out.println("Palabra no encontrada en el diccionario.");
        }

        consola.close();

	}

}
