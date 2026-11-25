package apartados;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		String palabra, resultpalabra = "";

		System.out.println("Introduce la palabra");
		palabra = consola.nextLine().toUpperCase();

		for (int i = palabra.length()-1; i >= 0; i--) {
			resultpalabra += palabra.charAt(i);
		}

		System.out.println("El resultado de la palabra es: " + resultpalabra);

	}

}
