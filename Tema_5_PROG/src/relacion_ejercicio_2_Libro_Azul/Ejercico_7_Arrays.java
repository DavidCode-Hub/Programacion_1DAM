package relacion_ejercicio_2_Libro_Azul;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercico_7_Arrays {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		/*
		 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
		 * muestre por pantalla separados por espacios. El programa pedirá entonces por
		 * teclado dos valores y a continuación cambiará todas las ocurrencias del
		 * primer valor por el segundo en la lista generada anteriormente. Los números
		 * que se han cambiado deben aparecer entrecomillados.
		 */

		int numero[] = new int[100];

		for (int i = 0; i < numero.length; i++) {
			int numAleatorio = (int) (Math.random() * ((20 - 0) + 1) + 0);

			numero[i] = numAleatorio;
		}
		for (int nummuestra : numero) {
			System.out.print(" " + nummuestra);
		}
		System.out.println();

		// pedida de numeros para reemplazar
		System.out.println("Numero que quiere cambiar (MAXIMO 2 DIGITOS): ");
		int buscado;
		buscado = consola.nextInt();

		int reemplazado;
		System.out.println("Numero por el que quiere reemplazar (MAXIMO 2 DIGITOS): ");
		reemplazado = consola.nextInt();

		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == buscado) {
				numero[i] = reemplazado;
			}
		}
		for (int n : numero) {
			if (n == reemplazado) {
				System.out.print(" '" + n + "'");
			}
			System.out.print(" "+n);
		}

		consola.close();
	}

}
