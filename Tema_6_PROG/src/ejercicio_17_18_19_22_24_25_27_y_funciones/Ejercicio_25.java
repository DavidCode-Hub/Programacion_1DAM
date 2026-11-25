package ejercicio_17_18_19_22_24_25_27_y_funciones;

import java.util.Scanner;

public class Ejercicio_25 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Introduce la cantidad de la tabla:");
		int cant = consola.nextInt();

		int numero[] = new int[cant];

		System.out.println("Introduce el número a buscar:");
		int buscarnum = consola.nextInt();
		
		Funciones.buscarnum(numero, buscarnum);

	}

}
