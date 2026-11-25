package relacion_ejercicios_1;

import java.util.Scanner;

public class Ejercicio_clase_1 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		System.out.println("Introduce la cantidad de notas introducir: ");
		int cant = consola.nextInt();
		consola.nextLine();

		double[] nota = new double[cant];
		String[] alumno = new String[cant];
		double[] notasvolcadas = new double[cant];

		System.out.println("Introduce " + cant + " alumnos: ");

		// Pedir las alumnos y notas por consola

		for (int i = 0; i < nota.length; i++) {
			System.out.print("Alumno " + (i + 1) + " : ");
			alumno[i] = consola.nextLine().toUpperCase();
			
			System.out.print("Introduce la nota del alumno: ");
			nota[i] = consola.nextDouble();
			consola.nextLine();
		}
		
		double notamedia = 0, notatotal = 0; // Declaro el calculo para las notas
		int cantmedia=0;
		int j=0;
		
		
		for (int i = 0; i < notasvolcadas.length; i++) {
			System.out.println(alumno[i]+ " Su nota es: "+nota[i]);
		}
		for (String alum : alumno) {
			
			if (alum.equals("SERGIO")) {
				notasvolcadas[j] = nota[j];
				notamedia += nota[j];
				cantmedia++;
			}

			if (alum.equals("ANDREA")) {
				notasvolcadas[j] = nota[j];
				notamedia += nota[j];
				cantmedia++;
			}

			if (alum.charAt(0) == 'M') {
				notasvolcadas[j] = nota[j];
				notamedia += nota[j];
				cantmedia++;
			}j++;
		}
		
		
			
			
		notatotal = (double) notamedia / cantmedia;
		
		for (int z = 0; z < notasvolcadas.length; z++) {
			System.out.println("Los alumnos son: " + alumno[z] );
			
		}System.out.println("La nota media de Sergio, Andrea y nombre que empieza por 'M' es: "+notatotal);

		consola.close();

	}

}
