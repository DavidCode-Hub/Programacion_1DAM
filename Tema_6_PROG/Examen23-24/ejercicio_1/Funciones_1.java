package ejercicio_1;

import java.util.Scanner;

public class Funciones_1 {

	public static void cargarDatos(int alumnos[], String profesores[], String asignaturas[], Scanner consola) {
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = consola.nextInt();
		}

		for (int i = 0; i < profesores.length; i++) {
			if (alumnos[i] >= 15) {
				consola.nextLine();

				System.out.println("Profesor");

				profesores[i] = consola.nextLine();

				System.out.println("Asignatura");

				asignaturas[i] = consola.nextLine();

			}
		}
	}

	public static void profesores(int alumnos[], String profesores[], String asignaturas[]) {
		for (int i = 0; i < alumnos.length; i++) {
			if (profesores[i] != null) {
				System.out.println("La cantidad de alumnos es: " + alumnos[i] + " el profesor es: " + profesores[i]
						+ " y la asignatura es: " + asignaturas[i]);
			}
		} // Fin for
	}

	public static void redesSeguridad(String profesores[], String asignaturas[]) {
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i].equals("Redes")) {
				System.out.println("Profesor: " + profesores[i]);
			}
			if (asignaturas[i].equals("Seguridad")) {
				System.out.println("Profesor: " + profesores[i]);
			}
		}
	}
}
