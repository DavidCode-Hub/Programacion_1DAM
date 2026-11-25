package ejercicio_libro_pajarito;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_Apart6_ejer4 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		// Pedimos variables para calcular el máximo

		System.out.println("Introduce la cantidad del array:");
		int cant = consola.nextInt();

		int[] num1 = new int[cant];

		// Recorremos el array para poder introducir los numeros aleatorios

		for (int i = 0; i < num1.length; i++) {
			int numAleatorio = (int) (Math.random() * ((20 - 0) + 1) + 0);

			num1[i] = numAleatorio;
		}

		// Mostrar por pantalla el mensaje de los números.

		int nummax = maximo(num1);

		System.out.println("El numero máximo es: " + nummax);

		consola.close();
	}

	/**
	 * Devolver el nmumero más grande del array
	 * 
	 * @param num1
	 * @return
	 */

	public static int maximo(int num1[]) {
		int max;
		max = num1[0];

		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < num1.length; i++) {
			if (max < num1[i]) {
				max = num1[i];
			}
		}

		return max;

	}

}
