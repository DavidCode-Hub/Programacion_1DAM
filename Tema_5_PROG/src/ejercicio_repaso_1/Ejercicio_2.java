package ejercicio_repaso_1;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		/*
		 * Realiza un programa cuyo objetivo sea obtener la nota de los alumnos de una
		 * clase, calcular la nota media y obtener las notas superiores e inferiores a
		 * la media. El número de alumnos se introduce por teclado. Utilizaremos un
		 * array para contener las notas de los alumnos. Obtiene la media y muéstrala.
		 * Genera dos arrays de tamaño igual al número de alumnos introducidos. En el
		 * primer array volcarás las notas superiores a la media y en el segundo array
		 * volcarás las notas inferiores a la media. (Las posiciones que queden libres
		 * se completan con 0) Visualiza las notas superiores a la media y las notas
		 * inferiores a la media. (Se visualizarán las notas que no sean 0)
		 */
		double sumanotalum = 0, medianotas = 0;

		System.out.println("Introduce la cantidad de notas a introducir:");
		int cant = consola.nextInt();

		double[] notasalum = new double[cant];

		System.out.println("Introduce las notas de " + cant + " alumnos:");

		for (int i = 0; i < notasalum.length; i++) {
			System.out.println("Nota: " + i);
			notasalum[i] = consola.nextDouble();

			sumanotalum += notasalum[i];
		}
		medianotas = sumanotalum / cant;

		System.out.println("La nota media de los alumnos es: " + medianotas);

		double[] notasuper = new double[cant];
		double[] notainfer = new double[cant];
		int possuper = 0, posinfer = 0;

		for (int i = 0; i < cant; i++) {

			if (notasalum[i] >= medianotas) {
				notasuper[possuper] = notasalum[i];
				possuper++;

			} else if (notasalum[i] < medianotas) {
				notainfer[posinfer] = notasalum[i];
				posinfer++; // 6
			}
		}

		System.out.println("Empieza en " + possuper);
		for (int i = possuper; i < notasuper.length; i++) {
			notasuper[i] = 0;

		}

		System.out.println("Empieza en " + posinfer);
		System.out.println("Nota inferior");
		System.out.println();
		for (int i = posinfer; i < notainfer.length; i++) {
			notainfer[i] = 0;

		}
		System.out.println("Nota inferior");
		for (int i = 0; i < notainfer.length; i++) {

			if (notainfer[i] != 0) {
				System.out.println(notainfer[i]);
			}

		}

		System.out.println("Nota superior");
		for (int i = 0; i < notasuper.length; i++) {

			if (notasuper[i] != 0) {
				System.out.println(notasuper[i]);
			}

		}

		consola.close();
	}

}
