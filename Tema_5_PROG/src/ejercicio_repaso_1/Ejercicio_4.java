package ejercicio_repaso_1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		/*Nos piden crear una matriz de 4×4 rellena con números enteros del 1 al 500 creados de forma aleatoria.
		Se le mostrará al usuario el siguiente menú:
		1. Suma de dos filas
		2. Resta de dos columnas
		3. Eliminar todos los elementos de una fila pedida al usuario (serán números 0)
		4. Sustituir los números 0 de la matriz por un número aleatorio entre 1 y 10*/
		Scanner consola = new Scanner(System.in);

		int[][] numeros = new int[4][4];
		int menu;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				int numAleatorio = (int) (Math.random() * ((500 - 1) + 1) + 1);
			}
		}

		System.out.println("___________________________________");
		System.out.println("1.- Suma de dos filas");
		System.out.println("2.- Resta de dos columnas ");
		System.out.println("3.- Todos los elementos de la fila en 0");
		System.out.println("4.- Sustituir los numeros 0 por numeros aleatorios entre 1 y 10");

		System.out.println("Introduce una opción del menú: (solo con números) ");
		menu = consola.nextInt();

		while (menu > 4 || menu < 0) {
			System.out.println("Debes introducir una opción valida de menú: ");
			menu = consola.nextInt();
		}

		switch (menu) {
		case 1: // Suma de dos filas
			int suma = 0, fila1, fila2;
			
			System.out.println("Introduce el número de la primera fila: ");
			fila1 = consola.nextInt();

			System.out.println("Intreoduce el número de la segunda fila: ");
			fila2 = consola.nextInt();
			
			for (int i = 0; i < numeros.length; i++) {
				suma = numeros[fila1][i] + numeros[fila2][i];
				System.out.println("La suma de las dos filas es: "+ suma);
			}
			
			break;
			
			 
		case 2:        //Resta de dos columnas
			int resta= 0, colum1, colum2;
			
			System.out.println("Introduce el número de la primera columna: ");
			colum1 = consola.nextInt();

			System.out.println("Intreoduce el número de la segunda columna: ");
			colum2 = consola.nextInt();
			
			for (int i = 0; i < numeros.length; i++) {
				resta = numeros[i][colum1] - numeros[i][colum2];
				System.out.println("La suma de las dos filas es: "+ resta);	
			}

			break;
		case 3:
			int filaelim;
			System.out.println("Introduce la fila para puesta a 0");
			filaelim=consola.nextInt();
			
			for (int i = 0; i < numeros.length; i++) { //Cambiamos de posición con I en la parte de las columnas
				numeros[filaelim][i]=0;
			}

			break;
		case 4:
			
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros.length; j++) {
					if (numeros[i][j]==0) {
						int numAleatorio = (int) (Math.random() * ((500 - 1) + 1) + 1);
						numeros[i][j]= numAleatorio;
					}
				}
			}

			break;

		default:
			System.out.println("El caso introducido no corresponde con las opción seleccionada:");
			break;
		}

		consola.close();
	}

}
