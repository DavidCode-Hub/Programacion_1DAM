package ejercicio_repaso_2;


import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		/*
		 * Evaluacion de numeros pares e impares introducido por teclado y reordenados
		 * en 1 array.
		 */

		System.out.println("Introduce una cantidad de números a evaluar:");

		int cant = consola.nextInt();
		int numeros[] = new int[cant];

		System.out.println("Introduce los números a evaluar:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición [" + i + "]: ");
			numeros[i] = consola.nextInt();
		}

		int pares[] = new int[cant];
		int impares[] = new int[cant];
		int ordenados[] = new int[cant];
		int pospares = 0, posimpares = 0, cantpares = 0, cantimpares = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares[pospares++] = numeros[i];

			} else {
				impares[posimpares++] = numeros[i];

			}
		}
		System.out.println("Numeros pares");
		for (int i = 0; i < pares.length; i++) {
			System.out.print(pares[i] + " ");
		}
		System.out.println();
		System.out.println("Numeros impares");
		for (int i = 0; i < impares.length; i++) {
			System.out.print(impares[i] + " ");
		}
		System.out.println();
		int posnoordenados = 0;

		for (int i = 0; i < pospares; i++) {
			ordenados[posnoordenados] = pares[i];
			posnoordenados++;
		}
		for (int i = 0; i < posimpares; i++) {
			ordenados[posnoordenados] = impares[i];
			posnoordenados++;
		}

		for (int i = 0; i < ordenados.length; i++) {
			System.out.println(ordenados[i] + " ");
		}

		consola.close();
	}

}
