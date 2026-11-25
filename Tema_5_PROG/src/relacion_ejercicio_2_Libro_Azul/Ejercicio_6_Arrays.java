package relacion_ejercicio_2_Libro_Azul;

import java.util.Scanner;

public class Ejercicio_6_Arrays {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		/*
		 * Escribe un programa que lea 15 números por teclado y que los almacene en un
		 * array. Rota los elementos de ese array, es decir, el elemento de la posición
		 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
		 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
		 * muestra el contenido del array.
		 */

		int[] numeros = new int[15];
		System.out.println("Introduce 15 números: ");

		// Pedida de numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero " + i + " :");
			numeros[i] = consola.nextInt();
		}

		// Guardamos el último numero
        int ultimo= numeros[14];

        // Desplazamos los demás hacia la derecha
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        // El último pasa a la posición 0
        numeros[0] = ultimo;
			
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
        consola.close();	
		}
		
		
		
		
	}

