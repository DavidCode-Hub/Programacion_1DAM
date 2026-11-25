package ejercicio_Clase_String;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		// Declaramos variables
		String frase;

		do {

			// Pedimos la frase a evaluar posteriormente
			System.out.println(
					"Introduce al menos 15 caracteres en una frase.\n Los espacios entre palabras debe ser de 1 solo");
			frase = consola.nextLine();

			if (frase.length() < 15) {
				System.out.println("La frase es demasiado corta, debe introducir otra.");
			}

		} while (frase.length() < 15);

		String[] palabras = frase.split(" "); // El ".split()" escribe en un array (metodo de salida) un
												// conjunto de palabras hasta que encuentra un espacio

		System.out.println("La frase es: ");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}

		String primerapalabra = palabras[0]; // Paso la primera palabra del array a un string "temporal"
		

		System.out.println("La primera palabra es: ");
		System.out.println(palabras[0]); //Imprimo la primera palabra para observar que no es ningun espacio
		

		String resultante = frase.concat(" "+primerapalabra); // Concatenaria la frase y daria de resultante un string

		System.out.println("La frase resultante es: " + resultante); // Imprimo la frase resultante

	}

}
