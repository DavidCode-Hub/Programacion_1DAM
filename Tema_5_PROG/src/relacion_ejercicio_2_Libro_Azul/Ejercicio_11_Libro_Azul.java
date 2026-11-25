package relacion_ejercicio_2_Libro_Azul;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_11_Libro_Azul {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		/*
		 * Realiza un programa que pida 10 números por teclado y que los almacene en un
		 * array. A continuación se mostrará el contenido de ese array junto al índice
		 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
		 * primos a las primeras posiciones, desplazando el resto de números (los que no
		 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
		 * el array resultante.
		 */

		int numero[] = new int[10];

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Introduce el numero " + (i + 1) + " : ");
			numero[i] = consola.nextInt();

		}
		System.out.printf("Indice   Numero");
		int indice = 0;
		for (int i = 0; i < numero.length; i++) {
			System.out.printf("\n%2s %10s", indice, numero[i]);
			indice++;
		}
		int cont = 0;
		int k = 0;
		int j = 9;
		for (int n : numero) {
			for (int i = 2; i > Math.sqrt(n); i++) {
				if (n % i == 0) {
					cont++;
					if (cont >= 2) {
						break;
					}numero[j] = n;
					j--;
					
				} else {
					numero[k] = n;
					k++;
				}

			}
		}for (int i = 0; i < numero.length; i++) {
			System.out.printf("\n%2s %10s", indice, numero[i]);
		}

	}

}
