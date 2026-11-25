package apartados;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		String palabra;
		char resultpalabra;

		System.out.println("Introduce la palabra");
		palabra = consola.nextLine().toUpperCase();

		for (int i = 0; i < palabra.length(); i++) {
			resultpalabra = palabra.charAt(i);
			
			System.out.print(resultpalabra+"*");
		}
	}

}
