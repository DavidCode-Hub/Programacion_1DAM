package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		System.out.println("Introduce la altura del rectangulo (Minimo 2):");
		int altura = Integer.parseInt(consola.nextLine());
		System.out.println("Introduce el ancho del rectangulo (Minimo 2):");
		int ancho = Integer.parseInt(consola.nextLine());

		for (int i = 0; i < ancho; i++) {
			System.out.print("*");
		}System.out.println();

		for (int fila = 0; fila < altura-2; fila++) {
			for (int columna = 0; columna < 1; columna++) { //columna izq
				System.out.print("*");
				for (int i = 0; i < ancho - 2; i++) {
					System.out.print(" ");
				}
				for (int columnader = 0; columnader < 1 ; columnader++) {//columna der
					System.out.print("*");

				}System.out.println();
			}
			
			
			}for (int i = 0; i < ancho; i++) {
				System.out.print("*");

			}
			
			consola.close();

	}
}
