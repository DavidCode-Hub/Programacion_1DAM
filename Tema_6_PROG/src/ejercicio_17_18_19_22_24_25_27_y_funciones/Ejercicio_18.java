package ejercicio_17_18_19_22_24_25_27_y_funciones;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		int x, cant, cantpri = 0, cantnoprimo = 0;

		System.out.println(
				"Programa para calcular los números que son primos\n\nDebes introducir la cantidad de números a evaluar:");
		cant = consola.nextInt();

		int[] numerosprimos = new int[cant];
		int[] numerosnoprimos = new int[cant];
		
		int pospri = 0, posnopri = 0; // Posiciones relacionadas con los numeros de los primos "pospri" y posiciones
										// de no primos "posnopri".

		// Funciones.calculodeprimos(x, null, null);

		// En este for vamos a pedir y evaluar los números introducidos por pantalla
		// hasta un máximo de la "cant" que introdujamos.
		for (int i = 0; i < cant; i++) {
			System.out.println("Intoduce los números a evaluar");
			x = consola.nextInt(); // Pedida de números por pantalla para evaluar.

			boolean primo = Funciones.Esprimo(x); // Llamada a función para evaluar

			if (primo) {
				numerosprimos[pospri++] = x; // Almacenaje de números en 2 arrays diferentes.
				cantpri++;
			} else {
				numerosnoprimos[posnopri++] = x;
				cantnoprimo++;
			}

		}

		System.out.println("Los números primos son:");
		for (int k = 0; k < pospri; k++) {
			System.out.println(numerosprimos[k] + " ");
		}

		System.out.println("Los numeros no primos son:");
		for (int k = 0; k < posnopri; k++) {
			System.out.println(numerosnoprimos[k] + " ");
		}
		consola.close();

	}

}
