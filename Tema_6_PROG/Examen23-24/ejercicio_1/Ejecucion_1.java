package ejercicio_1;

import java.util.Scanner;

public class Ejecucion_1 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		String profesores[] = new String[4];
		String asignaturas[] = new String[4];
		int alumnos[] = new int[4];

		int opc = consola.nextInt();

		do {
			System.out.println("Menú: 1.-Carga los datos al array\n2.-Visualizar los profesores"
					+ "\n3.-Mostra el profesor de Redes de Seguridad");
			opc = consola.nextInt();

			switch (opc) {
			case 1:

				Funciones_1.cargarDatos(alumnos, profesores, asignaturas, consola);

				break;
			case 2:
				Funciones_1.profesores(alumnos, profesores, asignaturas);
				break;
			case 3:
				Funciones_1.redesSeguridad(profesores, asignaturas);
				break;

			default:
				break;
			}

		} while (opc < 0 || opc > 4);

	}

}
