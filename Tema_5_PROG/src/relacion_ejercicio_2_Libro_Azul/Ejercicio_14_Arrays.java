package relacion_ejercicio_2_Libro_Azul;

import java.util.Scanner;

public class Ejercicio_14_Arrays {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida 8 palabras y las almacene en un array. A
		 * continuación, las palabras correspondientes a colores se deben almacenar al
		 * comienzo y las que no son colores a continuación. Puedes utilizar tantos
		 * arrays auxiliares como quieras. Los colores que conoce el programa deben
		 * estar en otro array y son los siguientes: verde, rojo, azul, amarillo,
		 * naranja, rosa, negro, blanco y morado.
		 */
		Scanner consola = new Scanner(System.in);

		String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };

	
		String[] palabras = new String[8];
		String[] soloColores = new String[8];
		String[] noColores = new String[8];

		System.out.println("Introduce 8 palabras:");
		for (int i = 0; i < palabras.length; i++) {
			System.out.print("Palabra [" + (i + 1) + "]: ");
			palabras[i] = consola.nextLine();
		}

		int posColor = 0;
		int posNoColor = 0;

		// se busca la primera palabra en la lista de colores
		for (int i = 0; i < palabras.length; i++) {
			boolean coincidencias=false;
			
			//int coincidencias = 0;

			// comprobamos si la palabra está en la lista de colores
			for (int j = 0; j < colores.length; j++) {
				if (palabras[i].equalsIgnoreCase(colores[j])) {
					
					coincidencias=true;
					//coincidencias++;
				}
			}//Fin For

			if (coincidencias) {
				soloColores[posColor] = palabras[i];
				posColor++ ;
			} else {
				noColores[posNoColor] = palabras[i];
				posNoColor++;
			}
			
		}//fin for 

		// Creamos el array ordenado para juntar los dos anteriores
		String[] ordenadas = new String[8];
		int pos = 0;

		// Primero los colores
		for (int i = 0; i < posColor; i++) {
			
			ordenadas[pos] = soloColores[i];
			pos++;
		}

		// Luego los nocolores
		for (int i = 0; i < posNoColor; i++) {
			
			ordenadas[pos] = noColores[i];
			pos++;
		}

		// Mostrar resultado
		System.out.println("\nPalabras ordenadas (colores primero):");
		for (int i = 0; i < ordenadas.length; i++) {
			System.out.println("Posición " + i + ": " + ordenadas[i]);
		}

		consola.close();
	}
}
