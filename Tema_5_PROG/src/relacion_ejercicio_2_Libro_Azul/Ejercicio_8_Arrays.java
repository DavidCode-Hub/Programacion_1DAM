package relacion_ejercicio_2_Libro_Azul;

import java.util.Scanner;

public class Ejercicio_8_Arrays {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		/*
		 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
		 * un determinado año y que muestre a continuación un diagrama de barras
		 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
		 * de asteriscos o cualquier otro carácter.
		 */
		int[] temperatura = new int[12]; // De 12 porque es de 12 meses.

		System.out.println("Introduce la temperatura por mes correspondiendo 1 a ENERO:");

		String[] meses = { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE",
				"OCTUBRE", "NOVIEMBRE", "DICIEMBRE" };

		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Introduce Temperatura de " + meses[i] + " : ");
			
			int numAleatorio = (int) (Math.random() * ((45 - 15) + 1) + 15);
			temperatura[i] = numAleatorio;
			
			System.out.println(temperatura[i]);

		}

		int j = 0;
		for (int n : temperatura) {

			System.out.println("\n El mes de: " + meses[j]);

			for (int i = 0; i < n; i++) {
				System.out.print("*");

			}
			System.out.println(" " + temperatura[j]);
			j++;

		}
		System.out.println();

	}

}
