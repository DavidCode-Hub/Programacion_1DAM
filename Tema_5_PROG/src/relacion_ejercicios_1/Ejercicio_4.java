package relacion_ejercicios_1;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);

		String[][] palabra = new String[3][2];
		int numero;
		String medpalabra = "";

		for (int i = 0; i < palabra.length; i++) {
			for (int j = 0; j < palabra[i].length; j++) {
				System.out.println("Introduce el valor de la fila [" + (i) + "]" + " y de la columna[" + (j) + "]");
				palabra[i][j] = consola.nextLine();

			}

		}
		for (int i = 0; i < palabra.length; i++) {
			for (int j = 0; j < palabra[i].length; j++) {

				if (palabra[i][j].length() > medpalabra.length()) {
					medpalabra = palabra[i][j];
				}
			}
		} // fin primer for
		System.out.println("La palabra más larga es: " + medpalabra);

		consola.close();

	}

}
