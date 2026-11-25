package prueba_arrays1;

import java.util.Scanner;

public class Copia_ejercicio_14 {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);

		String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };

		String[] palabras = new String[8];
		String[] solocolores = new String[8];
		String[] nocolores = new String[8];
		String[] ordenados = new String[8];

		System.out.println("Introduce 8 palabras:");
		for (int i = 0; i < palabras.length; i++) {
			System.out.print("Palabra [" + (i + 1) + "]: ");
			palabras[i] = consola.nextLine();

		}
		int poscolores = 0;
		int posNOcolores = 0;

		for (int i = 0; i < palabras.length; i++) {
			int coincidencias = 0;
			for (int j = 0; j < colores.length; j++) {
				if (palabras[i].equalsIgnoreCase(colores[j])) {
					coincidencias++;
				}
			}
			if (coincidencias > 0) {
				solocolores[poscolores] = palabras[i];
				poscolores++;
			} else {
				nocolores[posNOcolores] = palabras[i];
				posNOcolores++;
			}
		}
		int posicionordenados = 0;
		for (int i = 0; i < poscolores; i++) {
			ordenados[posicionordenados] = solocolores[i];
			posicionordenados++;
		}
		for (int i = 0; i < posNOcolores; i++) {
			ordenados[posicionordenados] = nocolores[i];
			posicionordenados++;
		}

		for (int i = 0; i < ordenados.length; i++) {
			System.out.println("Palabra [" + (i + 1) + "]: "+ordenados[i]);
		}
		consola.close();
	}

}
