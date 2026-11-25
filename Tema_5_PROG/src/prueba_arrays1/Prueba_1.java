package prueba_arrays1;

import java.util.Scanner;

public class Prueba_1 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		String[] nombre = new String[2];

		String name;

		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Introduce un nombre");
			name = consola.nextLine();

			nombre[i] = name; /*
								 * Mete los nombres que le pido por el escanner(name) y lo mete dentro de "I"
								 * que I corresponde a la posición que va "sumando" el for
								 */
		}
		System.out.println("Muestra de los datos");

		for (int i = 0; i < nombre.length; i++) {
			System.out.println("El nombre introducido son:" + nombre[i]);
			
		}

	}

}
