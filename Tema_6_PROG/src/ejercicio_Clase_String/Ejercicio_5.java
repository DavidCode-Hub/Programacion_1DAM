package ejercicio_Clase_String;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		// Declaramos variables
		String frase;

		do {

			// Pedimos la frase a evaluar posteriormente
			System.out.println(
					"Introduce al menos 15 caracteres en una frase.\n Los espacios entre palabras debe ser de 1 solo");
			frase = consola.nextLine();
			
			if (frase.length()<15) {
				System.out.println("La frase es demasiado corta, debe introducir otra.");
			}

		} while (frase.length() < 15);
		
		String []palabras=frase.split(" "); //El ".split()" escribe en un array (metodo de salida) un 
											//conjunto de palabras hasta que encuentra un espacio
		
		int contpalabra=palabras.length;
		
		System.out.println("El número de palabras es de: "+contpalabra);
		
		

	}

}
