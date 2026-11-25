package ejercicio_Clase_String;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		// Apartado 1

		System.out.println("Devuelve el largo de una palabra:");

		String palabra;
		int medidapalabra;

		System.out.println("Introduce una palabra:");
		palabra = consola.nextLine();

		medidapalabra = palabra.length();

		System.out.println("La medida de la palabra es: " + medidapalabra);
		System.out.println("\n");

		// Apartado 2

		System.out.println(
				"Devolver el caracter de una posición introducida por teclado de una palabra introducida también por teclado.");
		int posicion, evalpos, medidapalabra2;
		String palabra2;
		char caracter = ' ';

		System.out.println("Introduce una palabra:");
		palabra2 = consola.nextLine();

		System.out.println("Indica la posición del caracter a examninar de la palabra.");
		posicion = consola.nextInt();

		medidapalabra2 = palabra2.length();

		if (medidapalabra2 >= posicion) {

		caracter=palabra2.charAt(posicion);
		 
		

		} else {
			System.out.println("Error el número de posición es más largo que la cantidad de caracteres de la palabra.");
		}

		System.out.println("El caracter de la posicón: " + posicion + " es: " + caracter);
		
		//Apartado 3
		
		int posicion1;
		
		
	
	}

}
