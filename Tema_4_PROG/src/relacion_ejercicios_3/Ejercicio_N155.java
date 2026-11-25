package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_N155 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Introduce la altura (Minimo 5):");
		int altura = Integer.parseInt(consola.nextLine());
		System.out.println("Introduce los espacios entre números (Minimo 1):");
		int espacios = Integer.parseInt(consola.nextLine());

		// Fila 1
		System.out.print("*");

		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.print("****");
		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.println("****");
		
		// Fila 2
		System.out.print("*");

		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.print("*   ");
		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.println("*   ");
		
		// Fila 3

		System.out.print("*");

		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.print("****");
		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.println("****");
		
		

		// altura del 5
		for (int fila = 0; fila < altura - 4; fila++) {
			System.out.print("*");
			for (int i = 0; i < espacios; i++) {
				System.out.print(" ");
			}
			System.out.print("   *");
			for (int i = 0; i < espacios; i++) {
				System.out.print(" ");
			}
			System.out.println("   *");
			}
		
		// Fila 1
		System.out.print("*");

		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.print("****");
		for (int i = 0; i < espacios; i++) {
			System.out.print(" ");
		}
		System.out.println("****");
		
		consola.close();
			

		}


	}


