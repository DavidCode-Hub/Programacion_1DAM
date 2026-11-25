package ejercicio_repaso_2;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que muestre y ejecute el siguiente menú: Opción 1:
		 * Rellena de forma aleatoria los elementos de una matriz 4x4. Muestra la matriz
		 * por pantalla.
		 * 
		 * Opción 2: Recorre la matriz y muestra por pantalla los valores que son
		 * mayores a 10. Opción 3: Pídele al usuario que introduzca el número de dos
		 * filas para intercambiarlas entre sí. Muestra el resultado por pantalla.
		 * Opción 4: Pídele al usuario que introduzca el número de dos columnas para
		 * intercambiarlas entre sí. Muestra el resultado por pantalla.
		 */
		Scanner consola = new Scanner(System.in);

		int[][] numeros = new int[4][4];
		int menu;

		System.out.println("___________________________________");
		System.out.println("1.- Rellena de forma aleatoria");
		System.out.println("2.- Recorrer la matriz y muestra los mayores a 10");
		System.out.println("3.- Intercambia 2 filas entre si");
		System.out.println("4.- Intercambia 2 columnas entre si");

		System.out.println("Introduce una opción del menú: (solo con números) ");
		menu = consola.nextInt();

		while (menu > 4 || menu < 0) {
			System.out.println("Debes introducir una opción valida de menú: ");
			menu = consola.nextInt();
			
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				int numAleatorio = (int) (Math.random() * ((500 - 1) + 1) + 1);
				numeros[i][j]=numAleatorio;				
			}
		}
		

		switch (menu) {
		case 1: // Rellena de forma aleatoria
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					System.out.print(numeros[i][j] + " ");
				}
			}
			System.out.println();

			break;

		case 2: // Recorrer la matriz 
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					if (numeros[i][j] > 10) {
						System.out.println("Posición [" + i + "]" + "[" + j + "]" + numeros[i][j]);
					}
				}
			}

			break;
		case 3:
			
			int cambiafila1, cambiafila2;

			int[] aux = new int[4];
			
			System.out.println("Introduce la primera fila");
			cambiafila1 = consola.nextInt();

			System.out.println("Introduce la segunda fila");
			cambiafila2 = consola.nextInt();
			
			
			//Mostramos la matriz.
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					System.out.print(numeros[i][j] + " ");
				}System.out.println();
			}
			
			System.out.println();
			
			for (int i = 0; i < numeros.length; i++) { // Cambiamos de posición con I en la parte de las columnas
				
				aux[i] = numeros[cambiafila1][i];
				
				System.out.println("Array auxiliar" +aux[i]);
				
				numeros[cambiafila1][i] = numeros[cambiafila2][i];

				numeros[cambiafila2][i] = aux[i];
			}
			
			System.out.println();
			
			//Mostramos la matriz cambiada
			System.out.println("Matriz cambiada.");
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					System.out.print(numeros[i][j] + " ");
				}System.out.println();
			}
			

			break;

		case 4:
			System.out.println("Matriz Básica");
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					System.out.print(numeros[i][j] + " ");
				}System.out.println();
			}

			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					if (numeros[i][j] == 0) {
						int numAleatorio = (int) (Math.random() * ((500 - 1) + 1) + 1);
						numeros[i][j] = numAleatorio;
					}
				}
			}
			System.out.println("Matriz cambiada.");
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					System.out.print(numeros[i][j] + " ");
				}System.out.println();
			}

			break;

		default:
			System.out.println("El caso introducido no corresponde con las opción seleccionada:");
			break;
		}

		consola.close();
	}

}
