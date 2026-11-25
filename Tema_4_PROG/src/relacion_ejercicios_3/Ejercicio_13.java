package relacion_ejercicios_3;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		int aprobados = 0, condicionados = 0, suspensos = 0;

		for (int alumno = 0; alumno <= 5; alumno++) {
			System.out.println("Introduce una nota:");
			int nota = consola.nextInt();

			if (nota > 4) {
				aprobados++;
			}

			else if (nota == 4) {
				condicionados++;
			} else if (nota < 4) {
				suspensos++;
			}
		}
		System.out.println("Los aprobados son: " + aprobados);
		System.out.println("Los condicionados son: " + condicionados);
		System.out.println("Los suspensos son: " + suspensos);
		consola.close();
	}
}
