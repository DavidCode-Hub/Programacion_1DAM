package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int numero ;

		System.out.println("Introduce el numero por teclado (introduce un cero para salir):");
		numero = consola.nextInt();

		while (numero!=0) {
			
			if (numero % 2== 0) {
			System.out.println("El numero introducido es par");

			} else
			System.out.println("El numero introducido es impar");
			
			System.out.println("Introduce el numero por teclado (introduce un cero para salir):");
			numero = consola.nextInt();
		}
		System.out.println("El numero introducido es 0");
		consola.close();
		

	}

}
